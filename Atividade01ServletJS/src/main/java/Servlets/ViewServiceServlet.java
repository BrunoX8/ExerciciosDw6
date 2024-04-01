package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import Classes.Service;
import Classes.ServiceList;

/**
 * Servlet implementation class ViewServiceServlet
 */
public class ViewServiceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewServiceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		 ServiceList serviceList = (ServiceList) getServletContext().getAttribute("serviceList");
		
		int serviceId = Integer.parseInt(request.getParameter("id"));
		Service servico = getServicebyID(serviceId);
		
		//Passa para a requisição
		request.setAttribute("servico",servico);
		
		//Enviar para a página jsp
		request.getRequestDispatcher("/viewService.jsp").forward(request, response);
	}
	
	private Service getServicebyID(int serviceId)
	{
	    List<Service> serviceList = (List<Service>) getServletContext().getAttribute("serviceList"); // Exemplo de obtenção da lista de serviços a partir do contexto do servlet
	    
	    // Itera sobre a lista de serviços para encontrar o serviço com o ID fornecido
	    for (Service service : serviceList) {
	    	
	        if (service.getId() == serviceId) {
	            return service; // Retorna o serviço se o ID corresponder
	        }
	    }
	    
	    // Retorna null se nenhum serviço com o ID fornecido for encontrado
	    return null;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
