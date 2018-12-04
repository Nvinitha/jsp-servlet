package com.cg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.servletone.Bean;

/**
 * Servlet implementation class ServletOne
 */
@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static Map<String, Bean> map = new HashMap<String, Bean>();

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		Bean bean = new Bean();
		RequestDispatcher dispatcher = null;
		String fname = request.getParameter("fname");
	

		String lname = request.getParameter("lname");
	
		String address = request.getParameter("Address");
	
		String password = request.getParameter("password");
		
		boolean isValid = true;
		if (fname.trim().length() < 3) {
			isValid = false;
			request.setAttribute("error1", "please enter valid firstName");
			//out.println("please enter valid FirstName");
			
		}
		else{
			bean.setFname(fname);
		}
		if (lname.trim().length() < 3) {
			isValid = false;

			request.setAttribute("error2","please enter valid lastName");
			//out.println("please enter valid lastName");
			
		}
		else{
			
			bean.setLname(lname);
		}

		if (address.trim().length() < 3) {
			isValid = false;

			//request.setAttribute("error", bean);
			out.println("please enter valid address");
			
		}
		else{
			
			bean.setAddress(address);
		}

		if (password.trim().length() < 3) {
			isValid = false;

			//request.setAttribute("error", bean);
			out.println("please enter valid password");
			
		}
		else{
			
			bean.setPassword(password);
		}
		if (isValid ==  true) {
			HttpSession httpSession = request.getSession();

			map.put(bean.getPassword(), bean);
			httpSession.setAttribute("data", map);
			dispatcher = request.getRequestDispatcher("Success.jsp");
			dispatcher.forward(request, response);

		}
		else{
			dispatcher = request.getRequestDispatcher("index.jsp");
			dispatcher.include(request, response);
		}

	}

}
