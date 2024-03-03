package module05.Task5_2.task01;

import java.util.ArrayList;

public class Reservation {
    private ArrayList <Boolean> seats = new ArrayList<>();

    public Reservation(int numberOfSeats) {
        for (int i = 0; i < numberOfSeats; i++) {
            seats.add(false);
        }
    }

    public ArrayList<Boolean> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Boolean> seats) {
        this.seats = seats;
    }
}

class Customer implements Runnable {
    private int  id;
    private Reservation reservation;
    private int ticketCount;
    private static int customerCount = 0;

    public Customer(int ticketCount, Reservation reservation) {
        this.reservation = reservation;
        this.ticketCount = ticketCount;
        id = ++customerCount;
    }

    @Override
    public void run() {
        synchronized (reservation.getSeats()) {

            if (reservation.getSeats().stream().filter(seat -> !seat).count() >= ticketCount) {
                int count = ticketCount;
                for (int i = 0; i < reservation.getSeats().size(); i++) {
                    if (count == 0) {
                        break;
                    }
                    if (!reservation.getSeats().get(i)) {
                        reservation.getSeats().set(i, true);
                        count--;
                    }
                }
                System.out.println("Customer " + id + " has reserved " + ticketCount + " tickets");
            } else {
                System.out.println("Customer " + id + " could not reserve " + ticketCount + " tickets");
            }
        }
    }
}
