from collections import Counter

x_list =[]
y_list =[]

for _ in range(3):
    x, y = map(int, input().split())
    x_list.append(x)
    y_list.append(y)

x_result = x_list[0] ^ x_list[1] ^ x_list[2]
y_result = y_list[0] ^ y_list[1] ^ y_list[2]
print(x_result, y_result)