def calculateSum(num):
    if num:
        return num + calculateSum(num-1)
    else:
        return 0
    
# invoking function
result = calculateSum(10)

print(result)