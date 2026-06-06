
t = int(input())


for _ in range(t):

    a , b  = map(int , input().split())
    p , q = map(int, input().split())
    r , s = map(int , input().split())


    s1 =set()
    s2 = set()
    s1.add((p+a,q+b))
    s1.add((p-a,q-b))
    s1.add((p-a,q+b))
    s1.add((p+a,q-b))
    s1.add((p+b,q+a))
    s1.add((p-b,q-a))
    s1.add((p-b,q+a))
    s1.add((p+b,q-a))

    p,q = r,s
    s2.add((p+a,q+b))
    s2.add((p-a,q-b))
    s2.add((p-a,q+b))
    s2.add((p+a,q-b))
    s2.add((p+b,q+a))
    s2.add((p-b,q-a))
    s2.add((p-b,q+a))
    s2.add((p+b,q-a))
    print(len(s1 & s2))

