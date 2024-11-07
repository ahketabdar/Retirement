package controller;

import java.io.IOException;

import java.sql.SQLException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.*;
import jakarta.servlet.http.*;


@WebServlet("/Myservlet1")
public class Myservlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
     
    public Myservlet1() {
        super();
    }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//common.retirement person = new  common.retirement();
		String id = request.getParameter("Id");
		try {
			dataConditions.checkID(id);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		//person.id = (id);
		//System.out.println(person.id);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

}
