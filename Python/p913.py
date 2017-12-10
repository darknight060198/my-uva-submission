while True:
    try:
        n = int(input())
        ganjilTerakhir = int((n*(n+2))/2)
        res = (ganjilTerakhir*3) -6
        print(res)
    except EOFError:
        break