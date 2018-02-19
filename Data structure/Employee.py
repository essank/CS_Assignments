
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

class ProductionWorker(Employee):
    def __init__(self, shiftNumber, payRate, employeeName, employeeNumber):
        Employee.__init__(self, shiftNumber, payRate, employeeName, employeeNumber)
        self.hourlyPayRate = payRate
        self.shiftNumber = shiftNumber

    def setHourlyPayRate(self, payRate):
        self.hourlyPayRate = payRate

    def getHourlyPayRate(self):
        return self.hourlyPayRate 

    def setShiftNumber(self, shiftNumber):
        self.shiftNumber = shiftNumber

    def getShiftNumber(self):
        return self.shiftNumber

    def __str__(self):
        msg = Employee.__str__(self)
        msg += "\n Hourly Pay Rate: " + str(self.getHourlyPayRate())
        msg += "\n Shift Number: " + str(self.getshiftNumber())
        return msg



