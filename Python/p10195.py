import sys
import math

while (True) :
    try :
      masukan = input()
      masukan2 = masukan.split()
      num1 = float(masukan2[0])
      num2 = float(masukan2[1])
      num3 = float(masukan2[2])

      s = (num1+num2+num3)/2
      if s == 0:
        print('The radius of the round table is: 0.000')    
        continue
        
      luas = math.sqrt(s*(s-num1)*(s-num2)*(s-num3))

      res = luas/s

      print('The radius of the round table is: {:.3f}'.format(res))

    except EOFError:
      break