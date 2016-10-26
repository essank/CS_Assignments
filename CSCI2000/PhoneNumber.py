#Import text file 
infile = open("PhoneBook.txt","r")
#for loop will replace dashes and print the numbers without them
for num in infile:
    num.strip()
    print("Number without dashes is " ,  end = '')
    for dash in num:
        print (dash.replace('-',''), end = '')
