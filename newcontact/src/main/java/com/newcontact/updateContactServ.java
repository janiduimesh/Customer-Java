package com.newcontact;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class updateContactServ
 */
@WebServlet("/updateContactServ")
public class updateContactServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String cname = request.getParameter("company");
		
		boolean isTrue;
		
		isTrue= newDButil.updatecontact(id,name, phone, email, address, cname);
		
		request.setAttribute("id", id);
		request.setAttribute("name", name);
		request.setAttribute("phone", phone);
		request.setAttribute("email", email);
		request.setAttribute("address", address);
		request.setAttribute("cname", cname);
		
         if(isTrue==true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("cusAcc.jsp");
			dis.forward(request, response);
		}else {
			
			RequestDispatcher dis2= request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}

	}

}
