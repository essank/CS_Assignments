## Author: Issa Alkhamees
## Due Date: September 8
## Class: CSCI 2000 Section: 43078
## Instructor: Ms. Greer
## Program Assignment: 2
## Program Title: ConvertLengths
##
## Program Description: This program asks the user to
##  enter a whole number of inches and converts that length
##  to feet and inches. See Figure 2.22 on page 49 for a sample run.
##
## Plagiarism Statement:
##  I swear that I have not received or given aid on this program
##  beyond guidelines of the course including giving or receiving
##  specific code content.


length = int(input("Enter number of inches: "))
feet = int(length / 12)
inches = length % 12

print (length, "inches is", feet, "feet and", inches, "inches.")
