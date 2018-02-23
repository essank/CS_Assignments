#!/usr/bin/env python

#Employee clas
class Employee:
    def __init__(self, employeeName, employeeNumber):
        self.employeeName = employeeName
        self.employeeNumber = employeeNumber
        
    #set Employee Name
    def setEmployeeName(self, employeeName):
        self.employeeName = employeeName
    #set Employee Number
    def setEmployeeNumber(self, employeeNumber):
        self.employeeNumber = employeeNumber
    #get Employee Name
    def getEmployeeName(self):
        return self.employeeName
    #get Employee Number
    def getEmployeeNumber(self):
        return self.employeeNumber


    def __str__(self):
       msg = "Employee name: " + self.getEmployeeName()
       msg += "\nEmployee number" + str(self.getEmployeeNumber())
       return msg
    
# ProductionWorker class
class ProductionWorker(Employee):
    def __init__(self, employeeName, employeeNumber, shiftNumber, payRate):
        Employee.__init__(self, employeeName, employeeNumber)
        self.hourlyPayRate = payRate
        self.shiftNumber = shiftNumber
        
    #set Hourly Pay Rate
    def setHourlyPayRate(self, payRate):
        self.hourlyPayRate = payRate
    #get Hourly Pay Rate
    def getHourlyPayRate(self):
        return self.hourlyPayRate 
    #set Shift Number
    def setShiftNumber(self, shiftNumber):
        self.shiftNumber = shiftNumber
    #get Shift Number
    def getShiftNumber(self):
        return self.shiftNumber

    def __str__(self):
       msg = Employee.__str__(self)
       msg += "\n Hourly Pay Rate: " + str(self.getHourlyPayRate())
       msg += "\n Shift Number: " + str(self.getshiftNumber())
       return msg



