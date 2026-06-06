import sys 

t = int(input()) 

for _ in range(t) :
    score = 0 
    for i in range(10) :
        s = sys.stdin.readline() 
        for j in range(len(s)) :
            if s[j] == "X" : score += min(i,j,9-i,9-j)  + 1
    print(score) 