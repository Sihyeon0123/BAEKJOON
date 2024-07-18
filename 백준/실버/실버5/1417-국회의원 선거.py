n = int(input())

candidates = []
count = 0

# 후보의 수만큼 입력받아 배열에 저장
for _ in range(n):
    candidates.append(int(input()))

# 다솜의 표를 따로 저장한다.
dasom = candidates.pop(0)

# 배열이 비어있는지 확인
if candidates != []:
    # 다솜의 표가 후보들보다 작은동안 가장 표가 많은 사람의 표를 -1하고
    # 다솜의 표에 +1 한다
    while dasom <= max(candidates):
        candidates[candidates.index(max(candidates))] -= 1
        dasom += 1
        count += 1

print(count)
    