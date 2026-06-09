t = int(input())
for _ in range(t):
    x , n = map(int,input().split())
    rem = n % 4 
    st = n - rem + 1
    result = x 
    for i in range(rem):
        if result % 2 == 0:
            result -= st 
        else:
            result += st
        st+=1
    print(result)




#  -1
# 1
# 11
# 110
# 190
# 9012345679
# -87611785637
# 1