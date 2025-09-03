package ola_cab_ride_booking;

public class PaymentProcessing extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Processing payment...");
			Thread.sleep(2000);
			System.out.println( "Payment successful!");
		}
		catch(InterruptedException e)
		{
			System.out.println();
		}
	}

}
