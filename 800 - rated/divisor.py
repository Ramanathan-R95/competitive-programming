t = int(input())
for _ in range(t):
    n = int(input())
    result = 1
    for i in range(2,50):
        if n % i == 0:
            result += 1
        else:
            break
    print(result)
