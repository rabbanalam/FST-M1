import pandas
from pandas import ExcelWriter

#Dict to store data which will be used
data = {
	'FirstName':["Satvik", "Avinash", "Lahri"],
	'LastName':["Shah", "Kati", "Rath"],
	'Email':["satshah@example.com", "avinashK@example.com", "lahri.rath@example.com"],
	'PhoneNumber':["4537829158", "4892184058", "4528727830"]
}

#Dataframe which will be written to excel
excelDataFrame = pandas.DataFrame(data)

print(excelDataFrame)

#Write dateframe to excel
writer = ExcelWriter('Sample.xlsx')
excelDataFrame.to_excel(writer,'Sheet1',index=False)

#Commit data
writer.save()