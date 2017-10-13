import math

masukan = input().split()
s = int(masukan[0])
a = int(masukan[1])
command = masukan[2]
s += 6440
if a > 180:
    a = 360 - a
if command == "min":
    a /= 60
a = (math.pi * a) / 180
jarak = s * a
jarakchord = 2 * s * math.sin(a / 2)
print("{:.6f} {:.6f}".format(jarak, jarakchord))
