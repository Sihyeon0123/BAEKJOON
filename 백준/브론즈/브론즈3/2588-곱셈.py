a = input()
b = input()
a = int(a)
b = int(b)
result = a * b
numlist = []
while(b != 0):
    numlist.append(b % 10)
    b = b//10

for value in numlist:
    print(str(value * a))
print(result)