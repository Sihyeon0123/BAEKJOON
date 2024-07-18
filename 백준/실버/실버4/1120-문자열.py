a, b = input().split()

result = []

# 처음부터 a, b의 길이차이 만큼 옮겨가며 반복
for index in range(len(b) - len(a) + 1):
    count = 0
    
    for j in range(len(a)):
        # 해당 인덱스 위치 기준 문자열 비교
        if a[j] != b[index + j]:
            count += 1
            
    result.append(count)

print(min(result))