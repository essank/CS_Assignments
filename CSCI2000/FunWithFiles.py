import math

#this program will calculate the sum and average of numbers after reading input from file

largest=1000 #this will initialize largest value to 1000
smallest=1 #this will initialize smallest value to 1
sum=0 #this will initialize sum value to 0
length=0 #this will initialize length value to 0
#this will open file of numbers
inFile = open("E:\\numbers.txt","r")
#this will read the numbers from file of numbers


for line in inFile:
    smallest=int(line)
    largest=smallest
    break
	
	
#this will reopen the file for execution
inFile = open("E:\\numbers.txt","r")  
for line in inFile:
    num = int(line)
    print(num)
    sum+=num
    #this will calculate sum of all numbers
    length=length+1
    if largest<num :
        largest=num    #this will assign largest value
    elif smallest>num :
        smallest=num   #this will assign smallest value
        
    
print ("Smallest :",smallest)    #this will print smallest value
print("Largest :",largest)       #this will print smallest value
print("Sum :",sum)          #this will print sum value
average=sum/length           #this will calculate average value
print("Average :",average)    #this will print average value
inFile.close()      #this will close the file of numbers
