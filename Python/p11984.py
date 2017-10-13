kasus = int(input())
for i in range(kasus):
    awal, pertambahan = map(int, input().split())
    temp = ((9.0 / 5.0) * awal) + 32
    temp += pertambahan
    temp = ((temp - 32) * (5.0 / 9.0))
    print("Case {:d}: {:.2f}".format(i+1, temp))
