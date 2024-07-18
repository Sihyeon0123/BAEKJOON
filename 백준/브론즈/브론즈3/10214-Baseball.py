t = int(input())
y = k = 0
for _ in range(t):
    for _ in range(9):
        a, b = map(int, input().split())
        y += a
        k += b
    if y < k:
        print("Korea")
    elif y == k:
        print("Draw")
    else:
        print("Yonsei")