import pandas
#read csv file and store it into a dataframe
csvDataFrame = pandas.read_csv("Sample.csv")

#print data
print("Full data : ")
print(csvDataFrame)

#username values
print("==================================")
print("Usernames: ")
print(csvDataFrame["Usernames"])

print("==================================")
print("Username: ", csvDataFrame["Usernames"][1], " | ", "Password", csvDataFrame["Passwords"][1])

print("==================================")
print("Ascending order data after sorting")
print(csvDataFrame.sort_values('Usernames'))

print("==================================")
print("Descending order passwords values")
print(csvDataFrame.sort_values('Passwords', ascending=False))