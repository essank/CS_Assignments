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
// File name: EmployeeTester
//
// Program Description: simulate a company roster

public class EmployeeTester {
    public static void main (String[] args)
    {
        Employee company1 = new Employee();
        Employee company2 = new Employee("Tyler Greer", 12345, "Computer Science", "Instructor");

        System.out.print("TESTING ARGUMENT CONSTRUCTOR");
        System.out.print("\n----------------------------");

        System.out.println("\n"+company2.getEmployeeName());

        System.out.println("Expected: Tyler Greer");

        System.out.println("\n"+company2.getEmployeeId());

        System.out.println("Expected: 12345");

        System.out.println("\n"+company2.getEmployeeDepartment());

        System.out.println("Expected: Computer Science");

        System.out.println("\n"+company2.getEmployeePosition());

        System.out.println("Expected: Instructor");

        System.out.println("\nTESTING NON-ARGUMENT CONSTRUCTOR");

        System.out.println("---------------------------------");

        company1.setEmployeeName("Desiree Wilson");

        System.out.println("\n"+company1.getEmployeeName());

        System.out.println("Expected: Desiree Wilson");

        company1.setEmployeeId(45678);

        System.out.println("\n"+company1.getEmployeeId());

        System.out.println("Expected: 45678");

        company1.setEmployeeDepartment("Orthopaedics");

        System.out.println("\n"+company1.getEmployeeDepartment());

        System.out.println("Expected: Orthopaedics");

        company1.setEmployeePosition("Registered Nurse");

        System.out.println("\n"+company1.getEmployeePosition());

        System.out.println("Expected: Registered Nurse");
    }
}
