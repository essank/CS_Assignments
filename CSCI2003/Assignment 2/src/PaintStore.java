// Name: Issa Alkhamees Date Assigned: 1/31
//
// Course: CSCI 2003 42733 Date Due: 2/10
// Instructor: Ms. Greer
//
// File name: PaintStore.java
//
// Program Description: simulate an online store that sells paint.

import java.util.Scanner;

public class PaintStore
{
    public static void main (String[] args)
    {
        Scanner key = new Scanner(System.in);
        System.out.println("Welcome to the Paint Store!");
        System.out.println("===========================");

        System.out.println("\nStep 1: Choose your paint color");
        System.out.println("-------------------------------");

        System.out.println("purple   green");
        System.out.println("blue     teal");
        System.out.println("yellow   red");

        //user inputs color
        System.out.print("\nEnter a paint color: ");
        String color = key.nextLine();

        System.out.println("\n\nStep 2: Tell us about your room");
        System.out.println("-------------------------------");

        //user enters number of walls to color
        System.out.print("Enter the number of walls in the room: ");
        int numberOfWalls = key.nextInt();

        //user enters the height and width
        System.out.print("Enter the height of one wall: ");
        double height = key.nextDouble();

        System.out.print("Enter the width of one wall: ");
        double width = key.nextDouble();

        System.out.println("\n\nStep 3: Paint needed");
        System.out.println("--------------------");

        //calling the number argument constructor
        Room room3 = new Room(numberOfWalls, height, width);

        //calculating number of cans
        double cans = Math.ceil((room3.getArea()/250));

        //printing the required outputs
        System.out.printf("You need %.1f cans of %s paint to cover %.1f", cans, color,room3.getArea());

        System.out.println("\n\n\nStep 4: Final price");
        System.out.println("-------------------");

        System.out.printf("Subtotal: $%.2f",(room3.getArea()/250)*8.99);
        System.out.printf("\nTax:      $%.2f",((room3.getArea()/250)*8.99)*0.11);
        System.out.printf("\nTotal:    $%.2f",((room3.getArea()/250)*8.99)+ (((room3.getArea()/250)*8.99)*0.11));

        System.out.println("\n\nThank you for shopping with us!");
    }
}