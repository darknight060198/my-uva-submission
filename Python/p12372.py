tc = int(input())
for i in range(1,tc+1):
    masukan = input().split()
    if int(masukan[0]) < 21 and int(masukan[1]) < 21 and int(masukan[2]) < 21:
        print("Case {:d}: good".format(i))
    else:
        print("Case {:d}: bad".format(i))