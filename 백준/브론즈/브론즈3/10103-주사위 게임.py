n = int(input())
j = 100
s = 100

for _ in range(n):
    a, b = map(int, input().split())
    if a < b:
        j -= b
    elif a == b:
        pass
    else:
        s -= a
print("%d\n%d"%(j, s))