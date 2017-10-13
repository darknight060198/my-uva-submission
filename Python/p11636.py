while(True):
    try:
        masukan = input()
        masukan2 = masukan.split()
        v = int(masukan2[0])
        t = int(masukan2[1])
        print("{:d}".format(v*t*2))
    except EOFError:
        break