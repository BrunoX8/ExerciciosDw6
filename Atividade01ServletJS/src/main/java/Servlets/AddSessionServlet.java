package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import Classes.Session;
import Classes.SessionStorage;

/**
 * Servlet implementation class AddSessionServlet
 */
public class AddSessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddSessionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		int serviceId = Integer.parseInt(request.getParameter("serviceId"));
        String date = request.getParameter("date");
        String time = request.getParameter("time");
        
        Session session = new Session(generateSessionId(), serviceId, date, time);
        SessionStorage sessionStorage = SessionStorage.getInstance();
        sessionStorage.addSession(session);
        
        response.sendRedirect("viewService.jsp?id=" + serviceId);
	}
	
	private int generateSessionId()
	{
		int sessionCode = 0;
		
		sessionCode++;
		
		return sessionCode;
	}

}
