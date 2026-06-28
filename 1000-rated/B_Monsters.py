t = int(input())


for _ in range(t):
    n , k = map(int,input().split())
    arr = list(map(int,input().split()))
    for i in range(n):
        arr[i] = arr[i] % k
        if arr[i] == 0:
            arr[i] = k
    
        
    
    arr = [[x,i] for i,x in enumerate(arr)]
    arr.sort(key = lambda x : (-x[0],x[1]))
    for i in arr:
        print(i[1]+1,end = " ")
    print()
