from collections import Counter
t = int(input())

for _ in range(t):
    n = int(input())
    arr = list(map(int,input().split(" ")))
    freq = Counter(arr)
    if len(freq) == 1 :
        print("YES")
    elif len(freq) > 2 :
        print("NO")
    else :
        val = list(freq.values())
        if n % 2 == 0 :
            if val[0] == val[1] :
                print("YES")
            else :
                print("NO")
        else :
            if abs(val[0] - val[1] ) == 1:
                print("YES")
            else :
                print("NO")
    


