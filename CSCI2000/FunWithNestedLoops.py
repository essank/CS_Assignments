## Author: Issa Alkhamees
## Due Date: October 23
## Class: CSCI 2000
## Instructor: Dr. Greer
## Program Assignment: 7
## Program Title: FunWithNestedLoops
## Program Description:
##  This program changed the pattern every time.
##
## Plagiarism Statement:
##  I swear that I have not received or given aid on this program
##  beyond guidelines of the course including giving or receiving
##  specific code content.

#Pattern 1
#Ask the user to input the pattern number
rows = int(input("Pattern 1 How many rows (3-20)?"))

for i in range(1, rows+1):
    for j in range(1, rows+1):
        print("*", end ="")
    print()

#Pattern 2
#Ask the user to input the pattern number
rows = int(input("Patten 2 How many rows(3-20)?"))

for i in range(0, rows):
    print(" " * (rows - i), end="")
    for j in range(0, i+1):
        print("*", end = "")
    print()

#Pattern 3
#Ask the user to input the pattern number
rows = int(input("Pattern 3 How many rows(3-20)?"))

for i in range(rows, 0, -1):
    for j in range(i, 0, -1):
        print("*", end = "")
    print()

#Pattern 4
#Ask the user to input the pattern number
rows = int(input("Pattern 4 How many rows(3-20)?"))

for i in range(0,rows):
    print("*", end = "")
    for j in range(1, i+1):
        print(" ", end = "")
    print("*")
