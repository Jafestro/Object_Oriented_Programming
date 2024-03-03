package module05.Task5_2.task01_02;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Reservation {

    enum SeatState {
        RESERVED, FREE
    }

    private final List<SeatState> seats = new ArrayList<>();

    public Reservation(int numberOfSeats) {
        for (int i = 0; i < numberOfSeats; i++) {
            seats.add(SeatState.FREE);
        }
    }

    public boolean checkIfSeatFree(int count) {
        synchronized (seats) {
            int freeSeats = 0;
            for (SeatState seat : seats) {
                if (seat.equals(SeatState.FREE)) {
                    freeSeats++;
                }
            }
            // Indicates no free seat found
            return freeSeats >= count;
        }
    }

    public void reserveASeat(int ticketCount) {
        synchronized (seats) {
            for (int i = 0; i < ticketCount; i++) {
                int seat = seats.indexOf(SeatState.FREE);
                seats.set(seat, SeatState.RESERVED);
            }
        }
    }
}

class Customer implements Runnable {
    private final int id;
    private final Reservation reservation;
    private final int ticketCount;
    private static final AtomicInteger customerCount = new AtomicInteger(0);

    public Customer(int ticketCount, Reservation reservation) {
        this.reservation = reservation;
        this.ticketCount = ticketCount;
        id = customerCount.incrementAndGet();
    }

    @Override
    public void run() {
        synchronized (reservation) {
            try {
                if (reservation.checkIfSeatFree(ticketCount)) {
                    reservation.reserveASeat(ticketCount);
                    System.out.printf("Customer %s reserved %s seats\n", id, ticketCount);
                } else {
                    System.out.printf("Customer %s couldn't reserve %s seats\n", id, ticketCount);
                }
            } catch (Exception e) {
                System.out.println("Some Error Occurred! Check run method in Customer class!");
            }
        }
    }
}
