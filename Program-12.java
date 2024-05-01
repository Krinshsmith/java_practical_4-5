import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class SortThread implements Runnable {
    protected ProgressBar progressBar;
    private List<Integer> numbers;

    public SortThread(List<Integer> numbers, ProgressBar progressBar) {
        this.numbers = numbers;
        this.progressBar = progressBar;
    }

    public void run() {
        sortNumbers();
    }

    public void sortNumbers() {
        Collections.sort(numbers);
        progressBar.setProgress(100);
    }
}

class ProgressBar implements Runnable {
    private int progress;

    public void run() {
        for (int i = 0; i <= 100; i++) {
            progress = i;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 100) {
                System.out.println("Progress: 100%");
            } else {
                System.out.println("Progress: " + progress + "%");
            }
        }
    }

    public void setProgress(int percentage) {
        progress = percentage;
    }

    public int getProgress() {
        return progress;
    }
}

public class Program-12 {
    public static void main(String[] args) {
        System.out.println("My Name IS Krinshsmith Kava");
        System.out.println("Er_no :: 220130318102");

        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 100000; i++) {
            numbers.add(random.nextInt(100000));
        }

        ProgressBar progressBar = new ProgressBar();
        SortThread sortThread = new SortThread(numbers, progressBar);
        Thread t1 = new Thread(sortThread);
        Thread t2 = new Thread(progressBar);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sorting complete!");
    }
}
