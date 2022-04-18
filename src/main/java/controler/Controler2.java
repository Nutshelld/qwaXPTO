package controler;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Pessoa;

@WebServlet(urlPatterns = { "/Controler", "/main", "/insert" })
public class Controler2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO con = new DAO();
	Pessoa candidato = new Pessoa();
	
	public Controler2() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getServletPath();
		if (action.equalsIgnoreCase("/main")) {
			candidato(request, response);
			
		} else if (action.equals("/insert")) {
			novoCandidato(request, response);
		} else {
			response.sendRedirect("index.html");
		}
	}

	protected void candidato(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		// response.sendRedirect("contratacao.jsp");
		ArrayList<Pessoa> lista = con.listarCandidato();
		request.setAttribute("candidato", lista);
		RequestDispatcher rd = request.getRequestDispatcher("contratacao.jsp");
		rd.forward(request, response);
	}

	// novoCandidato
	protected void novoCandidato(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// response.sendRedirect("contratacao.jsp");

		getCandidato().setNome(request.getParameter("nome"));
		getCandidato().setSobrenome(request.getParameter("sobrenome"));
		getCandidato().setCpf(request.getParameter("cpf"));
		getCandidato().setDataNascimento(request.getParameter("datadenascimento"));
		getCandidato().setIdade(request.getParameter("idade"));
		getCandidato().setVaga(request.getParameter("vaga"));
		getCandidato().setMaiorIdade(request.getParameter("ÉmaiorDeIdade"));

		/*
		 * pessoa.add(new Pessoa(request.getParameter("nome"),
		 * request.getParameter("sobrenome"), request.getParameter("cpf"),
		 * request.getParameter("datadenascimento"), request.getParameter("idade"),
		 * request.getParameter("ÉmaiorDeIdade"), request.getParameter("vaga")));
		 */

		con.inserirCandidato(candidato);

		// redirencioando
		response.sendRedirect("main");
	}

	public Pessoa getCandidato() {
		return candidato;
	}

}
