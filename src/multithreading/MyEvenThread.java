package multithreading;

public class MyEvenThread extends Thread{
    public int number;

    public MyEvenThread(int number) {
        this.number = number;
    }
    public void run(){
        System.out.println("even numbers are:" +number);
    }
}
