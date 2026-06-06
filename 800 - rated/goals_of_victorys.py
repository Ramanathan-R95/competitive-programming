t = int(input())

for _ in range(t) :
    n = int(input())
    arr = list(map(int , input().split(" ")))
    s = sum(arr) * -1
    print(s) 
