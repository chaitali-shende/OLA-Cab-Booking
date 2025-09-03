package ola_cab_ride_booking;

public class LiveTracking extends Thread
{
	public void run() {
        for (int i = 20; i <= 100; i += 20) {
            try {
                System.out.println("Updating ride location... " + i + "% completed");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
        System.out.println("Ride completed!");
    }

}
