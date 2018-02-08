#!usr/bin/env python

class Rectangle:
    def __init__(self, width = 1, height = 2):
        self.width = width
        self.height = height

    def getPerimeter(self):
        return 2 * self.height + 2 * self.width

    def getArea(self):
        return self.height * self.width

    def setHeight(self, height):
         self.height = height

    def setWidth(self, width):
        self.width = width
