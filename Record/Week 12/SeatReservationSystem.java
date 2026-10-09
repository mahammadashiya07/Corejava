class SeatReservation {

    private int availableSeats = 5;

    synchronized void reserveSeat(String user, int seats) {

        System.out.println(user + " is trying to reserve "
                + seats + " seat(s).");

        if (seats <= availableSeats) {

            System.out.println("Seats available: " + availableSeats);

            availableSeats = availableSeats - seats;

            System.out.println(user + " successfully reserved "
                    + seats + " seat(s).");

            System.out.println("Remaining seats: "
                    + availableSeats);

        } else {

            System.out.println("Sorry " + user
                    + ", seats are not available.");

            System.out.println("Available seats: "
                    + availableSeats);
        }

        System.out.println();
    }
}

class User extends Thread {

    SeatReservation reservation;
    String userName;
    int seats;

    User(SeatReservation reservation, String userName, int seats) {
        this.reservation = reservation;
        this.userName = userName;
        this.seats = seats;
    }

    public void run() {
        reservation.reserveSeat(userName, seats);
    }
}

public class SeatReservationSystem {

    public static void main(String[] args) {

        SeatReservation reservation = new SeatReservation();

        User user1 = new User(reservation, "Rahul", 2);
        User user2 = new User(reservation, "Priya", 2);
        User user3 = new User(reservation, "Arjun", 2);

        user1.start();
        user2.start();
        user3.start();
    }
}