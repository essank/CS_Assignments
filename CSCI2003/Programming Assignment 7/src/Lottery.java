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
        System.out.print("Instant Lottery");
        System.out.print("\n===============");
        System.out.print("\n\nOptions:" +
                "\n========" +
                "\n1. Choose Numbers" +
                "\n2. Check Winnings" +
                "\n3. Quit");

        Random generator = new Random(); // create random object
        Scanner in = new Scanner(System.in); // create scanner object

        System.out.print("\n\nEnter choice (1, 2, or 3):");
        int choice = in.nextInt();

        System.out.print("\n---------------------------------");

        System.out.print("\nNumber Options:" +
                "\n===============" +
                "\n1. Choose Your Numbers" +
                "\n2. Quick Pick");

        System.out.print("\n\nEnter choice (1 or 2):");
        int options = in.nextInt();

    }
}
