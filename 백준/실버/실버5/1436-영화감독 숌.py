N = int(input())

result = 0
count = 0

while count < N:
    result += 1
    if '666' in str(result):
        count += 1
    
print(result)