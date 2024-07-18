num = input()
nums = num.split()

integer_list = []

for num in nums:
    integer_list.append(int(num))
integer_list.sort()
print(integer_list[1])