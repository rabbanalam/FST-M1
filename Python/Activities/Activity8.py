numList = list(input("Enter a seq of comma separated list values: ").split(", "))

print("User rooted List is : ", numList)

#get the first value of the list
firstValue = numList[0]
print("first Value of the list is : ",firstValue)

#get the last value of the list
lastValue = numList[-1]
print("Last value of the list is: ", lastValue)

#Decisioning
if (firstValue == lastValue):
    print(True)
else:
    print(False)