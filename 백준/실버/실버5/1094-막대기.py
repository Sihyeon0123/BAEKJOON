x = int(input())
stick = [64]

while 1:
    # 가진 막대들의 길이가 x 보다 크다면
    if x < sum(stick):
        # 가진 막대중 가장 짧은 막대를 반으로 가른다.
        stick[stick.index(min(stick))] = int(min(stick) / 2)
        if sum(stick) < x:
            stick.append(min(stick))
    
    # 구하고자 하는 값이 나온다면 나간다.
    if x == sum(stick):
        break

print(len(stick))