import java.util.Scanner;

class ContinuousCounter implements Runnable {
    private int counter;

    ContinuousCounter() {
        counter = 1;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(counter++);
                Thread.sleep(1000);  // write one value/second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            return;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String   s       = " ";
        Scanner  scanner = new Scanner(System.in);
        Runnable writer  = new ContinuousCounter();
        Thread t         = new Thread(writer);

        t.start();
        while (scanner.nextLine().charAt(0) != 'q');    // wait for the character 'q'
        t.interrupt();
        System.out.println("Program terminated");
    }
}