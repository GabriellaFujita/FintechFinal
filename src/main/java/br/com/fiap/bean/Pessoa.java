package br.com.fiap.bean;
import java.util.Calendar;
import br.com.fiap.util.*;

public class Pessoa {
	private int codigo;
	private String nome;
	private String cpf;
	private Calendar dataNascimento;
	private String email;
	private String senha;


	public Pessoa() {
		super();
	}
	
	public Pessoa(int codigo, String nome, String cpf, Calendar dataNascimento, String email, String senha) {
		this.codigo = codigo;
		setSenha(senha);
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha){
		try {
			this.senha = CriptografiaUtils.criptografar(senha);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@java.lang.Override
	public java.lang.String toString() {
		return "Pessoa{" +
				"codigo=" + codigo +
				", nome=" + nome +
				", cpf=" + cpf +
				", dataNascimento=" + dataNascimento +
				", email=" + email +
				'}';
	}
}
