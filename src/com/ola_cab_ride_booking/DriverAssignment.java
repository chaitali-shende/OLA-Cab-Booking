package ola_cab_ride_booking;

public class DriverAssignment extends Thread 
{
	 public void run() {
	        try {
	            Thread.sleep(3000); // wait 3 seconds
	            System.out.println("Driver found and assigned!");
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	    }

}
