n = int(input())
for _ in range(n):
    
    [s,t] = input().split()
    map = {}
    temp1 = list(s)
    result = ""
    for i in t:
        if i in map:
            map[i] += 1
        else:
            map[i] = 1
    for i in range(len(s)-1,-1,-1):
        
        if temp1[i] in map:
            if map[temp1[i]] > 0:
               map[temp1[i]] -= 1
            else:
               temp1[i] = "@"
        else:
            temp1[i] = "@"
        
    for i in temp1:
        if i != "@":
            result += i
    if result == t:
        print("YES")
    else:
        print("NO")
    
    
    
    

        

        