t = int(input())
for _ in range(t):
    n = int(input())
    nums = map(int,input().split())
    neg = 0
    pos = 0
    k = 0
    for i in nums: 
        if i > 0:
            pos+=1
        else:
            neg+=1
    while True :
        if neg % 2 == 0 and pos - neg >= 0 :
            print(k)
            break
        if neg % 2 == 1 :
            k+=1
            neg-=1
            pos+=1
        if pos - neg < 0 and neg % 2 == 0:
            neg -=2
            pos +=2
            k+=2
        