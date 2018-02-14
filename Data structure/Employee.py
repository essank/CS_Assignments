class Employee:
    def __init__(self, employeeName, employeeNumber):
        self.employeeName = employeeName
        self.employeeNumber = employeeNumber

    def setEmployeeName(self, employeeName):
        self.employeeName = employeeName

    def setEmployeeNumber(self, employeeNumber):
        self.employeeNumber = employeeNumber

    def getEmployeeName(self):
        return self.employeeName

    def getEmployeeNumber(self):
        return self.employeeNumber
