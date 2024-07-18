k, n, m = map(int, input().split())

temp = m - (k * n)
if temp < 0:
    print(temp * -1)
else:
    print(0)