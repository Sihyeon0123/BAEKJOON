N = int(input())

space = []
count_x = 0
count_y = 0

for _ in range(N):
    space.append(input())

for i in range(N):
    # 가로
    is_two = False
    tmp_x = ''
    for j in range(N):
        if j == 0:
            tmp_x = space[i][j]

        else:
            if tmp_x == '.' and space[i][j] == '.':
                is_two = True
            else:
                tmp_x = space[i][j]

            if space [i][j] == 'X' and is_two == True:
                is_two = False
                count_x += 1
                tmp_x = space[i][j]
        
    if is_two == True:
            count_x += 1

    # 세로
    is_two = False
    tmp_y = ''
    for j in range(N):
        if j == 0:
            tmp_y = space[j][i]

        else:
            if tmp_y == '.' and space[j][i] == '.':
                is_two = True
            else:
                tmp_y = space[j][i]

            if space [j][i] == 'X' and is_two == True:
                is_two = False
                count_y += 1
                tmp_y = space[j][i]
        
    if is_two == True:
            count_y += 1

print(count_x, count_y)
