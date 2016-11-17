
import java.util.Scanner; // import java.util.Scanner


public class OrderTickets { // create OrderTickets class
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        //write the variables
        String name;
        String show;
        String date;
        int choice;
        int tickets;
        double price;
        double total;
        double tax;
        int selection;


        System.out.print("Welcome to the Cerebral Stage Online Ticket Service!"); // printing welcome message
        System.out.print("\n====================================================");

        System.out.print("\n\nEnter your information to start your ticket order.");
        System.out.print("\n--------------------------------------------------");

        System.out.print("\n\nEnter your first and last name: "); // ask the user to write first and last name
        name = in.nextLine();

        System.out.print("\nEnter the name of the show: "); // ask the user to write the show name
        show = in.nextLine();

        System.out.print("\nEnter the date of the show: "); // ask the user to write the date show
        date = in.nextLine();

        System.out.print("\nSeating Options: "); // printing the options
        System.out.print("\n---------------");

        System.out.print("\nSection 1 - $20.00" +
                "\nSection 2 - $40.00" +
                "\nSection 3 - $60.00");

        System.out.print("\n\nEnter the section number of your choice: "); // ask the user to select an option
        choice = in.nextInt();


        System.out.print("\n\nEnter the number of tickets you want to purchase: "); // ask the user how many ticket
        tickets = in.nextInt();

        // collecting the tax and price to give the total
        selection = choice * tickets;
        price = selection * 20;
        tax = price * 0.11;
        total = price + tax;


        // printing thr cost
        System.out.print("\nTotal Cost");
        System.out.print(("\n----------"));

        System.out.printf("\nPrice:  $%-20.2f", price);
        System.out.printf("\nTax:    $%5.2f", tax);
        System.out.printf("\nTotal:  $%-6.2f", total);

        System.out.print("\n\nPlease print out your " + tickets + " copies of the ticket below.");
        System.out.print("\n---------------------------------------------------");


        // printing the ticket information
        System.out.print("\n\n=====================================================");
        System.out.printf("\n||  Cerebral Stage  ||  Show: %-20s ||" , show);
        System.out.print("\n||                  ||                             ||");
        System.out.printf("\n||     Official     ||  Name: %-20s ||" , name);
        System.out.print("\n||                  ||                             ||");
        System.out.printf("\n||      Online      ||  Date: %-20s ||" , date);
        System.out.print("\n||                  ||                             ||");
        System.out.printf("\n||      Ticket      ||  Section: %-17s ||" , tickets);
        System.out.print("\n=====================================================");

        System.out.print("\n\nEnjoy the show!");
    }
}
