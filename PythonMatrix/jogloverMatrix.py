'''
Created on Aug 10, 2015

@author: joglover
'''

from numpy import array, sum, dot

# First Array
A = array(([12, 36],\
          [15, 12],\
          [20, 12],\
          [19, 3],\
          [01, 82],\
          [52, 82]))
print('\n This is matrix A \n'), A

# Second array or vector
B = array(([2],\
           [3]))
print('\n This is matrix B \n'), B

# Array A multiple B array
C = A.dot(B)
print('\n THis is matrix C \n'), C

# Sum of elements in Z
#Z = C.sum()
#print('\n The Final answers is  \n'), Z

#print map(lambda x: x, C)
print reduce(lambda x, y: x + y, C)

#def f(x): return x**2
#print f(8)

#g = lambda x: x**2
#print f(8)
