#!/usr/bin/env python



records=[]

#Definition of function readData to read data from text file
def readData():
  #Entering the file name
  filename="worldSeries.txt"
  #Opening the file
  file=open(filename,'r')
  #Searching from beginning
  searchingWordsStarted=0
  #reading the data from file to lists
  #Use of for loop
  for line in file:
    #reading the numbers on first line
    temp=line[0:-1].split(',')
    records.append(temp)

#Definition of function listAL to Show the list of AL wins
def listAL():
  #Using team list
  teams=[]
  #using for loop to search in the list
  for x in records:
    if x[2]=="AL":
      if x[1] not in teams:
        teams.append(x[1])
  #Printing the teams who won and are from AL
  print("\n\tAL win Teams\n",'\n'.join(teams))

##Definition of function listNL to Show the list of NL wins
def listNL():
  #Using team list
  teams=[]
  #using for loop to search in the list
  for x in records:
    if x[2]=="NL":
      if x[1] not in teams:
        teams.append(x[1])
  #Printing the teams who won and are from NL
  print("\n\tNL win Teams\n",'\n'.join(teams))

##Definition of function teamWins to Show number of wins for team
def teamWins():
  #Asking the use to input the name of team to search the number of wins
  team=input("Enter team name : ")
  count=0
  #Using for loop to search in the list
  for x in records:
    if x[1]==team:
      if len(x[3])<6:
		#Incrementing the value of count
        count=count+1;
  #if team has no win then execute this print statement to show zero wins
  if(count==0):
    print("\tZero wins for the given team...")
  #if team has any win then print the following statement to show total number of wins
  else:
    print ("\t The team ",team,"won ",count,"times")

#Definition of function yearData to search the winner and looser team for specific entered year
def yearData():
  #Ask the user to enter the year
  year=input("Enter year : ")
  #Searching the list using for loop
  for x in records:
    if x[0]==year:
	  #Printing the winner and looser team for specific year
      print("In ",year,"\n\tWinner ::",x[1],"\n\tLooser ::",x[4])

##Definition of function teamData to check the team participation count
def teamData():
  #Asking the user to enter the name of team
  team=input("Enter team name : ")
  count=0
  #Using for loop to search the list
  for x in records:
    if x[1]==team or x[4]==team:
      count=count+1;
  #if count is 0 then show no participation of team
  if(count==0):
    print("\tZero participations for the given team...")
  #if count is greater than 0 then show number of participation for the team
  else:
    print ("\t The team ",team,"participation ",count,"times")

#Definition of menu function to create a menu for the program
def menu():
  #Asking the user to select one option from the given
  print("\n\t******-------******\n1. List all winning teams from the AL (list team name only once if they won more than 1 time)\n2. List all winning teams from the NL (list team name only once if they won more than 1 time)\n3. For a specific team, how many times did they win\n4. For a specific team, how many times were they in the World Series (win or lose)\n5. For a specific year, who won and who lost\n6. Quit")
  choice = int(input("Enter the Choice :: "))

  #if user enters value 1
  if choice==1:
	#calling function listAL()
    listAL()
	#calling function menu to show the menu again after excuting the required function
    menu()

  #if user enters value 2
  elif choice==2:
	#calling function listNL()
    listNL()
	#calling function menu to show the menu again after excuting the required function
    menu()

  #if user enters value 3
  elif choice==3:
	#calling function teamWins()
    teamWins()
	#calling function menu to show the menu again after excuting the required function
    menu()

  #if user enters value 4
  elif choice==4:
	#calling function teamData()
    teamData()
    menu()

  #if user enters value 5
  elif choice==5:
	#calling function yearData()
    yearData()
	#calling function menu to show the menu again after excuting the required function
    menu()

  #if user enters value 6
  elif choice==6:
    #if user enters value 6 then print thankyou and quit
    print("\n\tThank you!")
	#if user presses any other value rather than 1 to 6 then show that incorrect option
  else:
    print("Incorrect option")
	#calling function menu to show the menu again after excuting the required function
  menu()
#Calling readData() function to read the data from the file
readData()
#calling function menu to show the menu again after excuting the required function
menu()
