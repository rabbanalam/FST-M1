import pandas

# Create dict which will hold data
data = {
    "Usernames": ["admin", "charles", "Deku"],
    "Passwords": ["password", "Charl13", "AllMight"]
}

#Create Dataframe using data

dataframe = pandas.DataFrame(data)

#Print dataframe
print(dataframe)

dataframe.to_csv("Sample.csv", index=False)