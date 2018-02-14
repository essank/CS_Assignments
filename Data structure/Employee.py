
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

class ProductionWorker(Employee):
    def __init__(self, shiftNumber, payRate ):
        Employee.__init__(self, shiftNumber, payRate)
