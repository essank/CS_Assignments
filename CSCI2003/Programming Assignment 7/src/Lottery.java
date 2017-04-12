// Name: Issa Alkhamees          Date Assigned: 3/6
//
// Course: CSCI 2003 60357       Date Due: 4/13
//
// Instructor: Ms. Greer
//
// File name: Lottery.java
//
// Program Description: allowed to play as many times as they want,
// and once they quit the game, it shows their total winnings for the game.
// The user has 3 options when the game begins: Choose Numbers, Check Winnings, and Quit.

import java.util.Random;    //importing Random class
import java.util.Scanner;   //importing Scanner class

public class Lottery {
    public static void main (String[] args)
    {

        int qui = 3;
        int sum = 0;
        boolean num = false;

        System.out.print("Instant Lottery");
        System.out.print("\n===============");

        Random generator = new Random(); // create random object
        Scanner in = new Scanner(System.in); // create scanner object

        int [] Player_Numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int [] Winning_Numbers = {};


        while(!num)
        {
            System.out.println("\n\nOptions: " +
                    "\n========" +
                    "\n1. Choose Numbers" +
                    "\n2. Check Winnings" +
                    "\n3. Quit");

            System.out.print("\nEnter choice (1, 2, or 3): ");
            int options = in.nextInt();

            System.out.println("\n---------------------------------");

            while (options != 3)
            {

                try
                {
                    if (options == 1)
                    {
                        System.out.print("\nNumber Options:\n" +
                                "===============\n" +
                                "1. Choose Your Numbers\n" +
                                "2. Quick Pick");
                        System.out.print("\nEnter choice (1 or 2): ");
                        int choice = in.nextInt();

                        if (choice == 1)
                        {
                            System.out.println("\n\nChoose 5 Different Numbers");
                            System.out.println("\n1 2 3 4 5 6 7 8 9 10\n" +
                                    "11 12 13 14 15 16 17 18 19 20");

                            System.out.print("Number 1: ");
                            int Number1 = in.nextInt();

                            System.out.print("Number 2: ");
                            int Number2 = in.nextInt();

                            System.out.print("Number 3: ");
                            int Number3 = in.nextInt();

                            System.out.print("Number 4: ");
                            int Number4 = in.nextInt();

                            System.out.print("Number 5: ");
                            int Number5 = in.nextInt();

                            System.out.printf("\nYour Numbers: %d %d %d %d %d", Number1, Number2,  Number3, Number4, Number5);
                        }

                        else if(choice == 2)
                        {
                            System.out.println("\nYour Numbers: ");
                        }
                    }

                }

                catch (NumberFormatException except)
                {

                }

                finally
                {

                }
            }
        }//while
    }
}