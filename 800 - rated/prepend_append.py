t=int(input())
for _ in range(t):
    n=int(input())
    str=input()
    l=0
    r=n-1
    while l < r and str[l] != str[r]:
        l+=1
        r-=1
    if l > r or n==0:
        print(0)
    else:
        print(r-l+1)
    
    
