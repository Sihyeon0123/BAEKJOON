# 이 문제는 모든 경우의 수를 탐색해야하는 브루트포스 알고리즘(완전탐색) 문제입니다.
# 정답인거 같은데 틀렸다고 나오면 afbdba -> abdbfa 넣어보세요!
my_str = input()

result_list = []
# 최소 3개의 단어로 나누어야 하기 때문에 최대 반복을 제한
for i in range(1, len(my_str) - 2):
    
    for j in range(i + 1, len(my_str)):
        tmp = [] # 자른 단어를 임시 저장할 공간
        tmp.append(my_str[:i][::-1]) # 각각 자른 문자열을 뒤집어서 배열에 저장
        tmp.append(my_str[i:j][::-1])
        tmp.append(my_str[j:][::-1])
        result_list.append("".join(tmp)) # 배열에 저장된 3 단어를 붙여서 저장
        
print(min(result_list)) # 저장된 배열중 가장 작은 문자를 찾아 출력