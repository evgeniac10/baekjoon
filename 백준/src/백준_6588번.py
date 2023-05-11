"""
def prime(num): #에라토스테네스의 체

    a=[False,False]+[True]*(num-1)
    prm=[]
    for i in range(2,num+1):
        if a[i]:
            prm.append(i)
            for j in range(2*i,num+1,i):
                a[j]=False
"""

import sys
def Goldbach():
    check = [False, False] + [True] * 1000000

    for i in range(2, 1001):
        if check[i] == True:
            for j in range(i + i, 1000001, i):
                check[j] = False

    while True:
        n = int(sys.stdin.readline())

        if n == 0:
            break

        A = 0
        B = n
        for _ in range(1000000):
            if check[A] and check[B]:
                print(f"{n} = {A} + {B}")
                break
            A += 1
            B -= 1
        else:
            print("Goldbach's conjecture is wrong.")

Goldbach()
"""
import sys
def Goldbach():
    check = [False, False] + [True] * 1000000

    for i in range(2, 1001):
        if check[i] == True:
            for j in range(i + i, 1000001, i):
                check[j] = False
while True:
        n = int(sys.stdin.readline())

        if n == 0:
            break

        A = 0
        B = n
        for _ in range(1000000):
            if check[A] and check[B]:
                print(f"{n} = {A} + {B}")
                break
            A += 1
            B -= 1
        else:
            print("Goldbach's conjecture is wrong.")
"""