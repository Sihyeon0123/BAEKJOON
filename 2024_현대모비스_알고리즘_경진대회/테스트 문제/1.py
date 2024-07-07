def solution(n, m):
    answer = 0
    
    for i in range(n, m + 1):
        s = str(i)
        if s == s[::-1]:
            answer += 1

    return answer

n, m = map(int,input().split())

print(solution(n, m))