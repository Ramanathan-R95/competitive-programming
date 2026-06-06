t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    result = arr[-1] - arr[0]
    temp = arr[0]
    for i in range(1,n):
        result = max(result,arr[i] - temp)
    temp = arr[-1]
    for i in range(n-1):
        result = max(result,temp - arr[i])
    for i in range(n-1):
        result = max(result , arr[i] - arr[i+1])
    print(result)

