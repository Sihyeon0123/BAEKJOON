import math

def solution(nums):
    answer = 0
    l = len(nums)

    for i in range(0, l-2):
        for j in range(i+1, l-1):
            for k in range(j+1, l):
                total = nums[i] + nums[j] + nums[k]
                is_prime = True
                # 소수 판별
                for n in range(2, int(math.sqrt(total)) + 1):
                    if total % n == 0:
                        is_prime = False
                        break
                if is_prime:
                    answer += 1

    return answer

v = []
while 1:
    temp = int(input())
    if temp >= 10:
        break
    else:
        v.append(temp)

print(solution(v))
