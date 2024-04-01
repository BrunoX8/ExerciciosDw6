package Servlets;

import java.io.IOException;
import java.util.ArrayList;

import Classes.Service;
import Classes.ServiceList;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet("/ListServicesServlet")
public class ListServicesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListServicesServlet() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ServiceList servicosLista = new ServiceList();
		servicosLista.criaListaServicos();
		
		//Passa a lista de serviços para a requisição
		request.setAttribute("servicosLista", servicosLista);
		
		//Enviar para a página jsp
		request.getRequestDispatcher("/listServices.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
