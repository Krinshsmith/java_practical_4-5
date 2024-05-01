class EvenThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 100; i += 2) {
            System.out.println("Even: " + i);
        }
    }
}

class OddThread implements Runnable {
    public void run() {
        for (int i = 1; i <= 100; i += 2) {
            System.out.println("Odd: " + i);
        }
    }
}

public class Program-11 {
    public static void main(String[] args) {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");

        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        Thread t1 = new Thread(evenThread);
        Thread t2 = new Thread(oddThread);

        t1.start();
        t2.start();
    }
}
