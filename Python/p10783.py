kasus = int(input())
for i in range(kasus):
    num1 = int(input())
    num2 = int(input())

    if num1 % 2 == 0:
        num1 += 1

    res = 0

    for j in range(num1, num2 + 1, 2):
        res += j

    print("Case {:d}: {:d}".format(i+1, res))
