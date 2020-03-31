from selenium import webdriver
import time


#Setting Path of chrome driver
chromedriver = '/usr/bin/chromedriver'

#Initialization of chrome driver
browser = webdriver.Chrome(chromedriver)

#Navigateing to URL
browser.get('https://openweathermap.org/')
time.sleep(2)
#browser.maximize_window()
#time.sleep(2)

#passing non city name in city field
elem = browser.find_element_by_xpath('(//input[@id="q"])[2]')
elem.clear()
elem.click()
elem.send_keys("wefdweew")
time.sleep(2)
browser.find_element_by_xpath("//button[contains(text(), 'Search')]").click()
time.sleep(2)

#verifing the results received
alrt = browser.find_elements_by_xpath('//*[@id="forecast_list_ul"]/div')
if 'Not Found' in alrt:
  print("System is working fine")
else:
  exit()


