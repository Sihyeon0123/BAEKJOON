num = int(input())

result = 0

if num < 100:
    print(num)
    exit(0)
else:
    result = 99
    for value in range(100, num + 1):
        hun = value // 100
        ten = (value // 10) % 10
        one = value % 10
    
        if (hun - ten) == (ten - one):
            result += 1
            
print(result)