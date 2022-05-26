package C7_Java;

public class AirlineReservation {
    public boolean[] seats;

    public String bookFlightFirstClass(String name) {
        for (int i = 0; i < seats.length / 2; i++) {
            if (!seats[i]) {
                seats[i] = true;
                System.out.printf("***Welcome to Boyo Air***" +
                        "%n*  FirstClass Ticket    *%" +
                        "n*  Booked Successfully  *%n" +
                        "*  Ticket No ---00%d     *%n" +
                        "*  name-----%5s%n" +
                        "*************************%n", (i + 1), name);
                return "successful";
            }

        }
        System.out.printf("Sorry %s First class is full would you take economy please%n", name);
        return "full";
    }

    public AirlineReservation(int noOfSeats) {
        seats = new boolean[noOfSeats];
    }

    public String bookFlightEconomy(String name) {
        for (int i = seats.length / 2; i < seats.length; i++) {
            if (!seats[i]) {
                seats[i] = true;
                System.out.printf("***Welcome to Boyo Air***" +
                        "%n*  Economy Ticket    *%" +
                        "n*  Booked Successfully  *%n" +
                        "*  Ticket No ---00%d     *%n" +
                        "*  name-----%5s%n" +
                        "*************************%n", (i + 1), name);
                return "successful";
            }
        }
        System.out.printf("Sorry %s Economy is full would you take economy please%n", name);
        return "full";
    }
}
