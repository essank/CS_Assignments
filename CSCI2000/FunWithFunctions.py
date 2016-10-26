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
            rows = int(input("Pattern 1 How many rows (3-20) "))
            for i in range(1, rows+1):
                for j in range(1, rows+1):
                    print("*", end ="")
                print()

        elif num == 2: ## user chooses pattern 2
            rows = int(input("Patten 2 How many rows(3-20) "))
            for i in range(0, rows):
                print(" " * (rows - i), end="")
                for j in range(0, i+1):
                    print("*", end = "")
                print()

        elif num == 3: ## user chooses pattern 3
            rows = int(input("Pattern 3 How many rows(3-20) "))
            for i in range(rows, 0, -1):
                for j in range(i, 0, -1):
                    print("*", end = "")
                print()

        elif num == 4: ## user chooses pattern 4
            rows = int(input("Pattern 4 How many rows(3-20) "))
            for i in range(0,rows):
                print("*", end = "")
                for j in range(1, i+1):
                    print(" ", end = "")
                print("*")

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

##Program starts here.
##Call main function.
main()
