package ola_cab_ride_booking;

public class RatingSystem extends Thread
{
	 public void run() {
	        try {
	            System.out.println("Requesting user rating...");
	            Thread.sleep(1000);
	            System.out.println("User rated the ride: 5 star");
	        } catch (InterruptedException e) {
	            System.out.println(e);
	        }
	    }

}
