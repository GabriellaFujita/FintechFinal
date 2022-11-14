package br.com.fiap.dao;
import java.util.List;
import br.com.fiap.bean.Pessoa;
import br.com.fiap.exception.DBException;

public interface PessoaDAO {
	
	    public void cadastrar(Pessoa pessoa) throws DBException;
	  
	    public List<Pessoa> listar();
	    
	    public void atualizar(Pessoa pessoa) throws DBException;
	  
	    public void remover(int codigo) throws DBException;
	    
	    public Pessoa buscarPorId(int codigoBusca);
	
}
