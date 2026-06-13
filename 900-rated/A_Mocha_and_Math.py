t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    result = arr[0]
    for i in range(1,n):
        result = result & arr[i]

        
            
    print(result)