E, S, M = map(int, input().split())

count_year = 0
e = s = m = 0


while 1:
    count_year += 1
    e += 1
    s += 1
    m += 1
    
    if 15 < e:
        e = 1
    
    if 28 < s:
        s = 1
    
    if 19 < m:
        m = 1

    if E == e and S == s and M == m:
        break

print(count_year)