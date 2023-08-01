from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

'''
    6.  Menu checking
        Goal: Make sure that the “Activities” menu item exists and is clickable
            a. Open a browser.
            b. Navigate to ‘ http://alchemy.hguy.co/crm ’ and login using the credentials
            provided.
            c. Locate the navigation menu.
            d. Ensure that the “Activities” menu item exists.
            e. Close the browser  
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

    activitiesTab = driver.find_element(By.ID, "grouptab_3").text
    print("Name of the TAB is: ", activitiesTab)
    assert activitiesTab == "ACTIVITIES"

    driver.quit()
