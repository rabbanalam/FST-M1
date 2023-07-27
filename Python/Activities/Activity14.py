def fibonacci (number):
    if number <= 1:
        return number
    else:
        return (fibonacci(number-1) + fibonacci(number-2))
    
countTerms = int(input("Enter a number: "))

if countTerms <= 0:
    print("Please enter a positive number !!")
else:
    print("Fibonacci sequence: ")
    for i in range(countTerms):
        print(fibonacci(i))