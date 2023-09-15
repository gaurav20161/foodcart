package food;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Foodcart")
public class Foodcart extends HttpServlet {



	private static final long serialVersionUID = 1L;
    
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		try {
			List<Food> fo = FoodCartDbUtil.getFoodList();

			request.setAttribute("foodItems", fo);
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
		
		
		//REDIRECT TO A DIFFERNET PAGE - view
		
		RequestDispatcher rd = request.getRequestDispatcher("show-food.jsp");
		
	    rd.forward(request, response);
		
		
		
	}


	

}
