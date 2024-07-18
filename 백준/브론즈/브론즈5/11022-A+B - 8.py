repeat_count = int(input())
for count in range(repeat_count):
    a, b = input().split()
    a = int(a)
    b = int(b)
    print("Case #" + str(count + 1) + ": " + str(a) + " + " + str(b) + " = " + str(a + b))