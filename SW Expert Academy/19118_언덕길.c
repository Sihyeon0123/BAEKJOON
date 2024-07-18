def min_removals_to_maintain_rule(arr):
    n = len(arr)
    lis = [1] * n
 
    for i in range(1, n):
        for j in range(0, i):
            if arr[i] > arr[j] and lis[i] < lis[j] + 1:
                lis[i] = lis[j] + 1
 
    max_len = max(lis)
 
    return n - max_len
 
def main():
    TC = int(input(""))
 
    for i in range(1, TC+1):
        result = 0
        N = int(input())
        arr = list(map(int, input().split()))
        result = min_removals_to_maintain_rule(arr)
        print("#%d %d"%(i, result))
 
if __name__ == "__main__":
    main()