package br.com.fiap.dao;
import java.util.List;
import br.com.fiap.bean.Meta;
import br.com.fiap.exception.DBException;

public interface MetaDAO {
	
	    public void cadastrar(Meta meta) throws DBException;
	  
	    public List<Meta> listar();
	    
	    public void atualizar(Meta meta) throws DBException;
	  
	    public void remover(int codigo) throws DBException;
	    
	    public Meta buscarPorId(int codigoBusca);
	
}