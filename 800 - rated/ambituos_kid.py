n = int(input()) 
nums = list(map(int,input().split(" "))) 
result = abs(nums[0] )
for i in nums :
    if abs(i) < result :
        result = abs(i)
print(result)