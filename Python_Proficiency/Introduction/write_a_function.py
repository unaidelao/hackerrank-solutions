"""
==Task ==
You are given the year, and you have to write a function to check if the year is leap or not.

==Input Format==
Read y, the year that needs to be checked.

==Constraints==
1900 <= y <= 10^5

==Output Format==
Output is taken care of by the template. Your function must return a boolean value (True/False)
"""

def is_leap(year):
    leap = False
    
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                leap = True
            else:
                leap = False
        else:
            leap = True
    
    return leap

year = int(input())
print(is_leap(year))