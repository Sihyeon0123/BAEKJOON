t = int(input())
s = []

for _ in range(t):
    n = int(input())
    for _ in range(n):
        school_name, num = input().split()
        s.append((school_name, int(num)))
    result = max(s, key=lambda x: x[1])
    print(result[0])