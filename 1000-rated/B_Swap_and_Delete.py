n = int(input())
for _ in range(n):
    s = input()
    one_count = 0
    zero_count = 0
    for i in s:
        if i == "1":
            one_count += 1
        else:
            zero_count += 1
    if one_count == zero_count:
        print(0)
    else:
        for i in range(len(s)):
            if zero_count > 0 and s[i] == "1":
                zero_count-=1
            elif one_count > 0 and s[i] == "0":
                one_count -= 1
            else:
                break
        print(len(s) - i  )