#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'weightedUniformStrings' function below.
#
# The function is expected to return a STRING_ARRAY.
# The function accepts following parameters:
#  1. STRING s
#  2. INTEGER_ARRAY queries
#

def weightedUniformStrings(s, queries):
    #Initialize a map(dictionary) with key as weight of each  
    #elements present in s and values as zero.
    l={}
    q=set(s)
    for i in q:
        weight=ord(i)-96
        l[weight]=0
    
    #Update the initialized dictionary values to longest contiguos 
    #substring count
    
    i=0
    while i <(len(s)):
        c=1
        weight=ord(s[i])-96
        while i+1<len(s) and s[i]==s[i+1]:
            c+=1
            i+=1
        if c> l[weight]:
            l[weight]=c
        i+=1
    
    res=[]
    key=l.keys()
    max_val={}
    
    #Create a map with key as weight and value as maximum weight 
    #of the substrings
    
    for i in key:
        max_val[i]=l[i]*i
    upper_bound=max_val.values()    
    
    #Check each query is valid or not
    
    for i in range(0,len(queries)):
        if queries[i] in key or queries[i] in upper_bound:
            res.append('Yes')
        else:
            flag=0
            for j in key:
                if queries[i]< max_val[j]:
                      if queries[i]%j==0:
                        flag=1
                        res.append('Yes')
                        break
            if flag==0:        
                res.append('No')
    return res

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = input()

    queries_count = int(input().strip())

    queries = []

    for _ in range(queries_count):
        queries_item = int(input().strip())
        queries.append(queries_item)

    result = weightedUniformStrings(s, queries)
    fptr.write('\n'.join(result))
    fptr.write('\n')

    fptr.close()

