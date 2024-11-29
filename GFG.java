package minipro;
import java.sql.*;
import java.io.OutputStream;
public abstract class GFG{
	abstract float distance();
}
class GEG extends GFG{
	float distance(String current, String desti) {
		String message;
		
		float distance_km=0;
		
		
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
			
			
			message = "select distance_km from route_data where current_loc = '"+current+"' and destination = '" +desti + "';" ;
			resultSet = statement.executeQuery(message);
			
			
			while (resultSet.next()) {
			distance_km = resultSet.getFloat(1);}
			
			
		
			resultSet.close();
			statement.close();
			connection.close();
		}
		catch (Exception e) {
			System.out.println(e);
		
	} // function ends
		return distance_km;
} // class ends

	@Override
	float distance() {
		// TODO Auto-generated method stub
		return 0;
	}
}