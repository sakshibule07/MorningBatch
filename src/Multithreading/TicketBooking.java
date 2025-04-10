package Multithreading;

public class TicketBooking {

	int totalTk = 10;
	
	  public void seatBooking( int seats) 
	  {
		  
		  if (totalTk >= seats)    //1st condition => 10>=4
		  {
			  System.out.println(seats+"are booked successfully");    //4 seats
			  totalTk -= seats;    //totalTk = totalTk - seats i.e totalTk = 10-4 =>6
			  System.out.println(totalTk+"are remaing");      //6 tickets remaining
		  }
		  else
		  {
			  System.out.println(seats+"not available");
			  System.out.println(totalTk+"are reamining");
		  }
	  }
	  public static void main(String[]args) {
		  TicketBooking obj = new TicketBooking();
		  obj.seatBooking(4);
		  obj.seatBooking(4);
	  }
}
