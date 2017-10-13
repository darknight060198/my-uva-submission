def fungsi(i):
    if i <= 0:
        return 0
    ans = 0
    while i != 0:
        ans += 45 * int((i / 10))
        for i in range(int(i / 10) * 10 + 1, i + 1):
            ans += i % 10

        i = int(i / 10)

    return ans


while True:
    masukan = input().split()
    p = int(masukan[0])
    q = int(masukan[1])
    if p < 0 and q < 0:
        break
    
    print(int(fungsi(q) - fungsi(p - 1)))
