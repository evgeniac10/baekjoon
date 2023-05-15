"""
def gcd (num1, num2):
    if num2> num1:
        return gcd(num2 , num1)
    elif num2 == 0 :
        return num1
    else :
       return gcd(num2, num1%num2)


def lcm (num1 , num2):
    if num2 > num1:
        return lcm(num2, num1)
    else :
        for i in range(max(num1,num2), (num1*num2)+1):
            if i%num1 ==0 and i%num2==0:
                print(i)
                break
"""
"""
T = int(input())

for i in range(0,T):
    n=map(int,input())
    for j in range(0,n):

        num = [list(map(int(input().split())))]


"""
import sys
import math
n=int(input())

for i in range(n):
    arr=list(map(int, sys.stdin.readline().split()))
    total=0
    for j in range(1,len(arr)):
        for k in range(j+1,len(arr)):
            total+=math.gcd(arr[j],arr[k])

    print(total)