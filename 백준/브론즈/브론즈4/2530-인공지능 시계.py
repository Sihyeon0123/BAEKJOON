h, m, s = input().split()
h = int(h)
m = int(m)
s = int(s)
c = input()
c = int(c)
s = s + c
if s >= 60:
    while s >= 60:
        m += 1
        s -= 60

if m >= 60:
    while m >= 60:
        h = h + 1
        m = m - 60

if h >= 24:
    while h >= 24:
        h = h - 24

print(h, m, s)
