kasus = int(input())
# tempem = 1
for i in range(kasus):
    input()
    max = int(input())
    counter = int(input())
    for j in range(counter):
        for k in range(1, max+1):
            temp = str(k)
            print(temp*k)

        for k in range(max-1, 0, -1):
            temp = str(k)
            print(temp*k)

        if j != counter-1 or i != kasus-1:
            print()
