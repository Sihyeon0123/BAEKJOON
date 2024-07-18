t = int(input())
for _ in range(t):
    input_value = input()
    values = input_value.split()
    for i in values:
        if i == "@":
            result = result * 3
        elif i == "%":
            result += 5
        elif i == "#":
            result -= 7
        else:
            result = float(i)
    result = f"{result:.2f}"
    print(result)