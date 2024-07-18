# 100x100 배열
image = [[0] * 100 for _ in range(100)]

n, m = map(int, input().split())

for _ in range(n):
    x1, y1, x2, y2 = map(int, input().split())


    # 입력받은 범위 만큼 +1
    for index_x in range(x1 - 1, x2):
        for index_y in range(y1 - 1, y2):
            image[index_x][index_y] += 1

count = 0

for index_x in range(100):
    for index_y in range(100):
        if image[index_x][index_y] > m:
            count += 1

print(count)