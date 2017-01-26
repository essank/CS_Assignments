// Name: Issa Alkhamees
//
// Date Assigned: 1/24
//
// Course: CSCI 2003 42733
//
// Date Due: 1/26
//
// Instructor: Ms. Greer
//
// File name: Employee
//
// Program Description: simulate a company roster

public class Employee
{

    private String EmployeeName;
    private int EmployeeId;
    private  String EmployeeDepartment;
    private  String EmployeePosition;

    // no-argument constractor
    public Employee ()
    {
        EmployeeName = "";
        EmployeeId = 0;
        EmployeeDepartment = "";
        EmployeePosition = "";
    }

    //argument constractor
    public Employee (String EN, int EI, String ED, String EP)
    {
        EmployeeName = EN;
        EmployeeId = EI;
        EmployeeDepartment = ED;
        EmployeePosition = EP;
    }

    //setters
    public void setEmployeeName(String EN)
    {
        EmployeeName = EN;
    }

    public void setEmployeeId (int EI)
    {
        EmployeeId = EI;
    }

    public void setEmployeeDepartment(String ED)
    {
        EmployeeDepartment = ED;
    }

    public void setEmployeePosition(String EP)
    {
        EmployeePosition = EP;
    }

    //getters
    public String getEmployeeName()
    {
        return EmployeeName;
    }

    public int getEmployeeId()
    {
        return EmployeeId;
    }

    public String getEmployeeDepartment()
    {
        return EmployeeDepartment;
    }

    public String getEmployeePosition()
    {
        return EmployeePosition;
    }
}
