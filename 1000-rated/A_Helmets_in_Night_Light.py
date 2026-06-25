t = int(input())
for _ in range(t):
    n , p = map(int,input().split())
    
    a = list(map(int,input().split()))
    b = list(map(int,input().split()))
    cost = p
    n-=1
    b_new = [[x,i] for i,x in enumerate(b)]
    b_new.sort()
    cur = 0
    while n > 0:
        if p <= b_new[cur][0]:
            cost += n*p
            n = 0
        else:
            if n >= a[b_new[cur][1]]:
                cost += b_new[cur][0] * a[b_new[cur][1]]
            else:
                cost += b_new[cur][0] * n

            n-= a[b_new[cur][1]]
            cur+=1
    print(cost)