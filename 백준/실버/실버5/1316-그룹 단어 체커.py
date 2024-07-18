n = int(input())

str_list = []
count = 0

for _ in range(n):
    str_list.append(input())

for value in str_list: # 리스트 속의 단어를 순회
    alphabet_list = []
    alphabet_list_index = 0
    isSeqWord = True

    for index in range(len(value)): # 단어의 길이만큼 알파벳별로 계산
        if index == 0: # 처음에는 배열이 비어있기 때문에 무조건 삽입
            tmp_list = []
            tmp_list.append(value[index])
            tmp_list.append(True)
            alphabet_list.append(tmp_list)

         # 처음이 아니라면 리스트속의 알파벳을 모두 비교하고 없다면 추가,
         # 있다면 연속적인지 판단 후 그룹 단어인지 판단한다.
        else:
            isInList = False
            isSeqAlpha_ = None

            for alphabet, isSeqAlpha in alphabet_list:                
                if alphabet == value[index]:
                    isInList = True
                    isSeqAlpha_ = isSeqAlpha

            if isInList: # 만약 리스트 안에 있다면                
                if isSeqAlpha_: # 만약 연속적이라면
                    pass

                else:
                    isSeqWord = False
                    break

            else: # 리스트에 없는 값이라면 추가한다
                tmp_list = []
                tmp_list.append(value[index])
                tmp_list.append(True)
                alphabet_list.append(tmp_list)
                
                # 이전 철자는 더이상 연속적이지 않음을 표시
                alphabet_list[alphabet_list_index][1] = False 
                alphabet_list_index += 1
    
    if isSeqWord:
        count += 1

print(count)