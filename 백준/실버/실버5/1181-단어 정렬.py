n = int(input())
string_list = []

for _ in range(n):
    string_list.append(input())

# 문자열의 길이에 따라 정렬 & 문자열의 길이가 같은 단어들을 사전순으로 정렬
sorted_strings = sorted(string_list, key=lambda x: (len(x), x))

result_list = []
tmp = ""
for index, text in enumerate(sorted_strings):
    if tmp == text:
        pass
    else:
        result_list.append(text)
        tmp = text    
        
# 정렬된 결과를 출력
for text in result_list:
    print(text)
