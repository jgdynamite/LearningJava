'''
Created on Nov 20, 2015

@author: joglover
'''
"""
def power(base, exponent):  # Add your parameters here!
    result = base**exponent
    print "%d to the power of %d is %d." % (base, exponent, result)

power(37,4)  # Add your arguments here!


def one_good_turn(n):
    return n + 1
    
def deserves_another(n):
    return one_good_turn(n) + 2
"""

def cube(number):
    number = number**3
    return number
    
def by_three(number):
    if number % 3 == 0:
        return cube(number)
    else:
        return False
    
# Ask Python to print sqrt(25) on line 3.
import math
print math.sqrt(25)

# Import *just* the sqrt function from math on line 3!

from math import sqrt
N = int(raw_input('Please enter an interger:\n'))
print sqrt(N)

"""import math            # Imports the math module
everything = dir(math) # Sets everything to a list of things from math
print everything       # Prints 'em all!"""

def biggest_number(*args):
    print max(args)
    return max(args)
    
def smallest_number(*args):
    print min(args)
    return min(args)

def distance_from_zero(arg):
    print abs(arg)
    return abs(arg)


biggest_number(-10, -5, 5, 10)
smallest_number(-10, -5, 5, 10)
distance_from_zero(-10)

# Set maximum to the max value of any set of numbers on line 3!

maximum = max(4,5,6,2,8,10)
print maximum

# Set minimum to the min value of any set of numbers on line 3!

minimum = min(28,1,38,92,0)

print minimum


absolute = abs(-42)

print absolute
# Print out the types of an integer, a float,
# and a string on separate lines below.

print type(42)
print type('joe')
print type(48.490)

def shut_down(s):
    if s == 'yes':
        return "Shutting down"
    elif s == 'no':
        return "Shutdown aborted"
    else:
        return "Sorry"


def distance_from_zero(num):
    if type(num) == int or type(num) == float:
        return abs(num)
    else:
        return "Nope"