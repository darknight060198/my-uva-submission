while(True):
    try:
        a, b = map(int, input().split())
        res = a + (a-1) / (b-1)
        print(int(res))
    except EOFError:
        break