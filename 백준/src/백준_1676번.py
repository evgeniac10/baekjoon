"""
def fac(num):
    if num<=1:
        return 1
    return num*fac(num-1)

def zero(num):
    count =0
    for i in range(num):
        if i ==0:
            count+=1

    return count


print(zero(fac(10)))
"""

def fac(n):
    if n<=1:
        return 1
    return n*fac(n-1)
#팩토리얼 함수를 만들고
num = int(input())
count =0

for i in (str(fac(num))[::-1]): # 입력받은 숫자를 문자열로 변환하여 ::로 한다면 문자열을 뒤집어서 슬라이싱이 일어나며
    # 인덱스 번호 끝에서 -1씩 더해져서 예를들어 5,4,3,2,1,0까지 탐색이 되며 문제에서 처음 0이 아닌숫자까지라고 했기에 if문에 break를 더해주면 된다.
    if i !='0':
        break
    count+=1
print(count)
