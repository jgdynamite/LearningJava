'''
Created on Aug 25, 2015

@author: joglover

'''

A1 = [ 12, 15, 20, 19, 01, 52]
A2 = [ 36, 12, 12, 3, 82, 82]
C = map (lambda x, y: x*2 + y*3, A1, A2) 
print('\n This is matrix C \n'), C

R = reduce(lambda x, y: x + y, C)
print('\n The Final answers is \n'), R