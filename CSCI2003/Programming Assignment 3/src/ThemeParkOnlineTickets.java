// Name: Issa Alkhamees Date Assigned: 2/14
//
// Course: CSCI 2003 42733 Date Due: 2/21
// Instructor: Ms. Greer
//
// File name: ThemeParkOnlineTickets.java
//
// Program Description:  simulate a website that sells theme park tickets.

//import java scanner
import java.util.Scanner;

public class ThemeParkOnlineTickets {
    public static void main (String[] args)
    {
        //non argument constructor
        ThemeParkOrder park1 = new ThemeParkOrder();

        Scanner key = new Scanner(System.in);

        System.out.println("         Welcome! Please complete your ticket order below!");
        System.out.println("=================================================================");
        System.out.println("\n    +-----------------------+-----------------+-----------------+");
        System.out.println("    |      THEME PARK       |   ADULT TICKET  |   CHILD TICKET  |");
        System.out.println("+---+-----------------------+-----------------+-----------------+");
        System.out.println("| 1 |    Universal Studios  |      $105.00    |      $100.00    |");
        System.out.println("+---+-----------------------+-----------------+-----------------+");
        System.out.println("| 2 |      Magic Kingdom    |      $124.00    |      $118.00    |");
        System.out.println("+---+-----------------------+-----------------+-----------------+");
        System.out.println("| 3 |          Epcot        |      $114.00    |      $108.00    |");
        System.out.println("+---+-----------------------+-----------------+-----------------+");

        // ask the user to choose one option
        System.out.print("\nChoose a Theme Park (1 - 3): ");
        int choose = key.nextInt();

        if (choose == 1)
        {
            // print choose 1 output
            park1.setName("Universal Studios");
            System.out.println("\n\n+-----------------------+-----------------+-----------------+");
            System.out.println("|      THEME PARK       |   ADULT TICKET  |   CHILD TICKET  |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            System.out.println("|    Universal Studios  |      $105.00    |      $100.00    |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            park1.setNumberAdultTicket(105);
            park1.setNumberChildTicket(100);
        }

        if (choose == 2)
        {
            // print choose 2 output
            park1.setName("Magic Kingdom");
            System.out.println("\n\n+-----------------------+-----------------+-----------------+");
            System.out.println("|      THEME PARK       |   ADULT TICKET  |   CHILD TICKET  |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            System.out.println("|     Magic Kingdom     |      $124.00    |      $118.00    |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            park1.setNumberAdultTicket(124);
            park1.setNumberChildTicket(118);
        }

        if (choose == 3)
        {
            // print choose 3 output
            park1.setName("Epcot");
            System.out.println("\n\n+-----------------------+-----------------+-----------------+");
            System.out.println("|      THEME PARK       |   ADULT TICKET  |   CHILD TICKET  |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            System.out.println("|         Epcot         |      $114.00    |      $108.00    |");
            System.out.println("+-----------------------+-----------------+-----------------+");
            park1.setNumberAdultTicket(114);
            park1.setNumberChildTicket(108);
        }

        System.out.print("\nNumber of Adult Tickets: ");
        int adultTicket = key.nextInt();

        System.out.print("Number of Child Tickets: ");
        int childTicket = key.nextInt();

        park1.setPriceAdultTicket(adultTicket);
        park1.setPriceChildTicket(childTicket);

        park1.order();
    }
}

