def prime_factors(n):
    factors = []
    divisor = 2
    
    while n > 1:
        if n % divisor == 0:
            factors.append(divisor)
            n //= divisor
        else:
            divisor += 1
    
    return factors

num = int(input())
factors = prime_factors(num)
for a in factors:
    print(a)
