tc = int(input())
for j in range(0,tc):
    byk = int(input())
    max = -1
    min = 100
    masukan = input().split();
    for i in range(0,byk):
        temp = int(masukan[i])
        if temp > max:
            max = temp
        if temp < min:
            min = temp
    
    print(2*(max-min))