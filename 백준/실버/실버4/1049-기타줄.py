n, m = map(int, input().split())

result = 0
guitar_list_6 = []
guitar_list_1 = []

for _ in range(m):
    tmp_a, tmp_b = map(int, input().split())
    guitar_list_6.append(tmp_a)
    guitar_list_1.append(tmp_b)

while 6 <= n:
    if min(guitar_list_6) < (min(guitar_list_1)*6):
        n -= 6
        result += min(guitar_list_6 )
    else:
        n -= 6
        result += min(guitar_list_1) * 6

if 1 <= n:
    tmp = min(guitar_list_1) * n
    if tmp < min(guitar_list_6):
        result += tmp
    else:
        result += min(guitar_list_6)

print(result)