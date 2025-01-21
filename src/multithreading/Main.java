package multithreading;

public class Main {
    public static void main(String[] args){

        int n=50;
        for(int i=1;i<=n;i++) {
            Thread th;
            if (i % 2 == 0) {
                th = new MyEvenThread(i);

            } else {
                th = new MyOddThread(i);


            }
            th.start();

            try {
                th.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
