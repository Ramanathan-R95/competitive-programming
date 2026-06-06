t=int(input())


for _ in range(t):
    n=int(input())
    nums=list(map(int,input().split(" ")))
    b = []
    c = []
    maximum = max(nums)
    for i in nums :
        if i == maximum:
            c.append(i)
        else:
            b.append(i)
    if not b :
        print(-1)
    else:
        print(len(b),len(c))
        for i in b : print(i,end=" ")
        print()
        for i in c : print(i,end=" ")
