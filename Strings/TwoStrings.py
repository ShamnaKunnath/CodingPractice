#!/bin/python3

import math
import os
import random
import re
import sys
from itertools import combinations
#
# Complete the 'alternate' function below.
#
# The function is expected to return an INTEGER.
# The function accepts STRING s as parameter.
#
def checkAlternate(s):
    if len(s)==0 or len(s)==1 or s[0]==s[1]:
        return False
    a=s[0]
    b=s[1]
    i=2
    while i <len(s):
        if s[i]!=a or (i+1<len(s) and s[i+1]!=b):
            return False
        i+=2

    return len(s)

def alternate(s):
    # Write your code here
    char=set(s)
    ls=list(char)
    if len(ls)==0 or len(ls)==1 :
        return 0
    if len(ls)==2:
        if checkAlternate(s):
            return checkAlternate(s)
        else:
            return 0
    count_elements_delete=len(ls)-2
    res=[]
    res.extend(combinations(ls,count_elements_delete))
    ans=0
    for l in res:
        tmp=s[:]
        for i in range(len(l)):
            tmp=tmp.replace(l[i],"")
        t=checkAlternate(tmp)
        if t:
            if t>ans:
                ans=t
    return ans

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    l = int(input().strip())

    s = input()

    result = alternate(s)

    fptr.write(str(result) + '\n')

    fptr.close()
