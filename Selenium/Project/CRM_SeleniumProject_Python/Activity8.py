from selenium import webdriver
import time
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from selenium.webdriver.support import expected_conditions as EC
from webdriver_manager.firefox import GeckoDriverManager
from selenium.webdriver.support.ui import WebDriverWait

# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")

    # Print the title of the page
    print("Page title is: ", driver.title)

    # Login Logic
    userName = driver.find_element(By.ID, "user_name")
    passWord = driver.find_element(By.ID, "username_password")

    userName.send_keys("admin")
    passWord.send_keys("pa$$w0rd")

    driver.find_element(By.ID, "bigbutton").click()

    # after login
    afterLoginPage = driver.find_element(By.ID, "tab0")
    print("Dashboard Name : ", afterLoginPage.text)

    time.sleep(15)

    # Navigate to accounts table

    driver.find_element(By.ID, "grouptab_0").click()
    time.sleep(10)

    driver.find_element(By.ID, "moduleTab_9_Accounts").click()
    time.sleep(10)

    for i in [1,3,5,7,9,11,13]:
        rowData = driver.find_element(By.XPATH, f"//table/tbody/tr[{i}]/td[3]/b")
        print(rowData.text)


    driver.quit()

