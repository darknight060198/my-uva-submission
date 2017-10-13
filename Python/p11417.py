def findGCD(num1, num2):
    while num1 != 0 and num2 != 0:
        c = num1%num2
        num1 = num2
        num2 = c
        
    if num1 == 0:
        return num2
    else :
        return num1

while (True):
    n = int(input())
    if n == 0:
        break
    
    g = 0
    for i in range(1,n):
        for j in range(i+1, n+1):
            g += findGCD(i,j)
            
    print(g)