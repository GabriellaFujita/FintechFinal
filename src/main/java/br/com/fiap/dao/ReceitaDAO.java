package br.com.fiap.dao;
import java.util.List;
import br.com.fiap.bean.Receita;
import br.com.fiap.exception.DBException;

public interface ReceitaDAO {
	
	    public void cadastrar(Receita receita) throws DBException;
	  
	    public List<Receita> listar();
	    
	    public void atualizar(Receita receita) throws DBException;
	  
	    public void remover(int codigo) throws DBException;
	    
	    public Receita buscarPorId(int codigoBusca);
	
}