import collections 

def bfs(land: list, visited: list, result: list):
    q = collections.deque()

    for x in range(len(land[0])):
        for y in range(len(land)):
            if land[y][x] == 1 and visited[y][x] != 1:
                # 첫 위치 방문 처리
                q.append((x, y))
                visited[y][x] = 1

                dx = [0, 0, -1, 1]
                dy = [1, -1, 0, 0]

                min_x = x
                max_x = x

                count = 1

                while q:
                    cur = q.popleft()
                    
                    for i in range(4):
                        nx = dx[i] + cur[0]
                        ny = dy[i] + cur[1]

                        if 0 <= nx < len(land[0]) and 0 <= ny < len(land):
                            if visited[ny][nx] != 1 and land[ny][nx] == 1:
                                max_x = max(max_x, nx)
                                q.append((nx, ny))
                                visited[ny][nx] = 1
                                count += 1
                
                for i in range(min_x, max_x + 1):
                    result[i] += count

    return result

def solution(land):
    answer = 0
    result = [0 for i in range(len(land[0]))]
    visited = [[0 for i in range(len(land[0]))] for j in range(len(land))]

    answer = max(bfs(land, visited, result))
    
    
    return answer