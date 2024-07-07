def solution(n):
    answer = 0
    for i in range(len(n)):
        answer = answer + int(n[i])
    return answer

print(solution(input()))

