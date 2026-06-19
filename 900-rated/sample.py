msg = input("Text :")
words = msg.split()

result = list(map(lambda x : [len(x),x] ,words))
result.sort()
temp = list(map(lambda x:x[1],result))
print("OUTPUT :",*temp)