str = input()
f = ""
l = ""
result = 1
for index in range(int(len(str)/2)):
    f = str[index]
    l = str[len(str) - 1 - index]
    if f != l:
        result = 0
        break
print(result)