input_str = input()

result = []
x_count = 0

for index in range(len(input_str)):
    # index 위치의 문자가 X라면 x_count 증가
    if input_str[index] == 'X' and index != (len(input_str) - 1):
        x_count += 1

    # index가 마지막 이거나 .이라면
    elif index == (len(input_str) - 1) or input_str[index] == '.':
        if input_str[index] == 'X':
            x_count += 1

        # 몫
        quotient = x_count // 4 
        # 나머지
        remainder = x_count % 4        
        
        # 만약 4로 나눈 나머지가 2가 아니라면
        if remainder != 2 and remainder != 0:
            result = []
            result.append(-1)
            break

        else:
            for _ in range(quotient):
                result.append('AAAA')

            if remainder == 2:
                result.append('BB')

            x_count = 0

        if input_str[index] == '.':
            result.append('.')

print(''.join(map(str, result)))