package com.webdemo.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.webdemo.service.UserDaoImpl;

/**
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			request.getRequestDispatcher("login.jsp").forward(request, response);
	
	
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			String un = request.getParameter("username");
			String psw = request.getParameter("password");
			
			UserDaoImpl ud = new UserDaoImpl();
			
			if(ud.userLogin(un, psw)){
				
				request.setAttribute("user", un);
				request.getRequestDispatcher("home.jsp").forward(request, response);
			}else{
				
				request.setAttribute("error", "User does not exist");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
	
	
		}

}
