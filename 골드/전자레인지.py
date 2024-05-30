a = 300
b = 60
c = 10
button_counts = [0, 0, 0]

t = int(input())
if t % c != 0: # 계산이 불가한 경우
    print(-1)
else:
    if t // a > 0:
        button_counts[0] = t//a
        t -= (t//a) * a
        
    if t // b > 0:
        button_counts[1] = t//b
        t -= (t//b) * b
        
    if t // c > 0:
        button_counts[2] = t//c
        t -= (t//c) * c
        
    print(" ".join(map(str, button_counts)))