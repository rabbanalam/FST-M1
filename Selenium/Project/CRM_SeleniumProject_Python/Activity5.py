from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

'''
      5. Getting colors
        Goal: Get the color of the navigation menu
            a. Open a browser.
            b. Navigate to ‘http://alchemy.hguy.co/crm’ and login using the credentials
            provided.
            c. Get the color of the navigation menu and print it to the console.
            d. Close the browser.
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

    colorOfBar = driver.find_element(By.ID, "toolbar").value_of_css_property("color")
    print("Color of the Navigation Bar is : ", colorOfBar)

    driver.quit()
