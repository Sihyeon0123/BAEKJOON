def is_leep_year (n):
    if (n % 4) == 0:
        if (n % 100) != 0 or (n % 400) == 0:            
            return 1
        else:
            return 0
    else:
        return 0    
    

n = int(input())
print(is_leep_year(n))