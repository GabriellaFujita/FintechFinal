package br.com.fiap.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.bo.*;
import br.com.fiap.dao.*;
import br.com.fiap.bean.*;
import br.com.fiap.exception.*;
import br.com.fiap.factory.*;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private PessoaDAO dao;
	private EmailBO bo;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		dao = DAOFactory.getPessoaDAO();
		bo = new EmailBO();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		Pessoa pessoa = new Pessoa();

		if (dao.validarPessoa(pessoa)) {
			HttpSession sessao = new request.getSession();
			sessao.setAttribute("usuario", email);
			String mensagem = "Login foi realizado!";
			try {
				bo.enviarEmail(email, "Login foi realizado", mensagem);
			} catch (EmailException e) {
				e.printStackTrace();
			} 
		} else {
			request.setAttribute("erro", "Usuario e/ou senha invalida");
		}
		request.getRequestDispatcher("home.jsp").foward(request, response);
	}
}


