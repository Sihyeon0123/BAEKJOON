n, k = map(int, input().split())

queue = [i for i in range(1, n + 1)]
result = []

front = 0
while len(queue) > 0:
    for _ in range(k - 1): 
        front += 1
        if front >= len(queue):
            front = 0
        
    result.append(queue.pop(front))
    
    if front >= len(queue):
        front = 0

print('<' + ', '.join(map(str, result)) + '>')