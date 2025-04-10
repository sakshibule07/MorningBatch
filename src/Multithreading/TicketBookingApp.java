package Multithreading;

public class TicketBookingApp extends Thread {
	 
	static TicketBooking obj;
	
	public void run() {
		obj.seatBooking(4);
	}
	public static void main(String[]args) {
		obj = new TicketBooking();
		
		TicketBookingApp th = new TicketBookingApp();
		th.start();
		
		TicketBookingApp th1 = new TicketBookingApp();
		th1.start();
	}
}
