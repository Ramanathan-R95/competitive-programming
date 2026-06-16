import math
t = int(input())
for _ in range(t):
    n , x = map(int,input().split(" "))
    arr = list(map(int,input().split(" ")))
    min = 0
    max = 0
    for i in arr:
        min += i
        max += math.ceil(i/x)
    min = math.ceil(min/x)
    print(min,max)