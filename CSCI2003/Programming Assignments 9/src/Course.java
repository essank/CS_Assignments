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
    //create variables
    private String CourseName;
    private String CourseCode;
    private int SectionNumber;
    private int AvailableSeats;

    //array to hold Student object
    Student[] studentArray = new Student[35];
    private static int enrollment = 0;

    //no-argument constructor
    public Course()
    {
        CourseName = " ";
        CourseCode = " ";
        SectionNumber = 0;
        AvailableSeats = 35;
    }

    //argument constructor
    public Course (String CName, String CCode, int SNum, int ASeats)
    {
        CourseName = CName;
        CourseCode = CCode;
        SectionNumber = SNum;
        AvailableSeats = ASeats;
    }

    //seaters
    public void setCourseName(String CName)
    {
        this.CourseName = CName;
    }

    public void setCourseCode(String CCode)
    {
        this.CourseCode = CCode;
    }

    public void setSectionNumber(int SNum)
    {
        this.SectionNumber = SNum;
    }

    public void setAvailableSeats(int ASeats)
    {
        this.AvailableSeats = ASeats;
    }

    //getters
    public String getCourseName()
    {
        return CourseName;
    }

    public String getCourseCode()
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

    //adding student method
    public void addStudent(Course other)
    {
        if (AvailableSeats <35)
        {
            for ( int i=0; i<studentArray.length; i++) {
                studentArray[i]=new Student();
                enrollment++;
            }
        }

        else
        {
            System.out.printf("\nClass Full!");
        }
    }

    //display course info method
    public void displayCourseInfo()
    {
        System.out.println("\n" + getSectionNumber() +
                " - " + getCourseCode() +
                ":  " + getCourseName());
    }

    //display students method
    public void displayStudents(Course studentID, Course studentName)
    {
        System.out.printf("\n %d %s", studentID, studentName);
    }
}
