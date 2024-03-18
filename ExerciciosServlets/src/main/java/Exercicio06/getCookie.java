package Exercicio06;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class getCookie
 */

@WebServlet("/getMyCookie")
public class getCookie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public getCookie() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		
		String user = null;
		
		if(cookies != null)
		{
			for(Cookie meuCookie:cookies) {
				if(meuCookie.getName().equals("username")) {
					user = meuCookie.getValue();
					break;
				}
			}
		}
		
		request.setAttribute("user",user);
		request.setAttribute("Contador", null);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("contador.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
