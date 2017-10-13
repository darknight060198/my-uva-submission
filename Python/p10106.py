while(True):
    try:
        num1 = int(input())
        num2 = int(input())

        print("{:d}".format(num1*num2))
    except EOFError:
        break;