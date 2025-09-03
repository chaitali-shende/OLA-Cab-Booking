package ola_cab_ride_booking;

public class FareCalculation extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Calculating estimated fare...");
			Thread.sleep(1500);
			System.out.println("Estimated fare: 135.75 RS.");
		}
		catch(InterruptedException e)
		{
			System.out.println(e.toString());
		}
	}

}

