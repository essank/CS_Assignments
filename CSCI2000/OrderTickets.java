import java.util.Scanner;


public class OrderTickets {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        String name;
        String show;
        String date;
        int choice;
        int tickets;
        double price;
        double total;
        double tax;
        int selection;


        System.out.print("Welcome to the Cerebral Stage Online Ticket Service!");
        System.out.print("\n====================================================");

        System.out.print("\n\nEnter your information to start your ticket order.");
        System.out.print("\n--------------------------------------------------");

        System.out.print("\n\nEnter your first and last name: ");
        name = in.nextLine();

        System.out.print("\nEnter the name of the show: ");
        show = in.nextLine();

        System.out.print("\nEnter the date of the show: ");
        date = in.nextLine();

        System.out.print("\nSeating Options: ");
        System.out.print("\n---------------");

        System.out.print("\nSection 1 - $20.00" +
                "\nSection 2 - $40.00" +
                "\nSection 3 - $60.00");

        System.out.print("\n\nEnter the section number of your choice: ");
        choice = in.nextInt();


        System.out.print("\n\nEnter the number of tickets you want to purchase: ");
        tickets = in.nextInt();

        selection = choice * tickets;
        price = selection * 20;
        tax = price * 0.11;
        total = price + tax;


        System.out.print("\nTotal Cost");
        System.out.print(("\n----------"));

        System.out.printf("\nPrice:  $%-6.2f", price);
        System.out.printf("\nTax:    $%-6.2f", tax);
        System.out.printf("\nTotal:  $%-6.2f", total);

        System.out.print("\n\nPlease print out your " + tickets + " copies of the ticket below.");
        System.out.print("\n---------------------------------------------------");

        System.out.print("\n\n===================================================");
        System.out.printf("\n||  Cerebral Stage  ||  Show: " + show + "||");
        System.out.print("\n||                  ||                             ||");
        System.out.printf("\n||     Official     ||  Name:  " + name + "||");
        System.out.print("\n||                  ||                             ||");
        System.out.printf("\n||      Online      ||  Date: " + date + "||");
        System.out.print("\n||                  ||                             ||");
        System.out.printf("\n||      Ticket      ||  Section: " + tickets + "");
        System.out.print("\n===================================================");

        System.out.print("\n\nEnjoy the show!");
    }
} 
