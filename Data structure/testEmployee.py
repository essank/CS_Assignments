#!/usr/bin/env python
from Employee import *

def main():
    print('Enter Employee details: ')
    name = input('Enter name: ')
    number = input('Enter employee number: ')
    shift = input('Enter shift number: ')
    payRate = input('Enter pay rate: ')

    emp = ProductionWorker(name, number, shift, payRate)

    print('\n\nDetails of employee are shown below: ')
    print('Name: ', emp.getEmployeeName())
    print('Employee number: ', emp.getEmployeeNumber())
    print('Shift Number: ', emp.getShiftNumber())
    print('Pay rate: ', emp.getHourlyPayRate())

#test class
main()
