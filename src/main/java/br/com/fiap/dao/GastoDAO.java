package br.com.fiap.dao;
import java.util.List;
import br.com.fiap.bean.Gasto;
import br.com.fiap.exception.DBException;

public interface GastoDAO {
	
	    public void cadastrar(Gasto gasto) throws DBException;
	  
	    public List<Gasto> listar();
	    
	    public void atualizar(Gasto gasto) throws DBException;
	  
	    public void remover(int codigo) throws DBException;
	    
	    public Gasto buscarPorId(int codigoBusca);
	
}

