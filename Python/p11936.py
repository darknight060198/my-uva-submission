kasus = int(input())
while kasus > 0:
    masukan = input()
    masukan2 = masukan.split()
    num1 = int(masukan2[0])
    num2 = int(masukan2[1])
    num3 = int(masukan2[2])

    if num1+num2 > num3 and num1+num3 > num2 and num2+num3 > num1:
        print("OK")
    else:
        print("Wrong!!")

    kasus -= 1