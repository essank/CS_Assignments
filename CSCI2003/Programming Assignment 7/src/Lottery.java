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

public class Main {
    public static void main (String[] args)
    {
    
       int qui = 3;
       int sum = 0;
       boolean num = false;
      
      System.out.print("Instant Lottery");
      System.out.print("\n===============");
      
      Random generator = new Random(); // create random object
      Scanner in = new Scanner(System.in); // create scanner object
      
      
      while(!num)
      {
        System.out.print("\n\nOptions: " +
                "\n========" +
                "\n1. Choose Numbers" +
                "\n2. Check Winnings" +
                "\n3. Quit");
                
        System.out.print("\n\nEnter choice (1, 2, or 3): ");
        int options = in.nextInt();
            
                  
                  while (qui!= 3)
                  {
                    
                    try
                    {
                      
                     
                    }
                      
                    catch (NumberFormatException except)
                      {
                        
                      }
                      
                     
                    finally
                    {
                      
                    }
                  }
      }//while
    }//
}
