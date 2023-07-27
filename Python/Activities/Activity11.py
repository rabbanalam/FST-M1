fruitShop = {
    "apple" : 10,
    "banana" : 40,
    "sapota" : 90,
    "peaches" : 12
}

checkFruitItem = input("Enter the fruit name to check availability: ").lower()

if (checkFruitItem in fruitShop):
    print("Yes,", checkFruitItem , " is available")
else:
    print("Apologies, ", checkFruitItem, " is not available at the moment!")