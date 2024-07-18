index = int(input())

# Find the layer
layer = 1
while index > layer:
    index -= layer
    layer += 1

# Calculate x and y coordinates
if layer % 2 == 0:
    x = index
    y = layer - index + 1
else:
    x = layer - index + 1
    y = index

print(f"{x}/{y}")
