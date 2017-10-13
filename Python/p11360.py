kasus = int(input())
for i in range(kasus):
    banyak = int(input())
    data = [[0 for x in range(banyak)] for y in range(banyak)]
    for j in range(banyak):
        temp = int(input())
        for k in range(banyak-1, -1, -1):
            data[j][k] = temp % 10
            temp = int(temp/10)

    bykComm = int(input())
    for j in range(bykComm):
        command = input().split()
        if command[0] == "row":
            for l in range(banyak):
                temp = data[int(command[1]) - 1][l]
                data[int(command[1]) - 1][l] = data[int(command[2]) - 1][l]
                data[int(command[2]) - 1][l] = temp

        elif command[0] == "col":
            for l in range(banyak):
                temp = data[l][int(command[1]) - 1]
                data[l][int(command[1]) - 1] = data[l][int(command[2]) - 1]
                data[l][int(command[2]) - 1] = temp

        elif command[0] == "inc":
            for k in range(banyak):
                for l in range(banyak):
                    data[k][l] += 1
                    if data[k][l] > 9:
                        data[k][l] %= 10

        elif command[0] == "dec":
            for k in range(banyak):
                for l in range(banyak):
                    data[k][l] -= 1
                    if data[k][l] < 0:
                        data[k][l] += 10

        else:
            data2 = [[0 for x in range(banyak)] for y in range(banyak)]
            for k in range(banyak):
                for l in range(banyak):
                    data2[l][k] = data[k][l]

            for k in range(banyak):
                for l in range(banyak):
                    data[k][l] = data2[k][l]

    print("Case #{:d}".format(i + 1))
    for j in range(banyak):
        res = ""
        for k in range(banyak):
            res += str(data[j][k])

        print(res)

    print()
