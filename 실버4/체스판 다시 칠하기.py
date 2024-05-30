n, m = map(int, input().split())

chessboard = []

for _ in range(n):
    tmp = input()
    chessboard.append(tmp)

# 기준 좌표
topLeft = (0,0)
# 기준 좌표별 에러(새로 칠해야할 블럭) 개수
error_list = []

for y in range(n - 7):
    topLeft = (topLeft[0], y)
    for x in range(m - 7):
        topLeft = (x, topLeft[1])
        error_count_b = 0
        error_count_w = 0


        for i in range(8):
            tmp = ''
            for j in range(8):
                if j == 0:
                    if i % 2 == 1:
                        tmp = 'B'
                        if chessboard[topLeft[1] + i][topLeft[0] + j] != 'B':
                            error_count_b += 1
                    else:
                        tmp = 'W'
                        if chessboard[topLeft[1] + i][topLeft[0] + j] != 'W':
                            error_count_b += 1
                else:
                    if tmp != chessboard[topLeft[1] + i][topLeft[0] + j]:
                        tmp = chessboard[topLeft[1] + i][topLeft[0] + j]
                    else:
                        error_count_b += 1
                        
                        if tmp == 'W':
                            tmp = 'B'
                        else:
                            tmp = 'W'

        for i in range(8):
            tmp = ''
            for j in range(8):
                if j == 0:
                    if i % 2 == 1:
                        tmp = 'W'
                        if chessboard[topLeft[1] + i][topLeft[0] + j] != 'W':
                            error_count_w += 1
                    else:
                        tmp = 'B'
                        if chessboard[topLeft[1] + i][topLeft[0] + j] != 'B':
                            error_count_w += 1
                else:
                    if tmp != chessboard[topLeft[1] + i][topLeft[0] + j]:
                        tmp = chessboard[topLeft[1] + i][topLeft[0] + j]
                    else:
                        error_count_w += 1
                        
                        if tmp == 'W':
                            tmp = 'B'
                        else:
                            tmp = 'W'

        if error_count_w < error_count_b:
            tmp = (topLeft, error_count_w)
        else:
            tmp = (topLeft, error_count_b)

        error_list.append(tmp)                 

min_value = min(error_list, key=lambda x: x[1])
print(min_value[1])