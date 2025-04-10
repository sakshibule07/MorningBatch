package Multithreading;

public class TicketBooking1 {
	int totalTk=10;
	
	public synchronized void seatBooking(int seats) 
	{
		if(totalTk >= seats)
		{
			System.out.println(seats+"booked successfully");
			totalTk -= seats;
			System.out.println(totalTk+"remaining");
		}
		else
		{
			System.out.println(seats+"not available");
		}
	}
	public static void main(String[]args)
	{
		TicketBooking obj = new TicketBooking();
		obj.seatBooking(4);
		obj.seatBooking(4);
		
	}
}