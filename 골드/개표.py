v = int(input())
vote = input()

a = 0
b = 0
for index, char in enumerate(vote[:v]):
    if char == 'A':
        a += 1
    elif char == 'B':
        b += 1
if a < b:
    print("B")
elif  a == b :
    print("Tie")
elif a > b:
    print("A")