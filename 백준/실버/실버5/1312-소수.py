a, b, n = map(int, input().split())

# 나머지 계산
remainder = a % b

result = []

for _ in range(n + 1):
    remainder *= 10
    result_digit = remainder // b
    result.append(result_digit)
    remainder = remainder % b

print(result[n - 1])
