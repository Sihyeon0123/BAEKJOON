while 1:
    a, b = input().split()
    a = int(a)
    b = int(b)
    if a <= b and a != 0:  
        print("No")
    elif a > b:
        print("Yes")
    elif a == 0 and b == 0:
        break