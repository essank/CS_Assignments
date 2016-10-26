## Author: Issa Alkhamees
## Due Date: October 19
## Class: CSCI 2000
## Instructor: Dr. Eaton
## Program Assignment: 6
## Program Title: PhoneNumber
## Program Description: This program calculates a company’s
## break-even point, the number of units of goods the
## company must manufacture and sell in order to break even.
## It outputs the break-even point.
##
## Plagiarism Statement:
## I swear that I have not received or given aid on this program
## beyond guidelines of the course including giving or receiving
## specific code content


#Import text file 
infile = open("PhoneBook.txt","r")
#for loop will replace dashes and print the numbers without them
for num in infile:
    num.strip()
    print("Number without dashes is " ,  end = '')
    for dash in num:
        print (dash.replace('-',''), end = '')