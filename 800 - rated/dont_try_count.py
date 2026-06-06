t = int(input())
for _ in range(t):
    n,m = map(int,input().split(" "))
    x = input()
    s = input()
    c = 0
    while len(x) <= 200 :
        if s in x :
            print(c)
            break
        
        c+=1
        x+=x
    
    else:
        print(-1)



    
