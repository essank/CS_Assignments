// Name: Issa Alkhamees Date Assigned: 4/27
//
// Course: CSCI 2003 42733 Date Due: 5/2
// Instructor: Ms. Greer
//
// File name: Student.java
//
// Program Description: allows teachers to access and/or update course information for the Computer Science Department.


public class Student
{

    private String StudentName;
    private int ID;

    //no-argument constructor
    public Student()
    {
        StudentName = " ";
        ID = 0;
    }

    //argument constructor
    public Student (String st, int ID)
    {
        StudentName = st;
        ID = ID;
    }

    // create setters

    public void setStudentName(String st)
    {
        StudentName = st;
    }

    public void setID(int ID)
    {
        ID = ID;
    }

    //create getters
    public String getStudentName()
    {
        return StudentName;
    }

    public int getID()
    {
        return ID;
    }
}
