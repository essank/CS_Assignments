## Author: Issa Alkhamees
## Due Date: September 28
## Class: CSCI 2000
## Instructor: Dr. Eaton
## Program Assignment: 3
## Program Title: Cost of Bagels
## Program Description:
##  This program calculates bagels discount
##  it will charges 75 cents per bagel for orders of
##  lees than a half dozen and 60 cents per bagel
##  for half dozen and more.
##
## Plagiarism Statement:
##  I swear that I have not received or given aid on this program
##  beyond guidelines of the course including giving or receiving
##  specific code content.

# asking how many bagels will be there
numberOfBagels = int(input("Enter number of bagels: "))

# if number of bagels 12 or more it will multiply the number and .60
if numberOfBagels >= 12:
    print ("Cost is ", "$", "{0:.2f}".format(round(numberOfBagels * .60 ,2)), ".", sep="")

# if number of bagels less than 12 it will multiply the number and .75
else:
    print ("Cost is ", "$", "{0:.2f}".format(round(numberOfBagels * .75 ,2)), ".", sep="")
