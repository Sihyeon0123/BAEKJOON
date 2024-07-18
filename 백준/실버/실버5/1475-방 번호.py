n = input()

count_list = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

for value in n:
    count_list[int(value) ] += 1

count_list[6] += count_list[9]
count_list[9] = 0

if count_list[6] % 2 != 0:
    count_list[6] = (count_list[6] // 2) + 1

else:
    count_list[6] = count_list[6] // 2

print(max(count_list))