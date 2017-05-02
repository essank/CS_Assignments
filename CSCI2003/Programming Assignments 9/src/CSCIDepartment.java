// Name: Issa Alkhamees Date Assigned: 4/27
//
// Course: CSCI 2003 42733 Date Due: 5/2
// Instructor: Ms. Greer
//
// File name: CSCIDepartment.java
//
// Program Description: allows teachers to access and/or update course information for the Computer Science Department.

import java.util.Scanner;

public class CSCIDepartment
{
    public static void main (String[] args)
    {
        Course course1 = new Course("Introduction to Programming", "CSCI 2000", 60536, 35);
        Course course2 = new Course("Intermediate Programming", "CSCI 2003", 63972, 34);
        Student student91 = new Student("Issa", 12345);

        Student student1 = new Student();
        boolean flag = true;

        while (flag)
        {
            System.out.println("Course Information Access");
            System.out.println("\n=========================");

            System.out.println("\n\nOptions");
            System.out.println("\n=======");
            System.out.print("\n1. View Available Course Information");
            System.out.print("\n2. View Students Enrolled in Course");
            System.out.print("\n3. Add Student to a Course");
            System.out.print("\n4. View Total Enrollment for Department");
            System.out.print("\n5. Quit");

            System.out.print("\n\nEnter choice (1 - 5): ");

            Scanner in = new Scanner(System.in);
            int ch = in.nextInt();

            if (ch == 1)
            {
                System.out.print("\n\n----------------------------------------------------");
                System.out.print("\n\nAvailable Courses");
                System.out.print("\n=================");

                System.out.print("\nName:  " + course1.getCourseName());
                System.out.print("\nCourse:  " + course1.getCourseCode());
                System.out.print("\nSection:  " + course1.getSectionNumber());
                System.out.print("\nSeats:  " + course1.getAvailableSeats());

                System.out.print("\nName:  " + course2.getCourseName());
                System.out.print("\nCourse:  " + course2.getCourseCode());
                System.out.print("\nSection:  " + course2.getSectionNumber());
                System.out.print("\nSeats:  " + course2.getAvailableSeats());
            }

            else if (ch == 2)
            {
                System.out.print("\n\n----------------------------------------------------");
                System.out.print("\nCourse Display Options");
                System.out.print("\n========================");
                System.out.print("\n1. Introduction to Programming");
                System.out.print("2. Intermediate Programming");

                System.out.print("\n\nEnter choice (1 or 2): ");
                Scanner in2 = new Scanner(System.in);
                int ch2 = in2.nextInt();

                if (ch2 == 1)
                {
                    System.out.print("\n\n"+ course1.getCourseCode() + " - " + course1.getSectionNumber()+": " + course1.getCourseName());
                    if (course1.getAvailableSeats() == 0)
                    {
                        System.out.print("\n\nNo students enrolled!");
                    }
                    else
                    {
                        System.out.print("\n\n" + course1.getAvailableSeats());
                    }
                }

                else if (ch2 == 2)
                {
                    System.out.print("\n\n"+ course2.getCourseCode() + " - " + course2.getSectionNumber()+": " + course2.getCourseName());
                    if (course2.getAvailableSeats() == 0)
                    {
                        System.out.println("\n\nNo students enrolled!");
                    }

                    else
                    {
                        System.out.println("\n\n" + course2.getAvailableSeats());
                    }
                }

                else if (ch == 3)
                {
                    System.out.print("\n\n----------------------------------------------------");
                    System.out.print("\n\nCourse Options");
                    System.out.print("\n==============");
                    System.out.print("\n1. Introduction to Programming");
                    System.out.print("\n2. Intermediate Programming");

                    System.out.print("\n\nEnter choice (1 or 2): ");
                    Scanner in3 = new Scanner(System.in);
                    int ch3 = in3.nextInt();

                    if (ch3 == 1)
                    {
                        System.out.print("\n\nAdd a Student");
                        System.out.print("\n=============");
                        //System.out.print("Enter Student's Name: " + course2.addStudent());
                    }
                    else if (ch3 == 2)
                    {
                        System.out.print("\n\nAdd a Student");
                        System.out.print("\n=============");
                        //System.out.print("Enter Student's Name: " + course2.addStudent());
                    }

                }

                else if (ch == 4)
                {

                }

                else if (ch == 5)
                {

                }
            }
        }
    }
}
