N = int(input())

a_arr = []
b_arr = []

a_arr = list(map(int, input().split()))
b_arr = list(map(int, input().split()))

a_arr.sort()

result = 0

for _ in range(N):
    result += b_arr[b_arr.index(max(b_arr))] * a_arr.pop(0)
    b_arr.pop(b_arr.index(max(b_arr)))
    

print(result)