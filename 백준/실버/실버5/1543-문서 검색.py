input_str = input()
search_str = input()

count = 0
input_str_index = 0

# 현재 탐색시작 위치가 input_str보다 작은동안(범위 안에 있는동안)
while input_str_index < len(input_str):

    temp = ''
    # search_str의 길이만큼 input_str에서 잘라내 temp에 저장
    for i in range(len(search_str)):
        if (input_str_index + i) <= len(input_str) - 1:
            temp += input_str[input_str_index + i]

    if temp == search_str:
        count += 1
        input_str_index += len(search_str)
    
    else:
        input_str_index += 1

print(count)       