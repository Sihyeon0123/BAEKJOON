year = 1000
result = 0
for i in range(1000):
    if i % 400 == 0:
        result += 366
    elif i % 100 == 0:
        result += 365
    elif i % 4 == 0:
        result += 366
    else:
        result += 365
print(result)

over = 0 
for i in range(0,1000) :
    if i%400==0 :
        over +=366
    elif i%100==0 :
        over += 365
    elif i%4==0 :
        over += 366
    else :
        over += 365
print(over)