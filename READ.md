# OLA Cab Booking Process 
(Multithreading Simulation)

This project simulates the **OLA Cab Booking process** using **Java Multithreading**.  
It demonstrates how multiple tasks in a cab booking system can run in parallel and synchronize at different stages using `Thread`, `sleep()`, and `join()` methods.

---

## 🚖 Features Implemented
1. **RideRequest** – Handles ride request and searches for nearby drivers.  
2. **DriverAssignment** – Assigns a driver after a delay.  
3. **FareCalculation** – Calculates estimated fare asynchronously.  
4. **LiveTracking** – Updates ride location in % until completion.  
5. **PaymentProcessing** – Processes the payment after ride completion.  
6. **RatingSystem** – Collects user rating after payment.  

---

## 🧵 Multithreading Concepts Used
- **Thread Creation** (`extends Thread`)
- **Overriding run() method**
- **Thread Synchronization** (`join()`)
- **Thread.sleep()** for simulating delays
- **Sequential + Parallel execution**

---
**📂 Project Structure**

OlaCabRideBookingProject/
│── src/
│   └── com/cab/ola_cab_ride_booking
                │── RideRequest.java
                │── DriverAssignment.java
                │── FareCalculation.java
                │── LiveTracking.java
                │── PaymentProcessing.java
                │── RatingSystem.java
                │── OlaRidingApp.java
│── README.md

---

## ✅ Expected Output

User requested a ride...

Calculating estimated fare...

Estimated fare: 135.75 RS.

Searching for nearby drivers...

Driver found and assigned!

Updating ride location...20% completed

Updating ride location...40% completed

Updating ride location...60% completed

Updating ride location...80% completed

Updating ride location...100% completed

Ride completed!

Processing payment...

Payment successful!

Requesting user rating...

Give rating for your ride:[1/2/3/4/5]: 5

User rated the ride: 5 star

---

**🔮 Future Enhancements**

Add multiple ride requests handled simultaneously.

Use ExecutorService / ThreadPool instead of manual Thread creation.

Introduce cancellation flow and surge pricing.

Connect with a database to persist rides and payments.

