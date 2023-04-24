def gcd(x , y):
    while y>0:
        x,y = y,x%y
    return x
#최대 공약수를 구하는 함수
def lcm (x,y):
    return x * y //gcd(x,y)
#최소 공배수를 구하는 함수
T = int(input())
#
for i  in range(T):
    x,y = map(int , input().split())
    print(lcm(x,y))