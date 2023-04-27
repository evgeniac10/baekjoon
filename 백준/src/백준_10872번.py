def fac(num):
    if num <=1:
        return 1
    return num*fac(num-1)

num = int( input())
print(fac(num))