t = int(input()) 
while t :
    n , x = map(int , input().split())
    array = list(map(int,input().split()))
    minCapacity = array[0] 
    for i in range(1,n) :
        minCapacity = max(minCapacity, array[i]-array[i-1])
    minCapacity = max(minCapacity, (x - array[-1])*2) 
    print(minCapacity)
 
