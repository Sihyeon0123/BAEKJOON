t = int(input())
for _ in range(t):
    num, string = input().split()
    num = int(num)
    str_list = list(string)
    for str in str_list:
        for _ in range(num):
            print(str, end="")
    print("")

