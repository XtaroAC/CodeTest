#!/usr/bin/python3
# Python 3.4 was used as the interpreter.
string = input("Input: ")
for i in range(len(string)-1,-1,-1):
    print(string[i], end="")
