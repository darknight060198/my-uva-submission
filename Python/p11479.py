kasus = int(input())
temp = 0
while temp != kasus:
    masukan = input()
    masukan2 = masukan.split()
    num1 = int(masukan2[0])
    num2 = int(masukan2[1])
    num3 = int(masukan2[2])

    if num1+num2 <= num3 or num2+num3 <= num1 or num3+ num1 <= num2:
        print("Case {:d}: Invalid".format(temp+1))
    elif num1 == num2 == num3 :
        print("Case {:d}: Equilateral".format(temp+1))
    elif num1 == num2 or num2 == num3 or num3 == num1:
        print("Case {:d}: Isosceles".format(temp+1))
    else:
        print("Case {:d}: Scalene".format(temp+1))

    temp += 1