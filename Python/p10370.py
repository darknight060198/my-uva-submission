kasus = int(input())
for i in range(kasus):
    masukan = input().split()
    banyak = int(masukan[0])
    del masukan[0]
    masukan2 = list()
    for j in masukan:
        masukan2.append(int(j))

    sum = 0
    for j in masukan2:
        sum += j

    average = sum/banyak

    count = 0

    for j in masukan2:
        if j > average:
            count += 1

    res = (count/banyak)*100

    print("{:.3f}%".format(res))

