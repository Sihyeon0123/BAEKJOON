# 시나리오 번호
scenario_no = 0

# 0이 입력될때 까지 무한 반복
while 1:
    scenario_no += 1

    n = int(input())

    # 0이라면 종료
    if n == 0:
        break

    # 압수자 이름을 저장할 배열
    name_list = []
    
    confis_list = []
    
    for index in range(1, n + 1):
        # earring_list.append(index)
        confis_list.append(False)

    for _ in range(n):
        name_list.append(input())

    # 2n - 1 만큼 반복하며 
    for _ in range(((n * 2) -1)):
        a, b = input().split()
        a = int(a)
        confis_list[a - 1] = not confis_list[a-1]

    print(scenario_no, name_list[confis_list.index(True)])

