t = int(input())

for _ in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    result = 0
    for i in range(n-2,-1,-1):
        while arr[i] >= arr[i+1]:
            if arr[i] == 0:
                result = -1
                break
            result += 1
            arr[i] //= 2
        if arr[i] == 0 and arr[i+1] == 0:
            result = -1
            break
    print(result)