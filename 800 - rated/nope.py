t = int(input())
for _ in range(t):
    n = input()
    l = len(n)
    print((l-1)*9 + int(n)//(10 ** l) + int(n[0]))
