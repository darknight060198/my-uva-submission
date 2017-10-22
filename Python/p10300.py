tc = int(input())
for i in range(tc):
    banyak = int(input())
    res = 0.0
    for j in range(banyak):
        luas, binatang, poin = map(int, input().split())
        hasil = (luas/binatang) * poin * binatang
        res += hasil

    print("{:.0f}".format(res))