#Name: Issa Alkhamees
#Class and Section: CS 222 02
#Assignment: Program Assignment 04
#Due Date: 3/21
#Date Turned in: 3/21
#Program Description: this program will remove color yellow from the list

import random

class Stack:
    def __init__(self):
        self.items = []
    def isEmpty(self):
        return self.items==[]
    def push(self, item):
        self.items.insert(0,item)
    def pop(self):
        return self.items.pop(0)
    def peek(self):
        return self.items[0]
    def size(self):
        return len(self.items)
    def content(self):
        temp=self.size();
        t1=0
        for i in range(0,temp):
            print(self.items[t1])
            t1=t1+1;

myList=['Red','Yellow','Blue','Orange','Purple']
lr=random.sample(range(0,5),5);
s1=Stack()
s2=Stack()
for i in lr:
    s1.push(myList[lr[i]]);
print('Content in stack:')
s1.content()
while s1.peek() !='Yellow':
    s2.push(s1.peek())
    s1.pop()
    s1.pop()
while s2.size()!=0:
    s1.push(s2.peek())
    s2.pop()

print()
print('######')
print('Content in stack after removing yellow:')
s1.content()
