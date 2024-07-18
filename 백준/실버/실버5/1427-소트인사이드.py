n = input()

tmp = []

for index in range(len(n)):
    tmp.append(n[index])

sorted_arr = sorted(tmp, reverse=True)

print(''.join(map(str, sorted_arr)))