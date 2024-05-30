while 1:
    a, b = map(int, input().split())

    if a == 0 and b == 0:
        break
    elif b % a == 0:# 만약 a가 b의 약수라면 
        print("factor")
    elif a % b == 0:# 만약 b가 a의 약수라면
        print("multiple")
    else:
        print("neither")
