package Exercicio05;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class ContadorVisitas
 */
public class ContadorVisitas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContadorVisitas() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession minhaSessao = request.getSession();
		
		Integer contador = (int)minhaSessao.getAttribute("contadorParm");
		
		if(contador == null) {
			contador = 1;
		} else {
			contador++;
		}
		
		minhaSessao.setAttribute("contadorParm",contador);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("contador.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
