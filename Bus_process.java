package busreserv;

import java.sql.SQLException;
import java.util.*;

public class Bus_process {
	public static void main(String[] args)  {
		
		BusDAO bdao=new BusDAO();
		try {
			bdao.displayBusInfo();
			
			int user_opt=1;
			Scanner input=new Scanner(System.in);
			while(user_opt==1) {
				 System.out.println("Enter 1 to Booking and 2 to exit");
				 user_opt=input.nextInt();
				 if (user_opt==1) {
					 Booking booking=new Booking();
					 if(booking.isAvailable()) {
						 BookingDAO bkdao=new BookingDAO();
						 bkdao.addBooking(booking);
						 System.out.println("Your booking is confirmed");
					 }
					 else
						 System.out.println("Sorry! Bus is full pls try another bus or date");
					 
				 }

			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
			
	}

}
