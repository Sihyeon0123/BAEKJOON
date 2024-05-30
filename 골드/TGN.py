n = int(input())

for _ in range(n):
    r, e, c = map(int, input().split())
    temp = e - r
    result = temp - c
    if result > 0:
        print("advertise")
    elif result == 0:
        print("does not matter")
    else:
        print("do not advertise")
