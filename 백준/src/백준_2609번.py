a, b = map(int, input().split())
#input이라는 함수를 활용해서 그냥 받아서 쓰려고 했는데 실패가 뜨길래 왜 그런지 알아보니
#input이라는 함수로 입력을 받는다면 문자열로 입력을 받게 되어 형변환이 필요하기에 map이라는 메서드를 활용하여
#앞에 명시적으로 정수데이터타입을 명시하여 바꾸어준다.

def gcd(a, b):
    while b > 0:
        #유클리드 호제법에 의하여 a와 b라는 숫자가 주어졌을때 큰 숫자에서 작은 숫자로 나누어 떨어진 나머지를 다시 작은 수로 나누어서 최종적으로
        #나머지가 0이 될때 해당하는 작은 수가 최대 공약수가 된다.
        a, b = b, a % b
    return a

def lcm(a, b):
    #최소 공배수를 구하기 위해선 최대 공약수를 구해야한다.
    #파이썬에서는 / 이거는 부동 소수점 나눗셈이 적용된다, //소수점 이하를 생략하고 정수의 값만 나타낸다.
    return a * b // gcd(a, b)

print(gcd(a, b))
print(lcm(a, b))
