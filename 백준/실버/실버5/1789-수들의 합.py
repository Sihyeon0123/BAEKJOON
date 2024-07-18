# 연속된 자연수 1부터 N까지의 합은 = N * (N + 1) / 2
# 즉 S = N * (N + 1) / 2
# 0 = N^2 + N - 2S 
# 근의 공식
# N = (-b ± √(b^2 - 4ac)) / 2a
# 여기서 a = 1, b = 1, c = 2S
# 대입하면 N = (-1 ± √(1^2 - 8S)) / 2
# N = ((-1 + sqrt(1 + 8 * S)) / 2
import math

s = int(input())
n = int(((-1 + math.sqrt(1 + 8 * s)) / 2))
print(n)