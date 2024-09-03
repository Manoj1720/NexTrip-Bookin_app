package busreserv;

import java.sql.*;

public class DBconnection {
	private static final String url="jdbc:mysql://localhost:3306/bus_reserv";
	private static final String name="root";
	private static final String pass="#mj17";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,name,pass);
	}
//	Connection con=
//	Statement st=con.createStatement();
//	ResultSet rs=st.executeQuery(query);

}
