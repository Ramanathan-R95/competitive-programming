t = int(input()) 
for _ in range(t) :
    n = int(input()) 
    nums = list(map(int,input().split(" "))) 
    result = [nums[0]] 
    for i in range(1 , len(nums)) :
        if nums[i] >= nums[i -1] :
            result.append(nums[i]) 
        else :
            result.append(nums[i])
            result.append(nums[i])
    print(len(result))
    for i in result :
        print(i,end=" ")

