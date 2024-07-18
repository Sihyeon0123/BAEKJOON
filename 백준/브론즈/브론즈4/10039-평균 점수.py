score = 0
for _ in range(5):
    temp = int(input())
    if temp < 40:
        score += 40
    else:
        score += temp
print(int(score/5))
    
