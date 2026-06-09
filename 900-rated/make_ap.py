t = int(input())
for _ in range(t):
    a , b , c = map(int,input().split())
    result = False
    if 2*b - c > 0 and (2*b - c) % a == 0:
        result = True
    if (a+c) % (2*b) == 0 :
        result = True
    if 2*b - a > 0 and (2*b - a) % c == 0 :
        result = True
    if result:
        print("YES")
    else:
        print("NO")


