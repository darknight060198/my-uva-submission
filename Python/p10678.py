import math

tc = int(input())
for i in range (tc):
    d, l = map(int, input().split())
    d/=2
    l/=2
    c = d
    a = l
    b = math.sqrt(a*a - c*c)
    print("{:.3f}".format(math.pi*a*b))