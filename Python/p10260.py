def konvertHuruf(c):
    if c == "B" or c == "F" or c == "P" or c == "V":
        return 1
    elif c == "C" or c == "G" or c == "J" or c == "K" or c == "Q" or c == "S" or c == "X" or c == "Z":
        return 2
    elif c == "D" or c == "T":
        return 3
    elif c == "L":
        return 4
    elif c == "M" or c == "N":
        return 5
    elif c == "R":
        return 6
    else:
        return 0


while True:
    try:
        sebelum = -5
        hasil = ""
        masukan = input()
        panjang = len(masukan)
        for i in range(panjang):
            temp = konvertHuruf(masukan[i])
            if temp == sebelum:
                continue
            else:
                if temp == 0:
                    sebelum = -5
                else:
                    hasil += str(temp)
                    sebelum = temp

        print(hasil)

    except EOFError:
        break
