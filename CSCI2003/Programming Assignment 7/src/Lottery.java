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

import javafx.scene.SubScene;

import java.util.Random;    //importing Random class
import java.util.Scanner;   //importing Scanner class

public class Lottery {
    public static void main(String[] args) {

        int quit = 0;
        int loob = 0;
        int lol = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        int[] Player_Numbers = new int[6];
        int[] Winning_Numbers = new int[6];
        double prize = 0;
        double prize2 = 0;

        Random generator = new Random(); // create random object
        Scanner in = new Scanner(System.in); // create scanner object

        System.out.print("Instant Lottery");
        System.out.print("\n===============");

        System.out.println("\n\nOptions: " +
                "\n========" +
                "\n1. Choose Numbers" +
                "\n2. Check Winnings" +
                "\n3. Quit");

        while (quit != 3) {
            try {
                System.out.print("\nEnter choice (1, 2, or 3): ");
                String options = in.next();

                quit = Integer.parseInt(options);

                if (quit <= 0 || quit > 3) {
                    continue;
                }

                if (quit == 1) {
                    System.out.println("\n---------------------------------");

                    System.out.print("\nNumber Options:\n" +
                            "===============\n" +
                            "1. Choose Your Numbers\n" +
                            "2. Quick Pick");
                    flag1 = false;

                    while (flag1) {
                        try {
                            System.out.print("\nEnter choice (1 or 2): ");
                            String choice = in.next();

                            lol = Integer.parseInt(choice);

                            if (lol == 1 || lol == 2) {
                                flag1 = true;
                            }
                        } catch (NumberFormatException exception) {
                            continue;
                        }

                    }

                    if (lol == 1) {
                        System.out.println("\n\nChoose 5 Different Numbers");
                        System.out.println("\n1 2 3 4 5 6 7 8 9 10\n" +
                                "11 12 13 14 15 16 17 18 19 20");

                        int num = 0;
                        String fakeloop[] = new String[6];

                        while (num < 5) {
                            try {
                                System.out.print("Number " + (num + 1) + ": ");
                                fakeloop[num] = in.next();

                                Player_Numbers[num] = Integer.parseInt(fakeloop[num]);

                                if (Player_Numbers[num] <= 0 || Player_Numbers[num] > 20) {
                                    continue;
                                }

                                for (int lol1 = 0; lol1 < num; lol1++) {
                                    if (Player_Numbers[lol1] == Player_Numbers[num]) {
                                        System.out.println("\t      Error! No Duplicates!");
                                        flag2 = false;
                                        break;
                                    }
                                }

                                if (!flag2) {
                                    num++;
                                }
                            }
                            catch (NumberFormatException)
                            {
                                continue;
                            }
                        }

                        System.out.println("\nYour Numbers: " + Player_Numbers[0] + " " + Player_Numbers[1] + " " + Player_Numbers[2] + " " + Player_Numbers[3] + " " + Player_Numbers[4]);
                        System.out.println("\n---------------------------------");

                        System.out.println("\n\nOptions: " +
                                "\n========" +
                                "\n1. Choose Numbers" +
                                "\n2. Check Winnings" +
                                "\n3. Quit");

                    } else if (quit == 2) {
                        int num2 = 0;

                        while (num2 < 5) {
                            int rabd = generator.nextInt(20) + 1;

                            do {
                                for (int i = 0; i < Winning_Numbers.length; i++) {
                                    if (rabd == Winning_Numbers[i]) {
                                        flag3 = true;
                                        break;
                                    } else if (i == num2) {
                                        Winning_Numbers[num2] = rabd;
                                        num2++;
                                        flag3 = true;
                                        break;
                                    }
                                }
                            }

                            while (!flag3);
                        }

                        System.out.printf("\nWinning numbers: %2d %2d %2d %2d %2d", Winning_Numbers[0], Winning_Numbers[1], Winning_Numbers[2], Winning_Numbers[3], Winning_Numbers[4]);
                        System.out.printf("\nPlayer Numbers:  %2d %2d %2d %2d %2d", Player_Numbers[0], Player_Numbers[1], Player_Numbers[2], Player_Numbers[3], Player_Numbers[4]);

                        for (int l = 0; l <= (Player_Numbers.length - 2); l++)
                        {
                            for (int o = 0; o <= (Winning_Numbers.length - 2); o++)
                            {
                                if (Player_Numbers[l] == Winning_Numbers[o]) {
                                    prize += 10;
                                    loob += 1;
                                }
                            }
                        }

                        prize2 = prize2 + prize;

                        System.out.printf("\n\nMatches:%3d", loob);
                        System.out.printf("\nPrize:    $%.2f", prize);
                        System.out.println("\n");
                        System.out.println("---------------------------------");
                        System.out.println("\n\nOptions: " +
                                "\n========" +
                                "\n1. Choose Numbers" +
                                "\n2. Check Winnings" +
                                "\n3. Quit");

                        prize = 0;
                        loob = 0;

                    }

                }
            }

            catch (NumberFormatException e)
            {
                continue;
            }
        }

        System.out.println("\n---------------------------------");
        System.out.printf("\nTotal Prize: $%.2f", prize2);
        System.out.println("\n\nThanks for playing!");
    }
}