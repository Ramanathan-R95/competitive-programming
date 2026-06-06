t = int(input())
for _ in range(t):
    n , k = map(int,input().split())
    a = list(map(int,input().split()))
    a.sort()
    result = 1
    cur = 1
    for i in range(1,n):
        if a[i] - a[i - 1] <= k :
            cur +=1
        else :
            cur = 1
        result = max(result,cur)
    print(n - result)

        