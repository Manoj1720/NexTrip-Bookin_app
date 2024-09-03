package busreserv;

import java.sql.SQLException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
	String passenger_name;
	int busNo;
	Date date;
	
	Booking(){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your name: ");
		passenger_name= input.next();
		System.out.println("Enter bus no: ");
		busNo=input.nextInt();
		System.out.println("Enter date in dd-mm-yyyy format ");
		String dateinp= input.next();
		SimpleDateFormat dateform= new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateform.parse(dateinp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public boolean isAvailable() throws SQLException {
		BusDAO bdao=new BusDAO();
		BookingDAO bkdao=new BookingDAO();
		
		int capacity=bdao.getcapacity(busNo);
			
		int booked=bkdao.getBookedCount(busNo,date);
		return booked<capacity;
	}

}
