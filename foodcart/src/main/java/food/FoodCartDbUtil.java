package food;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



//MODEL

//Model part of MVC dwsign pattern 


public class FoodCartDbUtil {
	
	
	
	public static List<Food> getFoodList() throws SQLException, ClassNotFoundException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con =  DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "N@saisro1640");
		
		Statement stmt = con.createStatement();
		    
		ResultSet rs=stmt.executeQuery("select * from food");
		
		ArrayList<Food> foodlist = new ArrayList<>();
		
		// rs stores data as rows
		while(rs.next()) {
			
			int code = rs.getInt(1);
			String item = rs.getString(2);
			int price = rs.getInt(3);
			
			Food f = new Food(code, item, price);
			foodlist.add(f);
		}
		
		
		
		return foodlist;
		
		
	}
	
	
	

}
