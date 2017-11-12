cases = int(input())
for x in range(cases):
    sequence = int(input())
    array = [0] * 10
    for word in range(1,sequence+1):
        for c in str(word):
            digit = int(c)
            array[digit] = array[digit] + 1
    print (' '.join(str(e) for e in array))