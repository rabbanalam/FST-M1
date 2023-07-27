# static list 1
numList = [1, 2, 4, 21, 12]
numSum = 0


#print(numList1)

for listItem in numList:
    numSum+=listItem

print("Sum of the list1 is: ", numSum)
print("------------------------------------------------------")

#----------------------------------------------------------
#User input based list2

numList2 = []
numSum2= 0

ItemsInList = int(input("Enter num of elements: "))
for i in range(0,ItemsInList):
    elements=int(input())
    numList2.append(elements)

print("Your list 2 is : " ,numList2)


#Second Sum based on user input
for listItem in numList2:
    numSum2+=listItem

print("Sum of the list2 is: ", numSum2)


