package Cours5_Array_list;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Labo06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create 3 incidents
        Ticket startProb = new Ticket(101, "pc doesn't start");
        Ticket offLine = new Ticket(102, "printer offline");
        Ticket noNetwork = new Ticket(103, "no network access");

        // Create an ArrayList with the incidents
        ArrayList<Ticket> ticketing = new ArrayList<>(List.of(startProb, offLine, noNetwork));

        // Show the number of tickets
        ticketingStats(ticketing);

        // Display all tickets
        showTickets(ticketing);

        // Search a ticket with its id
        System.out.println("Enter a ticket id: ");
        String searched = sc.nextLine();

        // Check if searched is a number before passing it to the method
        if (isNumber(searched)) {
            Ticket found = searchTicket(ticketing, parseInt(searched));
            if (found != null) {
                found.treatingTicket();
            }
        } else {
            System.out.println("Invalid id");
        }

        // Mark the ticket 102 as treated
        searchTicket(ticketing, 102).treatingTicket();

        // Show the number of tickets
        ticketingStats(ticketing);

        // Show the untreated Tickets
        showPendingTickets(ticketing);

        // Delete the first ticket
        ticketing.remove(searchTicket(ticketing, 101));

        // Show the number of tickets
        ticketingStats(ticketing);

        sc.close();
    }

    // Search a ticket by its number
    private static Ticket searchTicket(ArrayList<Ticket> queue, int searchedId) {
        if (queue.isEmpty()) {
            System.out.println("No ticket registered");
            return null;
        }

        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i).getId() == searchedId) {
                Ticket found = queue.get(i);
                return found;
            }
        }
        System.out.println("No ticket with that id");
        return null;
    }

    // Check if a String passed is a number
    private static boolean isNumber(String text) {
        if (text.isBlank()) return false;

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) return false;
        }
        return true;
    }

    // Method to display the tickets and their status
    private static void showTickets(ArrayList<Ticket> ticketing) {
        for (Ticket ticket : ticketing) {
            System.out.println(ticket);
        }
    }

    // Method to display the untreated tickets
    private static void showPendingTickets(ArrayList<Ticket> ticketing) {
        System.out.println("Pending tickets: ");
        for (Ticket ticket : ticketing) {
            if (!ticket.isTreated()) System.out.println(ticket.getId());
        }
    }

    // Method to display the number of Tickets, plus treated and non treated
    private static void ticketingStats(ArrayList<Ticket> ticketing) {
        int untreated = 0;
        int treated = 0;
        int sum = 0;
        for (Ticket ticket : ticketing) {
            sum++;
            if (ticket.isTreated()) treated++;
            else untreated++;
        }
        System.out.printf("%d tickets : %d treated - %d pending%n", sum, treated, untreated);
    }

}
