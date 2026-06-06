t=int(input())
for _ in range(t):
    n = int(input())
    nums = list(map(int,input().split()))
    m = float("inf")
    temp = False
    for i in range(1,len(nums)):
        if nums[i] < nums[i-1] :
            temp = True
            break
        m = min(m,(nums[i] - nums[i-1])//2  + 1)
    if temp:
        print(0)
    else :
        print(m)
        