// Name: Issa Alkhamees          Date Assigned: 3/23
//
// Course: CSCI 2003 60357       Date Due: 3/28
//
// Instructor: Ms. Greer
//
// File name: Planner.java
//
// Program Description: The program allows the user to
// add a new event to the planner, display all the events
// currently stored in the planner, or to quit the program.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintWriter;

public class Planner
{
    public static void main(String[] args) throws FileNotFoundException
    {

        // scanner
        Scanner in = new Scanner(System.in);

        System.out.println("Personal Planner");
        System.out.println("================");
        boolean done = true;

        //creating variables
        String date = " ";
        String time = " ";
        String location = " ";
        String event = " ";

        while (done)
        {
            //displaying the options
            System.out.println("\nOptions:");
            System.out.println("========");
            System.out.println("1. Add Event");
            System.out.println("2. Display Events");
            System.out.println("3. Quit");

            //take the input from user
            System.out.print("\nEnter options (1, 2, or 3): ");
            int userOption = in.nextInt();

            System.out.print("\n");

            if (userOption == 1)
            {
                File infile = new File("planner.txt"); // file to read from
                PrintWriter outfile = new PrintWriter("records.txt"); // file to write in
                Scanner imn = new Scanner(infile); // scanner

                while (imn.hasNextLine())
                {
                    outfile.println(imn.nextLine());
                }

                //close open files
                imn.close();
                outfile.close();

                //object to write to the file planner
                PrintWriter outfile1 = new PrintWriter("planner.txt");

                //asking user for input
                System.out.print("Enter date (MM/DD/YY): ");
                in.nextLine();
                date = in.nextLine();

                System.out.print("Enter time (HH:MM): ");
                time = in.nextLine();

                System.out.print("Enter location: ");
                location = in.nextLine();

                System.out.print("Enter event: ");
                event = in.nextLine();

                File k = new File("records.txt");  //file object
                Scanner ifile1 = new Scanner(k);            //object to read from file

                //writing from the temporary file to planner file
                while (ifile1.hasNextLine())
                {
                    outfile.println(ifile1.nextLine());
                }


                outfile.println(date);
                outfile.println(time);
                outfile.println(location);
                outfile.println(event);
                outfile.println(" ");

                //close open files
                outfile.close();
                ifile1.close();
            }

            else if (userOption == 2)
            {

                File outfile2 = new File("planner.txt");   //file object
                Scanner infile = new Scanner(outfile2);  //object to read from file

                if (infile.hasNextLine())
                {

                    while (infile.hasNextLine())
                    {
                        System.out.println(infile.nextLine());
                    }
                }

                else
                {
                    System.out.println("No events added!");
                }

                //close open files
                infile.close();
            }

            else if (userOption == 3)
            {
                //end boolean
                done = false;
            }
        }
    }
}
