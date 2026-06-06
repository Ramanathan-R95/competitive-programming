t = int(input()) 
while t :
    n = int(input())
    s = input()
    
    temp = False 
    for i in range(1,n-1) :
        if s[i - 1]== "." and s[i] == "." and s[i + 1] == "." :
            temp = True
            break 
    if temp:
        print(2)
    else :
        c = 0
        for i in s :
            if i=="." :
                c+=1
        print(c)



    t-=1