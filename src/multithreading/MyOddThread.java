package multithreading;

public class MyOddThread extends Thread {
    public int number;

    public MyOddThread(int number) {
        this.number = number;
    }
    public void run(){
        System.out.println("odd numbers are:" +number);
    }
}
