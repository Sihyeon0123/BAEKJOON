# 약속 장소 (https://www.acmicpc.net/problem/25542)
# 브루트포스 알고리즘

import sys

input = sys.stdin.readline


def is_similar(checker: str, target: str) -> bool:
    '''
    두 문자열이 비슷한지 확인하는 함수
    '''

    length = len(checker)
    counter = 0

    for idx in range(length):

        if checker[idx] != target[idx]:
            counter += 1

    if counter <= 1:
        return True
    else:
        return False


# 정보 입력
store_number, name_length = map(int, input().split())

name_list = []
first_checker = True

# 첫 문자열만 따로 분류하고 나머지는 이름 리스트에 기록
for _ in range(store_number):
    each_name = list(input().rstrip('\n'))

    if first_checker:
        target_name = each_name
        first_checker = False

    else:
        name_list.append(each_name)

# 첫 문자열을 통해 문자열 변형된 후보를 양산
result_set = set()

for idx in range(name_length):
    for alpha in range(65, 91):
        temp = target_name[:]
        temp[idx] = chr(alpha)
        result_set.add(''.join(temp))

# 확인하면서 후보를 소거
while result_set and name_list:

    now_check_name = name_list.pop()
    remove_target = set()

    for each_result in result_set:
        if not is_similar(now_check_name, each_result):
            remove_target.add(each_result)

    for each_target in remove_target:
        result_set.remove(each_target)

# 후보가 안 남았다면 문구를 출력, 후보가 남았다면 후보 중 하나를 출력한다.
if not result_set:
    print('CALL FRIEND')

else:
    print(result_set.pop())
