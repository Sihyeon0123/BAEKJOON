while 1:
    num = int(input())
    divisor = []  # 약수를 저장하는 배열
    if num == -1:
        break
    else:
        for value in range(num//2):
            if num % (value + 1) == 0:
                divisor.append(value + 1)
            
        total = 0
        for number in divisor:
            total += number
        if total == num:
            print(num,"=", " + ".join(map(str, divisor)))
        else:
            print("%d is NOT perfect." %num)