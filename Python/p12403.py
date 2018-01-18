tc = int(input())
res = 0
for i in range(0,tc):
    masukan = input().split()
    if masukan[0] == "donate":
        res += int(masukan[1])
    else:
        print(res)