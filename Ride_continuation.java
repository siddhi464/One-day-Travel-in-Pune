package minipro;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Ride_continuation {
	String dest;
	int choice;
	ArrayList<String> loc_options = new ArrayList<>();
	
	Ride_continuation(String destination, int choice) {
		this.dest = destination; 
		this.choice = choice;
	}
	
	ArrayList display() {
		
		String options = "NULL";
		
	   if(choice==1){
			options = "F";
		}
		else if(choice==2) {
			options = "T";
		}

Connection connection = null;
		
		try {
			// below two lines are used for connectivity.
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(
				"jdbc:mysql://root@localhost:3306/mini_project",
				"root@localhost", "savsav06");

			Statement statement;
			statement = connection.createStatement();
			ResultSet resultSet=null;
			String message1 = ("Select destination from route_data where current_loc = '" + dest + "' and Type_Of_Destination = '" + options + "';");
			resultSet = statement.executeQuery(message1);
			
			
			while (resultSet.next()) {
				//System.out.println((resultSet.getString(1)));
				loc_options.add(resultSet.getString(1));
			}
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (Exception e) {
			System.out.println(e);
		
	}
		return loc_options;}
	}

