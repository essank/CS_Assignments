// Name: Issa Alkhamees        Date Assigned: 4/27
//
// Course: CSCI 2003 42733     Date Due: 5/2
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
        //creating objects
        Course course1 = new Course("Introduction to Programming", "CSCI 2000", 60536, 35);
        Course course2 = new Course("Intermediate Programming", "CSCI 2003", 63972, 35);

        //flag variable
        boolean flag = false;

        System.out.print("\nCourse Information Access");
        System.out.print("\n=========================");

        //starting while loop
        while (!flag)
        {

            //printing the options
            System.out.print("\n\nOptions");
            System.out.print("\n=======");
            System.out.print("\n1. View Available Course Information");
            System.out.print("\n2. View Students Enrolled in Course");
            System.out.print("\n3. Add Student to a Course");
            System.out.print("\n4. View Total Enrollment for Department");
            System.out.print("\n5. Quit");

            //ask the user to take a choice
            System.out.print("\n\nEnter choice (1 - 5): ");

            //scanner the choice
            Scanner in = new Scanner(System.in);
            int ch = in.nextInt();

            // if for choice
            if (ch == 1)
            {
                // printing available courses
                System.out.print("\n\n----------------------------------------------------");
                System.out.print("\n\nAvailable Courses");
                System.out.print("\n\n=================");

                System.out.print("\nName:    " + course1.getCourseName());
                System.out.print("\nCourse:  " + course1.getCourseCode());
                System.out.print("\nSection: " + course1.getSectionNumber());
                System.out.print("\nSeats:   " + course1.getAvailableSeats());

                System.out.print("\n\nName:    " + course2.getCourseName());
                System.out.print("\nCourse:  " + course2.getCourseCode());
                System.out.print("\nSection: " + course2.getSectionNumber());
                System.out.print("\nSeats:   " + course2.getAvailableSeats());
                System.out.print("\n\n----------------------------------------------------");
            }

            //display course option
            else if (ch == 2)
            {
                System.out.print("\n----------------------------------------------------");
                System.out.print("\n\nCourse Display Options");
                System.out.print("\n========================");
                System.out.print("\n1. Introduction to Programming");
                System.out.print("\n2. Intermediate Programming");

                //asking the user to choose a course
                System.out.print("\n\nEnter choice (1 or 2): ");
                Scanner in2 = new Scanner(System.in);
                int ch2 = in2.nextInt();

                // display course 1
                if (ch2 == 1)
                {
                     course1.displayStudents();
                }

                //display course 2
                else if (ch2 == 2)
                {
                     course2.displayStudents();
                }
            }

            //adding student to course
            else if (ch == 3)
            {
                System.out.print("\n\n----------------------------------------------------");
                System.out.print("\n\nCourse Options");
                System.out.print("\n==============");
                System.out.print("\n1. Introduction to Programming");
                System.out.print("\n2. Intermediate Programming");

                //ask the user to know which course
                System.out.print("\n\nEnter choice (1 or 2): ");
                Scanner in3 = new Scanner(System.in);
                int ch3 = in3.nextInt();

                //adding the user to course 1
                if (ch3 == 1)
                {
                    System.out.print("\n\nAdd a Student");
                    System.out.print("\n=============");

                    System.out.print("\nEnter Student's Name: ");
                    String studentName = in.next();

                    System.out.print("\nEnter Student's ID: ");
                    int studentID = in.nextInt();
                    
                    //Create student object for course 1
                    Student student99 = new Student(studentName,studentID);
                    course1.addStudent(student99);
                }

                //adding the user to course 2
                else if (ch3 == 2)
                {
                    System.out.print("\n\nAdd a Student");
                    System.out.print("\n=============");

                    System.out.print("\nEnter Student's Name: ");
                    String studentName = in.next();

                    System.out.print("\nEnter Student's ID: ");
                    int studentID = in.nextInt();
                    
                    //Create student object for course 2
                    Student student99 = new Student(studentName,studentID);
                    course2.addStudent(student99);
                }
            }

            //display students enrolled
            else if (ch == 4)
            {
                System.out.println("\n----------------------------------------------------");
                System.out.println("\nTotal Students Enrolled: " + Course.enrollment);
                System.out.println("\n----------------------------------------------------");
            }

            //quit
            else if (ch == 5)
            {
                System.out.println("\n----------------------------------------------------");
                System.out.println("\nGoodbye!");
                flag = true;
                break;
            }
        }
    }
}
