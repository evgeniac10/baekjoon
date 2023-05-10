def count2Num(num):
    if num <2:
        return 0
    count =0

    while num>=2:
        count += num//2
        num = num//2
    return count
# 8 = 8 7 6 5 4 3 2 1
#(2)  +   +   +   +
#(4)  +       +
#(8)  +

def count5Num(num):
    if num<5:
        return 0
    count =0
    while num >=5:
        count += num//5
        num= num//5
    return count

m,n = map(int, input().split())
two_count=count2Num(m)-count2Num(n)-count2Num(m-n)
five_count = count5Num(m)-count5Num(n)-count5Num(m-n)
print(min(two_count,five_count))
