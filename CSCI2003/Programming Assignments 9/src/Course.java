// Name: Issa Alkhamees          Date Assigned: 4/27
//
// Course: CSCI 2003 42733       Date Due: 5/2
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
    private int lool;
    //array to hold Student object
    private Student[]studentArray;
   

    public static int enrollment = 0;

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
    public void addStudent(Student other)
    {

        if(AvailableSeats == 0)
        {
            System.out.println("Class Full!");
        }
        
        else
        {
            studentArray[enrollment] = other;
            AvailableSeats -= 1;
            enrollment += 1;
            lool++;
        }
    }

    //display course info method
    public void displayCourseInfo()
    {
        System.out.println();
        System.out.print("Name:    " + CourseName);
        System.out.printf("\nCourse:%11s",CourseCode);
        System.out.printf("\nSection:%6d",SectionNumber);
        System.out.printf("\nSeats:%5d",AvailableSeats);
        System.out.println();
    }

    //display students method
    public void displayStudents()
    {
        System.out.println();
        System.out.println(CourseCode+" - " + SectionNumber + ": " + CourseName);

        if(AvailableSeats == 35)
        {
            System.out.println("\nNo students enrolled!");
        }

        else
        {
            System.out.println("\nID             Name"+
                               "\n--             ----");

            for(int k=0; k<lool; k++)
            {
                System.out.printf("%-15d%-19s",studentArray[k].getID(),studentArray[k].getStudentName());
                System.out.println();
            }
        }
    }
}
