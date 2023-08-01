from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.firefox.service import Service as FirefoxService
from webdriver_manager.firefox import GeckoDriverManager

'''
    3. Get the copyright text
        Goal: Print the first copyright text in the footer to the console
            a. Open a browser.
            b. Navigate to ‘ http://alchemy.hguy.co/crm ’.
            c. Get the first copyright text in the footer.
            d. Print the text to the console.
            e. Close the browser.
'''
# Set up the Firefox Driver with WebDriverManger
service = FirefoxService(GeckoDriverManager().install())

# Start the Driver
with webdriver.Firefox(service=service) as driver:
    # Navigate to the URL
    driver.get("http://alchemy.hguy.co/crm")

    # Print the title of the page
    print("Page title is: ", driver.title)

    footerText = driver.find_element(By.ID, "admin_options")
    print("Footer text is : ", footerText.text)

    driver.quit()

