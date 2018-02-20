from Employee import Employee

def main():
    print('Enter Employee details: ')
    name = input('Enter name: ')
    number = input('Enter employee number: ')
    shift = input('Enter shift number: ')
    payRate = input('Enter pay rate: ')

    emp = ProductionWorker(name, number, shift, payRate)

    print('Details of employee are shown below: ')
    print('Name: ', emp.getEmployeeName())
    print('Employee number: ', emp.getEmployeeNumber())
    print('Shift Number: ', emp.getEmployeeNumber())
    print('Pay rate: ', emp.getHourlyPayRate)

main()
