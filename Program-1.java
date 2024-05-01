class Counter {
    private int count = 0;

    // Method to increment the count value
    public synchronized void increment() {
        count++;
    }

    // Method to get the current count value
    public synchronized int getCount() {
        return count;
    }
}

class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}

public class Program-1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("My Name Is Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");
        // Creating a shared Counter object
        Counter counter = new Counter();

        // Creating multiple threads
        CounterThread thread1 = new CounterThread(counter);
        CounterThread thread2 = new CounterThread(counter);
        CounterThread thread3 = new CounterThread(counter);

        // Starting the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Waiting for all threads to finish
        thread1.join();
        thread2.join();
        thread3.join();

        // Displaying the final count value
        System.out.println("Final Count: " + counter.getCount());
    }
}
