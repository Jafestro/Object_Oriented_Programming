package module05.Tasks5_1.task01;

class ContinuousOddEvenNumberPrinter implements Runnable {
    private int num;
    private int range;
    private int delayTime;
    private boolean isOdd;

    public ContinuousOddEvenNumberPrinter(boolean isOdd, int range, int delayTime) {
        this.isOdd = isOdd;
        this.range = range;
        this.delayTime = delayTime;
    }

    @Override
    public void run() {
        try {
            if (isOdd) {
                setNum(0);
                while (true) {
                    num += 2;
                    System.out.println("Even Thread: " + (num));
                    if (num == range)
                        break;
                    Thread.sleep(delayTime);
                }
            } else {
                setNum(1);
                while (true) {
                    System.out.println("Odd Thread: " + num);
                    num += 2;
                    if (num > range)
                        break;
                    Thread.sleep(delayTime);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("What in the name of God happened?");
        }
    }

    private void setNum(int num) {
        this.num = num;
    }
}

public class Main {
    public static void main(String[] args) {

        Runnable thread1 = new ContinuousOddEvenNumberPrinter(true, 20, 33);
        Runnable thread2 = new ContinuousOddEvenNumberPrinter(false, 20, 33);

        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Printing complete.");
    }
}
