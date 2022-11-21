package br.com.fiap.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.com.fiap.bean.Pessoa;
import br.com.fiap.exception.DBException;
import br.com.fiap.jdbc.EmpresaDBManager;

public class OraclePessoaDAO implements PessoaDAO {

  private Connection conexao;

  @Override
  public void cadastrar(Pessoa pessoa) throws DBException {
    PreparedStatement stmt = null;

    try {
      conexao = EmpresaDBManager.obterConexao();
      String sql = "INSERT INTO T_PESSOA(CD_PESSOA, NM_PESSOA, NM_CPF, DT_NASCIMENTO, DS_EMAIL, DS_SENHA) VALUES (SQ_PESSOA.NEXTVAL, ?, ?, ?, ?, ?)";
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, pessoa.getNome());
      stmt.setString(2, pessoa.getCpf());
      java.sql.Date data = new java.sql.Date(pessoa.getDataNascimento().getTimeInMillis());
      stmt.setDate(3, data);
      stmt.setString(4, pessoa.getEmail());
      stmt.setString(5, pessoa.getSenha());

      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
      throw new DBException("Erro ao cadastrar.");
    } finally {
      try {
        stmt.close();
        conexao.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public List<Pessoa> listar() {
    // Cria uma lista de pessoas
    List<Pessoa> lista = new ArrayList<Pessoa>();
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      conexao = EmpresaDBManager.obterConexao();
      stmt = conexao.prepareStatement("SELECT * FROM T_PESSOA");
      rs = stmt.executeQuery();

      // Percorre todos os registros encontrados
      while (rs.next()) {
        int codigo = rs.getInt("CD_PESSOA");
        String nome = rs.getString("NM_PESSOA");
        String cpf = rs.getString("NM_CPF");
        java.sql.Date data = rs.getDate("DT_NASCIMENTO");
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTimeInMillis(data.getTime());
        String email = rs.getString("DS_EMAIL");
        String senha = rs.getString("DS_SENHA");

        // Cria um objeto Pessoa com as informa��es encontradas
        Pessoa pessoa = new Pessoa(codigo, nome, cpf, dataNascimento, email, senha);
        // Adiciona a pessoa na lista
        lista.add(pessoa);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        stmt.close();
        rs.close();
        conexao.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return lista;
  }

  @Override
  public void atualizar(Pessoa pessoa) throws DBException {
    PreparedStatement stmt = null;

    try {
      conexao = EmpresaDBManager.obterConexao();
      String sql = "UPDATE T_PESSOA SET NM_PESSOA = ?, NM_CPF = ?, DT_NASCIMENTO = ?, DS_EMAIL = ?, DS_SENHA = ? WHERE CD_PESSOA = ?";
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, pessoa.getNome());
      stmt.setString(2, pessoa.getCpf());
      java.sql.Date data = new java.sql.Date(pessoa.getDataNascimento().getTimeInMillis());
      stmt.setDate(3, data);
      stmt.setString(4, pessoa.getEmail());
      stmt.setString(5, pessoa.getSenha());
      stmt.setInt(6, pessoa.getCodigo());


      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
      throw new DBException("Erro ao atualizar.");
    } finally {
      try {
        stmt.close();
        conexao.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public Boolean validarPessoa(Pessoa pessoa) {
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      conexao = EmpresaDBManager.obterConexao();
      String sql = "SELECT * FROM T_PESSOA WHERE DS_EMAIL = ? AND DS_SENHA = ?";
      stmt = conexao.prepareStatement(sql);
      stmt.setString(1, pessoa.getEmail());
      stmt.setString(2, pessoa.getSenha());
      rs = stmt.executeQuery();

      if (rs.next()) {
        return true;
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        stmt.close();
        rs.close();
        conexao.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return false;
  }

  @Override
  public void remover(int codigo) throws DBException {
    PreparedStatement stmt = null;

    try {
      conexao = EmpresaDBManager.obterConexao();
      String sql = "DELETE FROM T_PESSOA WHERE CD_PESSOA = ?";
      stmt = conexao.prepareStatement(sql);
      stmt.setInt(1, codigo);
      stmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
      throw new DBException("Erro ao remover.");
    } finally {
      try {
        stmt.close();
        conexao.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }

  @Override
  public Pessoa buscarPorId(int codigoBusca) {
    Pessoa pessoa = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;
    try {
      conexao = EmpresaDBManager.obterConexao();
      stmt = conexao.prepareStatement("SELECT * FROM T_PESSOA WHERE CD_PESSOA = ?");
      stmt.setInt(1, codigoBusca);
      rs = stmt.executeQuery();

      if (rs.next()) {
        int codigo = rs.getInt("CD_PESSOA");
        String nome = rs.getString("NM_PESSOA");
        String cpf = rs.getString("NM_CPF");
        java.sql.Date data = rs.getDate("DT_NASCIMENTO");
        Calendar dataNascimento = Calendar.getInstance();
        dataNascimento.setTimeInMillis(data.getTime());
        String email = rs.getString("DS_EMAIL");
        String senha = rs.getString("DS_SENHA");

        pessoa = new Pessoa(codigo, nome, cpf, dataNascimento, email, senha);
      }

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        stmt.close();
        rs.close();
        conexao.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    return pessoa;
  }
}
