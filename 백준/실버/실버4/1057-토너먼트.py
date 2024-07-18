import math

N, kim, im = map(int, input().split())

to = [i for i in range(1, N + 1)]
count = 0

i = 0

while N != 1:
    count += 1
    # 대진자가 짝수인지 확인하여 부전승 유무를 확인
    if N % 2 == 0:
        i = N - 1
    else:
        i = N - 2
    
    # 대진을 진행하여 kim과 im이 아니면 임의로
    # 한명를 탈락시킨다.
    while 0 <= i:
        # 서로 만났는지 확인 후 만났으면 탈출
        if (to[i] == kim and to[i-1] == im) or (to[i] == im and to[i-1] == kim):
            N = 1
            break
        else:
            if to[i] != kim and to[i] != im:
                to.pop(i)
            else:
                to.pop(i - 1)
                
        i -= 2
    
    # 대진을 진행한 후 인원수를 계산한다
    N = math.ceil(N / 2)


print(count)


