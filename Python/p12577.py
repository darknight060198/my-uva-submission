tc = 1
while True:
    masukan = input()
    if masukan == "*":
        break
    elif masukan == "Hajj":
        print("Case {:d}: Hajj-e-Akbar".format(tc))
        tc += 1
    else:
        print("Case {:d}: Hajj-e-Asghar".format(tc))
        tc += 1