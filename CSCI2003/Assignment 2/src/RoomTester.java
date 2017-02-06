// Name: Issa Alkhamees Date Assigned: 1/31
//
// Course: CSCI 2003 42733 Date Due: 2/10
// Instructor: Ms. Greer
//
// File name: RoomTester.java
//
// Program Description: simulate an online store that sells paint.

public class RoomTester
{
    public static void main (String[] args)
    {
        // calling argument constructor
        Room room1 = new Room(3, 10, 15);

        //calling the non-argument constructor
        Room room2 = new Room();

        System.out.print("TESTING ARGUMENT CONSTRUCTOR");
        System.out.print("\n----------------------------");

        System.out.println("\n" + room1.getNumberOfWalls());
        System.out.println("\nExpected: 3");

        System.out.println("\n" + room1.getHeight());
        System.out.println("\nExpected: 10.0");

        System.out.println("\n" + room1.getWidth());
        System.out.println("\nExpected: 15.0");

        System.out.println("\n" + room1.getArea());

        System.out.println("\nTesting toString Method");
        System.out.println("\n-----------------------");
        System.out.println("\n" + room1.toString());

        System.out.println("\nTESTING NO-ARGUMENT CONSTRUCTOR");
        System.out.println("\n-------------------------------");

        System.out.println("\n" + room2.getNumberOfWalls());
        System.out.println("\nExpected: 3");

        System.out.println("\n" + room2.getHeight());
        System.out.println("Expected: 10.0");

        System.out.println("\n" + room2.getWidth());
        System.out.println("\nExpected: 15.0");

        System.out.println("\n" + room2.getArea());

        System.out.println("\nTesting toString Method");
        System.out.println("\n-----------------------");
        System.out.println("\n" + room2.toString());
    }
}