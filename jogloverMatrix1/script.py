'''
Created on Nov 6, 2015

@author: joglover
'''
#print "joe"

#python = 4
#monty_python = python ** 2
#print monty_python

#me = 6 % 5
#print me
jojo = "ash"[0]
print jojo

#ada = "Nigeria County"
#len(ada)
#print len(ada)
"""
parrot = "Norwegian Blue"
len(parrot)
print len(parrot)

john = "how"
print john.lower()
print john.upper()


pi = 3.14
print str(pi)
"""
#original = raw_input("Please enter name: ")

#print 'Welcome to the Pig Latin Translator!'

# Start coding here!
"""original = raw_input("Enter a word: ")
if len(original) > 0 and original.isalpha():
    print original
else:
    print "Empty."""

#print 'Welcome to the Pig Latin Translator!'
#print parrot + " " + john
"""
pyg = 'ay'

original = raw_input('Enter a word:')

if len(original) > 0 and original.isalpha():
    word = original.lower()
    first = word[0]
    new_word = word + first + pyg
    new_word = new_word[1:len(new_word)]
    print new_word
else:
    print 'empty'    
    
""" 

def tax(bill):
    #"""Adds 8% tax to a restaurant bill."""
    bill *= 1.08
    print "With tax: %f" % bill
    return bill

def tip(bill):
    """Adds 15% tip to a restaurant bill."""
    bill *= 1.15
    print "With tip: %f" % bill
    return bill
    
meal_cost = 567
meal_with_tax = tax(meal_cost)
meal_with_tip = tip(meal_with_tax)

# Define your spam function starting on line 5. You
# can leave the code on line 11 alone for now--we'll
# explain it soon!
def spam():
    """Prints Eggs to the console"""
    print "Eggs!"

# Define the spam function above this line.
spam()

jojo = 60 % 9
print jojo
