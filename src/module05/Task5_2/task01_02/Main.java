package module05.Task5_2.task01_02;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Reservation reservation = new Reservation(10);
        new Thread(new Customer(1, reservation)).start();
        new Thread(new Customer(2, reservation)).start();
        new Thread(new Customer(4, reservation)).start();
        new Thread(new Customer(3, reservation)).start();
        new Thread(new Customer(1, reservation)).start();
        new Thread(new Customer(2, reservation)).start();
        new Thread(new Customer(4, reservation)).start();
        new Thread(new Customer(3, reservation)).start();
        new Thread(new Customer(1, reservation)).start();
        new Thread(new Customer(2, reservation)).start();
        new Thread(new Customer(4, reservation)).start();
        new Thread(new Customer(3, reservation)).start();

    }
}
