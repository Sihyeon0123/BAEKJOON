s = str(input())

count_zero = 0
count_one = 0
tmp = -1

for index in s:
    if index == '0':
        if tmp == 0:
            pass

        else:
            count_zero += 1
            tmp = 0

    else:
        if tmp == 1:
            pass

        else:
            count_one += 1
            tmp = 1

# min() 함수를 사용하여 두 변수 중에서 낮은 값을 출력
result = min(count_zero, count_one)
print(result)