t = int(input())

q = [0, 0, 0, 0]
axis = 0

for _ in range(t):
    x, y = map(int, input().split())
    
    if x == 0 or y == 0:
        axis += 1
    elif 0 < x and 0 < y:
        q[0] += 1
    elif x < 0 and 0 < y:
        q[1] += 1
    elif x < 0 and y < 0:
        q[2] += 1
    elif 0 < x and y < 0:
        q[3] += 1
for index, value in enumerate(q):
    print("Q%d: %d" %(index + 1, value))
print("AXIS: %d" %axis)