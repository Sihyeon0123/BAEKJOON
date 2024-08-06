def solution(bandage, health, attacks):
    answer = 0

    t = bandage[0] # 시전 시간
    x = bandage[1] # 초당 회복량
    y = bandage[2] # 성공 회복량
    
    # 최대 체력
    max_health = health
    
    i = 0 # 턴 수행
    j = 0 # 몬스터의 턴 수행
    k = 0 # 회복 연속 성공
    while 1:
        # 몬스터 공격 턴
        if i == attacks[j][0]:
            health -= attacks[j][1]
            j += 1
            k = 0
            if health <= 0:
                answer = -1
                break
        # 유저 회복
        else:
            # 초당 회복
            health += x
            # 초당 회복 성공 횟수
            k += 1
            
            # 시전 성공시 추가 회복
            if k == t:
                health += y
                k = 0
            
            # 최대 체력보다 높으면 안됨
            if health > max_health:
                health = max_health
                    
        # 몬스터가 공격을 종료하면 끝
        if j >= len(attacks):
            answer = health
            break
        i += 1
    
    return answer