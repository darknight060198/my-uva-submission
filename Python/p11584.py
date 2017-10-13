while True:
  masukan = input()
  masukan2 = masukan.split()
  num1 = int(masukan2[0])
  num2 = int(masukan2[1])
  num3 = int(masukan2[2])
  if num1 == 0 and num2 == 0 and num3 == 0:
    break
  
  if num1 > num2 and num1 > num3 :
    temp = num1
    num1 = num3
    num3 = temp
  elif num2 > num1 and num2 > num3 :
    temp = num2
    num2 = num3
    num3 = temp
  
  res1 = num1*num1
  res2 = num2*num2
  res3 = num3*num3
  
  if res1 + res2 == res3 :
    print("right")
  else :
    print("wrong")