def main():

    ## Print Menu
    print('''
Options:
Pattern 1
Pattern 2
Pattern 3
Pattern 4\n''')

    ## Initialize done variable
    done = False

    ## Loop continues until user enters 4
    while done != True:

        num = getChoice() ## Call getChoice function.

        if num == 1: ## user chooses pattern 1
            square()

        elif num == 2: ## user chooses pattern 2
            triangle1()


        elif num == 3: ## user chooses pattern 3
            triangle2()


        elif num == 4: ## user chooses pattern 4
            stair()


        elif num == 5: ## user chooses to quit
            done = True

        else: ## user made an invalid choice
            print("You did not enter a valid choice.")

##function to get user's choice
def getChoice():

    ##Initialize validInput variable
    validInput = False

    ##Loop continues until the user enters a number.
    while not validInput:
        inputStr = input("Enter 1,2,3, or 4 to choose a pattern to display. Enter 5 to exit. ")

        if not inputStr.isdigit():  ##user did not enter a number
            print("Input must be a number")

        else:  ##user entered a number
            choice = eval(inputStr)
            validInput = True

    return choice

# pattern 1 function
def square():
    validInput = False
    while not validInput:
        rows = int(input("\nPattern 1 How many rows(3-20) "))
        if rows >=3 and rows <=20:
            for i in range(1, rows+1):
                for j in range(1, rows+1):
                    print("*", end ="")
                print()
                validInput = True
        else:
            print("Values must be between 3 and 20")

# pattern 2 function
def triangle1():
    validInput = False
    while not validInput:
        rows = int(input("\nPattern 2 How many rows(3-20) "))
        if rows >=3 and rows <=20:
            for i in range(0, rows):
                print(" " * (rows - i), end="")
                for j in range(0, i+1):
                    print("*", end = "")
                print()
                validInput = True

        else:
            print("Values must be between 3 and 20")

# pattern 3 function
def triangle2():
    validInput = False
    while not validInput:
        rows = int(input("\nPattern 3 How many rows(3-20) "))
        if rows >=3 and rows <=20:
            for i in range(rows, 0, -1):
                for j in range(i, 0, -1):
                    print("*", end = "")
                print()
                validInput = True

        else:
            print("Values must be between 3 and 20")

# pattern 4 function
def stair():
    validInput = False
    while not validInput:
        rows = int(input("\nPattern 4 How many rows(3-20) "))
        if rows >=3 and rows <=20:
            for i in range(0,rows):
                print("*", end = "")
                for j in range(1, i+1):
                    print(" ", end = "")
                print("*")
                validInput = True

        else:
            print("Values must be between 3 and 20")




##Program starts here.
##Call main function.
main()
