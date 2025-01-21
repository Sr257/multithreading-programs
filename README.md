# multithreading-programs
multithreading-programs using java
--------------------------

#Thread: 
-A lightweight unit of execution within a program

#Concurrency: 
-Basically multiple threads executing simultanously to execute multiple threads

Multithreading: Is an ability of a program which execute multiple parts / threads concurrently within a single application/program.
Eg: Zoom (connecting, communication, sharing screen, taking remote, annotations.. etc)

Lifecycle:
----------
New - Thread object is going to create
Runnable - Thread is ready to runnable
Running - Thread is executing currently.
Wait/Blocked- Thread is temporarly suspended for waiting or blocked state.
Terminated- When thread is destroyed or stopped.

#How to create a thread in Java:
1. By extending Thread class,
Eg:
   class MyFirstThread extends Thread {
    @Override
	public void run() {
	System.out.println("My First Thread is running...");
	}
   }
    class MySecondThread extends Thread {
    @Override
	public void run() {
	System.out.println("My Second Thread is running...");
	}
   } 
   
   public class Main {
  public static void main(String args[])){ // Main Thread
  System.out.println("Thread is executing"+Threads.currentThread());
 MyFirstThread firstThread = new MyFirstThread(); //2nd Thread
 System.out.println("Thread is executing"+firstThread.currentThread());
 firstThread.start(); // new
 
 MySecondThread secondThread = new MySecondThread(); //3rd Thread
 System.out.println("Thread is executing"+Thread.currentThread());
 secondThread.start();  //new
}  
}
2. By implementing Runnable interface.

Eg:
class FirstThread implements Runnable {
 @Override
 public void run() {
 System.out.println("My Thread is executing");
 }
}

public class Main {
 public static void main(String args[]) {
 Thread firstThread = new Thread(new MyFirstThread());
 firstThread.start();

 }
}
for loop

HW:
Q. Print odd and even numbers from 0 to 50 using multithreading.


Q. How to prevent any thread?
Ans: Using the synchronized block we can prevent the multiple threads in java. Basically synchronized block is creating lock and unlock mechanism to access the shared resources (variable, object... etc).

Preventing Race condition:
When multiple threads access and modify shared resources concurrently, an unexpected behaviour will ouucur.

Eg:
  public class Counter {
   private count = 0;
   
   public synchronized void increment() {
   count++;
   }  
  }
Note: We can make threadsafe(Only one thread is allowed at a time) object using synchronized block.













