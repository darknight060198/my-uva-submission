kasus = 1
while True:
    byk = int(input())
    if byk == 0:
        break
    masukan = input().split()
    a = 0
    b = 0
    for i in range(0,byk):
        temp = int(masukan[i])
        if temp == 0:
            b+=1
        else:
            a+=1
    
    print("Case {:d}: {:d}".format(kasus, (a-b)))
    kasus+=1