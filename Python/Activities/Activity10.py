#Number checker in tuples
'''numTuple = tuple(input("Enter the tuple values separated by comma : ").split(", "))
print("Tuple values are: ",numTuple)
'''

userInput = input('Enter space-separated integers: ')

numTuple = tuple(int(item) for item in userInput.split())

print(numTuple)

# Print elements that are divisible by 5
print("Elements that are divisible by 5:")
for num in numTuple:
    if (num % 5 == 0):
        print(num)