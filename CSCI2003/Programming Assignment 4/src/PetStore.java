
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

         
         

   }   
}
