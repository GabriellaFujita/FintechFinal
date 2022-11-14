package br.com.fiap.dao;
import java.util.List;
import br.com.fiap.bean.Transacao;
import br.com.fiap.exception.DBException;

public interface TransacaoDAO {
	
	    public void cadastrar(Transacao transacao) throws DBException;
	  
	    public List<Transacao> listar();
	    
	    public void atualizar(Transacao transacao) throws DBException;
	  
	    public void remover(int codigo) throws DBException;
	    
	    public Transacao buscarPorId(int codigoBusca);
	
}