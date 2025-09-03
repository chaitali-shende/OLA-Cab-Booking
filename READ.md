# OLA Cab Booking Process (Multithreading Simulation)

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

## ✅ Expected Output

