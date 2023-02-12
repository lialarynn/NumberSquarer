package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.NumberSquared;

@WebServlet("/getNumberServlet")
public class getNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public getNumberServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userNumbers = request.getParameter("userNumber");
		
		NumberSquared userNumber = new NumberSquared(Integer.parseInt(userNumbers));
		
		request.setAttribute("userNumbers", userNumber);
		
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
