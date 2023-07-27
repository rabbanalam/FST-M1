#List declartion
firstList = [10, 20, 67, 11, 89]
secondList = [13, 17, 40, 42, 91]

print("First list values are: ",firstList)
print("Second list values are: ",secondList)

thirdList = []

#Odd numbers from first list.
for num in firstList:
    if (num % 2 !=0):
        thirdList.append(num)

# even numbers from second list
for num in secondList:
    if (num % 2 == 0):
        thirdList.append(num)

print("Final list is :  " ,thirdList)
