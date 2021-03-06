
// Name: Issa Alkhamees Date Assigned: 2/21
//
// Course: CSCI 2003 42733 Date Due: 2/28
// Instructor: Ms. Greer
//
// File name: PetStore.java
//
// Program Description: simulate the website of a pet store that helps the user choose a dog to adopt.

// import scanner
import java.util.Scanner;

public class PetStore {
   
    public static void main (String[] args)
   {
         //non argument constructor
         Dog pet = new Dog();
         
         Scanner choose = new Scanner(System.in);
         
         System.out.println("Welcome! Select traits to choose a dog!");
         System.out.println("=======================================");
         System.out.println("\n\n======================");
         System.out.println("| AVAILABLE PRICES |");
         System.out.println("======================");
         System.out.println("Small Dog ----- $40.00");
         System.out.println("Medium Dog ---- $60.00");
         System.out.println("Large Dog ----- $80.00");   
         
         System.out.println("\n\nSizes");
         System.out.println("=========");
         System.out.println("1. Small");
         System.out.println("2. Medium");
         System.out.println("3. Large");

         
         System.out.print("\nEnter choice (1, 2, or 3): ");
         int dogSize = choose.nextInt();

         
         System.out.println("\n\nCoats");
         System.out.println("=========");
         System.out.println("1. Short");
         System.out.println("2. Medium");
         System.out.println("3. Long");
         
         System.out.print("\nEnter choice (1, 2, or 3): ");
         int dogCoats = choose.nextInt();

         //creating price value
         double price = 0;

         // choosing the dog details
         if (dogSize == 1)
         {
               price = 40;
               pet.setSize("Small");

               if (dogCoats == 1)
               {
                     System.out.print("Short");
               }

               else if (dogCoats == 2)
               {
                     System.out.print("Medium");
               }
               else if (dogCoats == 3)
               {
                     System.out.print("Long");
               }
         }

         else if (dogSize == 2)
         {
               price = 60;
               pet.setSize("Medium");

               if (dogCoats == 1)
               {
                     System.out.print("Short");
               }

               else if (dogCoats == 2)
               {
                     System.out.print("Long");
               }

               else if (dogCoats == 3)
               {
                     System.out.print("Long");
               }
         }

         else if (dogSize == 3)
         {
               price = 80;
               pet.setSize("Large");

               if (dogCoats == 1)
               {
                     System.out.print("Short");
               }

               else if (dogCoats == 2)
               {
                     System.out.print("Long");
               }

               else if (dogCoats == 3)
               {
                     System.out.print("Long");
               }
         }

         System.out.print("\n\nBased on your responses, we suggest a " + pet.getBreed() + " !");
         System.out.printf("\nWould you like to adopt a "+pet.getBreed()+" for $%.2f? (y/n): ",price);
         String adoptDog = choose.next();

         // print the price
         if (adoptDog.equals("y"))
         {
               System.out.printf("\n\nBreed:%21s",pet.getBreed());
               System.out.println("\n---------------------------");
               System.out.printf("Subtotal:%13s%4.2f","$",price);
               System.out.printf("\nTax:%18s%5.2f","$",price*0.11);
               System.out.printf("\nTotal:%16s%.2f","$",price+(price*0.11));
               System.out.println("\n\nPlease come again!");
         }

         else if (adoptDog.equals("n"))
         {
               System.out.println("\nPlease come again!");
         }
   }   
}
