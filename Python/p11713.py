def isVowel (c):
    return c == 'a' or c == 'i' or c == 'u' or c == 'e' or c == 'o'

tc = int(input())
for i in range(0,tc):
    first = input()
    second = input()
    if len(first) != len(second):
        print("No")
    else:
        status = True
        pjg = len(first)
        for j in range(0,pjg):
            if not isVowel(first[j]) or not isVowel(second[j]):
                if first[j] != second[j]:
                    print("No")
                    status = False
                    break;
        
        if status:
            print("Yes")