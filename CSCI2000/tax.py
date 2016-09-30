## Author: Issa Alkhamees
## Due Date: September 29
## Class: CSCI 2000
## Instructor: Dr. Eaton
## Program Assignment: 4
## Program Title: state income tax
##  Program Description:
##  This program calculates a person's state income tax
##
## Plagiarism Statement:
##  I swear that I have not received or given aid on this program
##  beyond guidelines of the course including giving or receiving
##  specific code content.

income= " "
tax = 0
income = int(input("\nEnter your taxable income (-1 to quit): "))
while income != -1:
    if income <= 20000:
        tax = int(round(0.02 * income, 2))
        print("Your tax is\t${0:,.0f}.".format (tax), sep="")
    elif income <= 50000:
        tax = int(round(400 + 0.025 * (income - 20000), 2))
        print("Your tax is\t${0:,.0f}.".format (tax), sep="")
    else:
        tax = int(round(1150 + 0.035 * (income - 50000), 2))
        print("Your tax is\t${0:,.0f}.".format (tax), sep="")
            # Ask user to enter his income
    income = int(input("\nEnter your taxable income (-1 to quit): "))

# if the user enter -1 the program will quit
income = print("Exit")
