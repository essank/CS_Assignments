// Name: Issa Alkhamees Date Assigned: 4/27
//
// Course: CSCI 2003 42733 Date Due: 5/2
// Instructor: Ms. Greer
//
// File name: Course.java
//
// Program Description: allows teachers to access and/or update course information for the Computer Science Department.

public class Course
{
    private String CourseName;
    private int CourseCode;
    private int SectionNumber;
    private int AvailableSeats;

    //no-argument constructor
    public Course()
    {
        CourseName = " ";
        CourseCode = 0;
        SectionNumber = 0;
        AvailableSeats = 0;
    }

    //argument constructor
    public Course (String CName, int CCode, int SNum, int ASeats)
    {
        CourseName = CName;
        CourseCode = CCode;
        SectionNumber = SNum;
        AvailableSeats = ASeats;
    }

    //seaters
    public void setCourseName(String CName)
    {
        CourseName = CName;
    }

    public void setCourseCode(int CCode)
    {
        CourseCode = CCode;
    }

    public void setSectionNumber(int SNum)
    {
        SectionNumber = SNum;
    }

    public void setAvailableSeats(int ASeats)
    {
        AvailableSeats = ASeats;
    }

    //getters
    public String getCourseName()
    {
        return CourseName;
    }

    public int getCourseCode()
    {
        return CourseCode;
    }

    public int getSectionNumber()
    {
        return SectionNumber;
    }

    public int getAvailableSeats()
    {
        return AvailableSeats;
    }

}
