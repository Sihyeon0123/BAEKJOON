n = int(input())
result = 0

for _ in range(n):
    vote = input()
    if vote == "1":
        result += 1
    else:
        result -= 1
if result < 0:
    print("Junhee is not cute!")
else:
    print("Junhee is cute!")