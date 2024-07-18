L = int(input())
S = list(map(int, input().split()))
n = int(input())

S.sort()

a = 0
b = 0

for i in range(L):
    if S[i] < n:
        a = S[i]
    elif n < S[i] and b == 0:
        b = S[i]

a += 1
b -= 1

if n in S:
    print(0)
else:
    print((n-a)*(b-n+1) + (b-n))