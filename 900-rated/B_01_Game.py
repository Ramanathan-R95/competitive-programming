t = int(input())
for _ in range(t):
    s = input()
    one_count = 0
    zero_count = 0
    for i in s:
        if i == "0":
            zero_count += 1
        else:
            one_count += 1
    m2 = min(zero_count,one_count)

    if m2 % 2 == 1:
        print("DA")
    else:
        print("NET")
