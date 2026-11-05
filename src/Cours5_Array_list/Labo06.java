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
        ArrayList<Ticket> ticketing = new ArrayList(List.of(startProb, offLine, noNetwork));

        // Display all tickets
        for (Ticket ticket : ticketing) {
            System.out.println(ticket);
        }

        // Search a ticket with its id
        System.out.println("Enter a ticket id: ");
        String searched = sc.nextLine();
        // Check if it's a number before passing it to the method
        if (isNumber(searched)) {
            searchTicket(ticketing, parseInt(searched));
        } else {
            System.out.println("Invalid id");
        }
        sc.close();
    }

    // Search a ticket by its number
    private static void searchTicket(ArrayList<Ticket> queue, int searchedId) {
        if (queue.isEmpty()) {
            System.out.println("No ticket registered");
            return;
        }


        for (int i = 0; i < queue.size(); i++) {
            if (queue.get(i).getId() == searchedId) {
                System.out.println(queue.get(i));
                return;
            }
        }
        System.out.println("No ticket with that id");
    }

    // Check if a String passed is a number
    private static boolean isNumber(String text) {
        if (text.isBlank()) return false;

        for (int i = 0; i < text.length(); i++) {
            if (!Character.isDigit(text.charAt(i))) return false;
        }
        return true;
    }
}
