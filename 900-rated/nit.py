t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int,input().split()))
    c = 0 
    for i in arr:
        if i == 0 :
            c+=1
    if c==n:
        print(0)
    else:
        flag = False
        left = 0
        right = n-1
        while arr[left] == 0:
            left+=1
        while arr[right] ==0:
            right-=1
        for i in range(left , right+1):
            if arr[i] == 0:
                flag = True
                break
        if flag:
            print(2)
        else:
            print(1)

        



# 0
# 3333333

# 012


#  0 0 1 5 0 9 4  0 
#      l     r