

# asking how many bagels will be there
numberOfBagels = int(input("Enter number of bagels: "))

# if number of bagels 12 or more it will multiply the number and .60
if numberOfBagels >= 12:
    print ("Cost is ", "$", "{0:.2f}".format(round(numberOfBagels * .60 ,2)), ".", sep="")

# if number of bagels less than 12 it will multiply the number and .75
else:
    print ("Cost is ", "$", "{0:.2f}".format(round(numberOfBagels * .75 ,2)), ".", sep="")
