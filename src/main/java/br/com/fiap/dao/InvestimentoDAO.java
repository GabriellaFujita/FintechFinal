package br.com.fiap.dao;
import java.util.List;
import br.com.fiap.bean.Investimento;
import br.com.fiap.exception.DBException;

public interface InvestimentoDAO {
	
	    public void cadastrar(Investimento investimento) throws DBException;
	  
	    public List<Investimento> listar();
	    
	    public void atualizar(Investimento investimento) throws DBException;
	  
	    public void remover(int codigo) throws DBException;
	    
	    public Investimento buscarPorId(int codigoBusca);
	
}
