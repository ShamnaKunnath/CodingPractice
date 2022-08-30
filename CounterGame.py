#!/bin/python

import math
import os
import random
import re
import sys

#
# Complete the 'counterGame' function below.
#
# The function is expected to return a STRING.
# The function accepts LONG_INTEGER n as parameter.
#
def nearestPowerOfTwo(n):
    p=int(math.log(long(n),2))
    return int(pow(2,p))
def counterGame(n):
    # Write your code here
    l=[n]
    while n>1:
        print(n)
        t=nearestPowerOfTwo(n)
        if n==t:
            n/=2
        else:
            n-=t
        l.append(n)
    k=len(l)-1
    if k%2==0:
        return 'Richard'
    else:
        return 'Louise'
    
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    t = int(raw_input().strip())

    for t_itr in xrange(t):
        n = int(raw_input().strip())

        result = counterGame(n)

        fptr.write(result + '\n')

    fptr.close()

