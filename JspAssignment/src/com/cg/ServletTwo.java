package com.cg;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.servletone.Bean;

/**
 * Servlet implementation class ServletTwo
 */
@WebServlet("/ServletTwo")
public class ServletTwo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		HttpSession httpSession = request.getSession();
		// RequestDispatcher dispatcher = null;
		Map<String, Bean> map = (Map<String, Bean>) httpSession
				.getAttribute("data");
		/* out.println(map); */
		/*
		 * out.println(bean.getFname()); out.println(bean.getLname());
		 * out.println(bean.getPassword()); out.println(bean.getAddress());
		 */
		// RequestDispatcher
		// dispatcher=request.getRequestDispatcher("Success.jsp");

		for (Entry<String, Bean> entry : map.entrySet()) {
			String key = entry.getKey();
			Bean value = entry.getValue();
			out.println(key+":"+ value);
			
			out.println("<br/>");
		}

	}

}
