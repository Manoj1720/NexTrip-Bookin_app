package busreserv;

import java.sql.*;
import java.util.Date;

public class BookingDAO {
    public int getBookedCount(int bno,Date date) throws SQLException {
    	String query="select count(passenger_name) from Booking where bus_no=? and  traveldate=?";
    	Connection con=DBconnection.getConnection();
    	PreparedStatement pst=con.prepareStatement(query);
    	
    	java.sql.Date sqldate=new java.sql.Date(date.getTime());
		pst.setInt(1, bno);
		pst.setDate(2, sqldate);
		
		ResultSet rs=pst.executeQuery();
		rs.next();
    	return rs.getInt(1);
    }
    public void addBooking(Booking booking) throws SQLException {
    	String query="insert into Booking values(?,?,?)";
    	Connection con=DBconnection.getConnection();
    	PreparedStatement pst=con.prepareStatement(query);
    	
    	java.sql.Date sqldate=new java.sql.Date(booking.date.getTime());
    	pst.setString(1, booking.passenger_name);
    	pst.setInt(2, booking.busNo);
    	pst.setDate(3, sqldate);
    	
    	pst.executeUpdate();
    	
    }
}
