t = int(input())
for _ in range(t):
    n = input()
    op = 0
    s = set()
    s.add("00")
    s.add("25")
    s.add("50")
    s.add("75")

    for i in range(-1,-len(n),-1):
        if  n[i-1:i+1] in s:
            op += len(n) + i
            break
    print(op)
