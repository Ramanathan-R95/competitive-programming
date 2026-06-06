t = int(input())
for _ in range(t):
    n = int(input())
    arr = map(int, input().split())
    result = 0 
    for i in arr :
        result ^= i
    if result == 0:
        print(1)
        print(1,n)
    elif n % 2 == 0:
        print(2)
        print(1,n)
        print(1,n)
    else :
        print(4)
        print(1,n)
        print(1,n-1)
        print(n-1,n)
        print(n-1,n)