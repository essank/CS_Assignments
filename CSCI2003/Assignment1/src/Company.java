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
// File name: Company
//
// Program Description: simulate a company roster

public class Company
{
    public static void main (String[] args) //defining main method

    {
        // creating 2 objects using non argument constructor

        Employee company1 = new Employee("Susan Meyers",47899,"Accounting","Vice President");

        Employee company2 = new Employee("Mark Jones",39119,"IT","Programmer");

        // creating object using argument constructor

        Employee company3 = new Employee();

        // printing the required output

        System.out.printf("\n%-20s%-20s%-20s%-20s","Name","ID Number","Department","Position");

        System.out.println("\n-----------------------------------------------------------------------------");

        System.out.printf("%-20s%-20s%-20s%-20s",company1.getEmployeeName(),company1.getEmployeeId(),company1.getEmployeeId(),company1.getEmployeePosition());

        System.out.printf("\n%-20s%-20s%-20s%-20s",company2.getEmployeeName(),company2.getEmployeeId(),company2.getEmployeeDepartment(),company2.getEmployeePosition());

        company3.setEmployeeName("Joy Rogers");

        company3.setEmployeeId(81774);

        company3.setEmployeeDepartment("Manufacturing");

        company3.setEmployeePosition("Engineer");

        System.out.printf("\n%-20s%-20s%-20s%-20s",company3.getEmployeeName(),company3.getEmployeeId(),company3.getEmployeeDepartment(),company3.getEmployeePosition());
    }
}
