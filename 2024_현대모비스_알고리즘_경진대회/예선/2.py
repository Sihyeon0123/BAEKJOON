def solution(n, points):
    answer = 0

    # 공간 초기화
    place = [[0 for j in range(n)] for i in range(n)]
    
    # 샤시모듈 초기화
        # i = [X, Y]
        # place[Y][X]
    temp = 1
    # 
    floor1_length = len(points)

    for x, y in points:
        # 좌표 변환: 좌측 하단 (1,1)이 배열의 (N-1,0) 위치에 해당합니다.
        transformed_x = n - y
        transformed_y = x - 1
        place[transformed_x][transformed_y] = temp
        temp += 1

    # 샤시모듈 출력 확인
    for i in place:
        print(i)

    # 2층 추가
    for block1 in range(2, n+1):
        for block2 in range(2, n+1):
            
    return answer

# n = int(input())
n = 4
# 배열 생성
points = [[1,4],[1,2],[2,2],[3,2],[4,2]]

# while 1:
#     temp = []
#     x, y = map(int, input().split())
#     if x < 0:
#         break
#     temp.append(x)
#     temp.append(y)
#     points.append(temp)
    
solution(n, points)
