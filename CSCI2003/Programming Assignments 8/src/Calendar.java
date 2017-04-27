// Name: Issa Alkhamees       Date Assigned: 13 April 2017
//
// Course: CSCI 2003 60357     Date Due: 27 April 2017
//
// Instructor: Ms. Greer
//
// File name: Calendar
//
// Program Description: Create a single month of a calendar based on user input.

//importing the scanner class
import java.util.Scanner;

public class Calendar
{
    public static void main(String[] args)
    {
        System.out.println("Create a Calendar");
        System.out.println("=================");
        System.out.println();

        //creating different variables
        Scanner in = new Scanner(System.in);
        int year = 0;
        int month = 0;
        int day = 0;
        boolean flag = true;
        int nomberOfDays = 0;

        int[][] calendar = new int[6][7]; //initializing two dimensional array with 6 rows and 7 columns

        //chk,phk,dhk = checking variable

        while(flag)
        {
            try
            {
                //input validation of year
                System.out.print("Enter Year: ");
                String chk = in.next();

                // using exception
                year = Integer.parseInt(chk);

                if(year <= 0)
                {
                    continue;
                }

                flag = false;
            }
            catch (NumberFormatException e)
            {
                continue;
            }
        }

        //displaying the months to choose from
        System.out.println();
        System.out.println("Enter Month");
        System.out.println("-----------");
        System.out.println("1. January     5. May         9. September");
        System.out.println("2. February    6. June       10. October");
        System.out.println("3. March       7. July       11. November");
        System.out.println("4. April       8. August     12. December");

        System.out.println();

        flag = true;

        while(flag)
        {
            try
            {
                //input month
                System.out.print("Enter Month (1 - 12): ");
                String dhk = in.next();
                month = Integer.parseInt(dhk);

                if(month > 12 || month < 1)
                {
                    continue;
                }

                flag = false;
            }

            catch (NumberFormatException e)
            {
                continue;
            }
        }

        //showing the user day of the week
        System.out.println();
        System.out.println("Choose Day of Week of the 1st Day");
        System.out.println("---------------------------------");
        System.out.println("1. Sunday       5. Thursday");
        System.out.println("2. Monday       6. Friday");
        System.out.println("3. Tuesday      7. Saturday");
        System.out.println("4. Wednesday");

        System.out.println();

        flag = true;

        while(flag)
        {
            try
            {
                //input day
                System.out.print("Enter Day of the Week (1 - 7): ");
                String phk = in.next();

                day = Integer.parseInt(phk);

                if(day > 7 || day < 1)
                {
                    continue;
                }

                flag = false;
            }

            catch (NumberFormatException e)
            {
                continue;
            }

        }

        //declaring whether it is a leap year or not
        if(month == 2)
        {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            {
                nomberOfDays = 29;
            }

            else
            {
                nomberOfDays = 28;
            }
        }

        //declaring number of days in a month
        else if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
        {
            nomberOfDays = 31;
        }

        else
        {
            nomberOfDays = 30;
        }



        System.out.println();
        System.out.println();

        //displaying the month and year in the calendar according to the user input

        if(month == 1)
        {
            System.out.printf(" January%13d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 2)
        {
            System.out.printf(" February%12d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 3)
        {
            System.out.printf(" March%15d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 4)
        {
            System.out.printf(" April%15d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 5)
        {
            System.out.printf(" May%17d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 6)
        {
            System.out.printf(" June%16d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 7)
        {
            System.out.printf(" July%16d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 8)
        {
            System.out.printf(" August%14d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 9)
        {
            System.out.printf(" September%11d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 10)
        {
            System.out.printf(" October%13d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 11)
        {
            System.out.printf(" November%12d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        else if(month == 12)
        {
            System.out.printf(" December%12d\n", year);
            System.out.println(" --------------------");
            System.out.println("  S  M  T  W  T  F  S");
            System.out.println(" --------------------");
        }

        //displaying the number of spaces before the user input 1st day of week.

        if(day == 2)
        {
            System.out.print("   ");
        }

        else if(day == 3)
        {
            System.out.print("      ");
        }

        else if (day == 4)
        {
            System.out.print("         ");
        }

        else if(day == 5)
        {
            System.out.print("            ");
        }

        else if(day == 6)
        {
            System.out.print("               ");
        }

        else if (day == 7)
        {
            System.out.print("                  ");
        }

        //counter variable
        int k =1;

        //displaying the days in the calendar
        for(int i = 0;i<6;i++)
        {

            for(int j = day-1; j<7; j++)
            {
                calendar[i][j]=k;
                System.out.printf("%3d", calendar[i][j]);
                k++;

                if(k>nomberOfDays)
                {
                    break;   //loop ends when the number of days in the month finishes
                }

                day = 1;
            }
            System.out.println();

            if(k>nomberOfDays)
            {
                break;
            }
        }
    }
}