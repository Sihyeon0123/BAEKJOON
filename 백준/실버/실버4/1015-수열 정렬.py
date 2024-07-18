N = int(input())

p_list = [i for i in range(N)]

a_list = list(map(int, input().split()))

b_list = [0 for _ in range(N)]

for i in range(N):
    b_list[p_list[i]] = a_list[i]

result_list = [0 for _ in range(N)]

for i in range(N):
    result_list[b_list.index(min(b_list))] = i
    b_list[b_list.index(min(b_list))] = 1001

print(' '.join(map(str, result_list)))  # 결과 배열을 문자열로 출력