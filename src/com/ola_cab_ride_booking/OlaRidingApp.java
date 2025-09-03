package ola_cab_ride_booking;


public class OlaRidingApp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		RideRequest ride = new RideRequest();
		DriverAssignment driver = new DriverAssignment();
		FareCalculation fare = new FareCalculation();
		LiveTracking live = new LiveTracking();
		PaymentProcessing payment = new PaymentProcessing();
		RatingSystem rate = new RatingSystem();
		
		ride.start();
		fare.start();
		
		ride.join();
		
		driver.start();   driver.join();
		
		live.start();  live.join();
		
	     payment.start();
	     payment.join();
	     
	     rate.start();
		
		

	}

}
