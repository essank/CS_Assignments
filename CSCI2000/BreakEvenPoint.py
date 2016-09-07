## Author: Issa Alkhamees
## Due Date: August 31
## Class: CSCI 2000
## Instructor: Dr. Eaton
## Program Assignment: 1
## Program Title: BreakEvenPoint
## Program Description:
##  This program calculates a company’s
##  break-even point, the number of units of goods the
##  company must manufacture and sell in order to break even.
##  It outputs the break-even point.
##
## Plagiarism Statement:
##  I swear that I have not received or given aid on this program
##  beyond guidelines of the course including giving or receiving
##  specific code content.


fixedCosts = 5000
pricePerUnit = 8
costPerUnit = 6

# subtract pricePerUnit and costPerUnit after that divided from fixedCosts
breakEvenPoint = fixedCosts / (pricePerUnit - costPerUnit)
print (breakEvenPoint, "is the number of units the company must manufacture and sell in order to break even.")
