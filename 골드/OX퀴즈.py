t = int(input())

for _ in range(t):
    quiz_answer = input()
    temp = ""
    score_weight = 0
    total_score = 0
    for value in quiz_answer:
        if value == "O":# 입력된 값이 O라면
            if temp == "O":#이전 값이 O라면
                total_score += (score_weight + 1)
                score_weight += 1
            else:
                total_score += 1
                temp = "O"
                score_weight += 1
        else:
            temp = "X"
            score_weight = 0      
    print(total_score)
        