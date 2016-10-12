

#Print the options
print("""
Options:
-----------
1. Area of Rectangle
2. Area of Triangle
3. Area of Circle
4. Quit\n""")
flag = False

while flag != True:
    selection = int(input("\nMake a selection from the options menu: "))
    # Calculate the rectangle
    if selection == 1:
        height = float(input("Enter height: "))
        width = float(input("Enter  width:"))
        rectangle =  height * width
        print("Area of rectangle ", "{0:,.2f}".format(rectangle))

    # Calculate the triangle
    elif selection == 2:
        base = float(input("Enter base: "))
        height = float(input("Enter height: "))
        triangle = (1/2 * base * height)
        print("Area of triangle ", "{0:,.2f}".format(triangle))
    # Calculate the circle
    elif selection == 3:
        radius = float(input("Enter radius: "))
        circle = (3.141592 * radius**2)
        print("Area of circle ", "{0:,.2f}".format(circle))
    # quit the program
    elif selection == 4:
        flag = True
    # it's telling user to choose the right number 
    else:
        print("You did not enter a proper number.")
