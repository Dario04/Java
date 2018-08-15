package com.orange.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehiculoServlet
 */
@WebServlet("/VehiculoServlet")
public class VehiculoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VehiculoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	
		PrintWriter pw = response.getWriter();
		pw.write("<h1>hola mundo!</h1>");
		pw.write("<input type='text' name='auto' />");
		pw.write("<input type='submit' name='enviar' />");
		pw.write("</form>");
		VehiculoControlador vc = new VehiculoControlador();
//		Auto a = new Auto();
		System.out.println(request.getParameter("auto"));
//		vc.saveVehicule(new Auto());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
