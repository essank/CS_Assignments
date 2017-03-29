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

        System.out.print("\n\n" + room1.getNumberOfWalls());
        System.out.print("\nExpected: 3\n");

        System.out.print("\n" + room1.getHeight());
        System.out.print("\nExpected: 10.0\n");

        System.out.print("\n" + room1.getWidth());
        System.out.print("\nExpected: 15.0\n");

        System.out.print("\n" + room1.getArea());
        System.out.print("\nExpected: 450.0\n");

        System.out.print("\n\nTesting toString Method");
        System.out.print("\n-----------------------");
        System.out.print("\n" + room1.toString());

        System.out.print("\n\nTESTING NO-ARGUMENT CONSTRUCTOR");
        System.out.print("\n-------------------------------");
         
        room2.setNumberOfWalls(3);
        System.out.print("\n\n" + room2.getNumberOfWalls());
        System.out.print("\nExpected: 3\n");

        room2.setHeight(10);
        System.out.print("\n" + room2.getHeight());
        System.out.print("\nExpected: 10.0\n");

        room2.setWidth(15);
        System.out.print("\n" + room2.getWidth());
        System.out.print("\nExpected: 15.0\n");

        System.out.print("\n" + room2.getArea());
        System.out.print("\nExpected: 450.0\n");


        System.out.print("\n\nTesting toString Method");
        System.out.print("\n-----------------------");
        System.out.print("\n" + room2.toString());
    }
}
