from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

'''
     4. Logging into the site
        Goal: Open the site and login with the credentials provided
            a. Open the browser
            b. Navigate to ‘ https://alchemy.hguy.co/crm ’.
            c. Find and select the username and password fields
            d. Enter login credentials into the respective fields
            e. Click login
            f. Verify that the homepage has opened.
            g. Close the browser.
'''
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

    assert afterLoginPage.text == "SUITECRM DASHBOARD"

    driver.quit()
