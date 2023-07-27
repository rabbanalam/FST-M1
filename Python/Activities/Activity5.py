#Using Loops --> Right a program to create multiplication table from 1 to 10 of a number.
userNum = int(input("Input your number: "))

#For loop to iterate
for i in range(1,11):
    print(userNum, " X ", i, " = ", userNum*i)