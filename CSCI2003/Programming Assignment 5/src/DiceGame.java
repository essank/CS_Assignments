// Name: Issa Alkhamees         Date Assigned: 3/16/2017
//
// Course: CSCI 2003 60357      Date Due: 3/23/2017
//
// Instructor: Ms. Greer
//
// File name: DiceGame
//
// Program Description: dice game called “Run for it!”.

import java.util.Random;    //importing Random class
import java.util.Scanner;   //importing Scanner class

public class DiceGame {
    public static void main (String[] args )
    {
        //rules game
        System.out.println("Run For It! - A Dice Game");
        System.out.println("\nRules");
        System.out.println("=====");
        System.out.println("1. 2 players take turns rolling 6 dice.");
        System.out.println("\n2. Get points if roll contains one or more sequences.");
        System.out.println("\n\t1. Sequence must start from 1 and not skip any numbers.");
        System.out.println("\n\t2. Get 5 points for each number in the sequence(s).");
        System.out.println("\n3. Get no points if roll contains no sequences.");
        System.out.println("\n4. First player to get to 100 points wins.");
        System.out.println("\n=======================================");

        Random generator = new Random(); // create random object
        Scanner in = new Scanner(System.in); // create scanner object

        int player = 1;
        int score1 = 0;
        int score2 = 0;

        // start while loop condition
        while (score1 < 100 && score2 < 100)
        {
            // player 1 conditions
            while (player == 1)
            {
                // Enter player information
                System.out.print("\nPlayer " + player + " - Enter R to roll: ");
                String roll = in.nextLine();

                // generate random variables
                int a = generator.nextInt(6) + 1;
                int b = generator.nextInt(6) + 1;
                int c = generator.nextInt(6) + 1;
                int d = generator.nextInt(6) + 1;
                int e = generator.nextInt(6) + 1;
                int f = generator.nextInt(6) + 1;

                String g = a + " " + b + " " + c + " " + d + " " + e + " " + f;
                System.out.println("\nRoll: " + g);

                //creating strings

                String roll1 = "";
                String roll2 = "";
                String roll3 = "";
                String roll4 = "";
                String roll5 = "";
                String roll6 = "";
                int sequence = 0;

                // calculate the roll
                for(int h = 0; h < g.length(); h += 1)
                {
                    if (g.charAt(h) == '1')
                    {
                        roll1 = g.substring(0 , h);
                        break;
                    }
                }

                for(int i = 0; i < roll1.length(); i += 1)
                {
                    if (roll1.charAt(i) == '2')
                    {
                        roll2 = roll1.substring(0, i) + roll1.substring(i+1);
                        score1 += 5;
                        sequence = 1;
                        break;
                    }
                }

                for(int j = 0; j < roll2.length(); j += 1)
                    if (roll2.charAt(j) == '3')
                    {
                        roll3 = roll2.substring(0, j) + roll2.substring(j + 1);
                        score1 += 5;
                        sequence = 2;
                        break;
                    }

                for(int k = 0; k < roll3.length(); k += 1)
                {
                    if (roll3.charAt(k) == '4')
                    {
                        roll4 = roll3.substring(0, k) + roll3.substring(k + 1);
                        score1 += 5;
                        sequence = 3;
                        break;
                    }
                }

                for(int l = 0; l < roll4.length(); l += 1)
                {
                    if (roll4.charAt(l) == '5')
                    {
                        roll5 = roll4.substring(0, l) + roll4.substring(l + 1);
                        score1 += 5;
                        sequence = 4;
                        break;
                    }
                }

                for(int m = 0; m < roll5.length(); m += 1)
                {
                    if (roll5.charAt(m) == '6')
                    {
                        roll6 = roll5.substring(0, m) + roll5.substring(m + 1);
                        score1 += 5;
                        sequence = 5;
                        break;
                    }
                }

                //display the sequences
                if(sequence==0)
                {
                    System.out.println("\nNo Sequence!");
                }

                else if(sequence==1)
                {
                    System.out.println("\nSequence 1: 12");
                }

                else if(sequence==2)
                {
                    System.out.println("\nSequence 1: 123");
                }

                else if(sequence==3)
                {
                    System.out.println("\nSequence 1: 1234");
                }

                else if(sequence==4)
                {
                    System.out.println("\nSequence 1: 12345");
                }

                else if(sequence==5)
                {
                    System.out.println("\nSequence 1: 123456");
                }


                System.out.println("\nPlayer 1 Score: "+score1);
                System.out.println("Player 2 Score: "+score2);
                System.out.println("\n=======================================");
                player = 2;
            }
            //secound player
            while (player == 2)
            {
                // Enter player information
                System.out.print("\nPlayer " + player + " - Enter R to roll: ");
                String roll = in.nextLine();

                // generate random variables
                int a = generator.nextInt(6) + 1;
                int b = generator.nextInt(6) + 1;
                int c = generator.nextInt(6) + 1;
                int d = generator.nextInt(6) + 1;
                int e = generator.nextInt(6) + 1;
                int f = generator.nextInt(6) + 1;

                String g = a + " " + b + " " + c + " " + d + " " + e + " " + f;
                player = 2;
                System.out.println("\nRoll: " + g);

                //creating strings

                String roll1 = "";
                String roll2 = "";
                String roll3 = "";
                String roll4 = "";
                String roll5 = "";
                String roll6 = "";
                int sequence = 0;

                // calculate the roll
                for(int h = 0; h < g.length(); h += 1)
                {
                    if (g.charAt(h) == '1')
                    {
                        roll1 = g.substring(0 , h);
                        break;
                    }
                }

                for(int i = 0; i < roll1.length(); i += 1)
                {
                    if (roll1.charAt(i) == '2')
                    {
                        roll2 = roll1.substring(0, i) + roll1.substring(i+1);
                        score1 += 5;
                        sequence = 1;
                        break;
                    }
                }

                for(int j = 0; j < roll2.length(); j += 1)
                    if (roll2.charAt(j) == '3')
                    {
                        roll3 = roll2.substring(0, j) + roll2.substring(j + 1);
                        score1 += 5;
                        sequence = 2;
                        break;
                    }

                for(int k = 0; k < roll3.length(); k += 1)
                {
                    if (roll3.charAt(k) == '4')
                    {
                        roll4 = roll3.substring(0, k) + roll3.substring(k + 1);
                        score1 += 5;
                        sequence = 3;
                        break;
                    }
                }

                for(int l = 0; l < roll4.length(); l += 1)
                {
                    if (roll4.charAt(l) == '5')
                    {
                        roll5 = roll4.substring(0, l) + roll4.substring(l + 1);
                        score1 += 5;
                        sequence = 4;
                        break;
                    }
                }

                for(int m = 0; m < roll5.length(); m += 1)
                {
                    if (roll5.charAt(m) == '6')
                    {
                        roll6 = roll5.substring(0, m) + roll5.substring(m + 1);
                        score1 += 5;
                        sequence = 5;
                        break;
                    }
                }

                //display the sequences
                if(sequence==0)
                {
                    System.out.println("\nNo Sequence!");
                }

                else if(sequence==1)
                {
                    System.out.println("\nSequence 1: 12");
                }

                else if(sequence==2)
                {
                    System.out.println("\nSequence 1: 123");
                }

                else if(sequence==3)
                {
                    System.out.println("\nSequence 1: 1234");
                }

                else if(sequence==4)
                {
                    System.out.println("\nSequence 1: 12345");
                }

                else if(sequence==5)
                {
                    System.out.println("\nSequence 1: 123456");
                }


                System.out.println("\nPlayer 1 Score: "+score1);
                System.out.println("Player 2 Score: "+score2);
                System.out.println("\n=======================================");
                player = 1;
            }
        }

        //show the game
        if (score1 > score2)
        {
            System.out.println("\t\n       Player 1 Wins!");
            System.out.println("\n=======================================");
        }
        else if (score1 < score2)
        {
            System.out.println("\t\n       Player 2 Wins!");
            System.out.println("\n=======================================");
        }
    }
}
