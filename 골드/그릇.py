str = input()

temp = ""
result = 0

for obj in str:
    if temp != obj:
        result += 10
        temp = obj
    elif temp == obj:
        result += 5        
        temp = obj
    print(result)
