h, m = input().split()
h = int(h)
m = int(m)
c = input()
c = int(c)
m = m + c
if m >= 60:
    while m >= 60:
        h = h + 1
        m = m - 60

if h >= 24:
    while h >= 24:
        h = h - 24

print(h, m)
