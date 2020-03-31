import java.lang;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;


public class openurl{
	
	private WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = new ChromeDriver();
		driver.get("https://openweathermap.org/");
	}

	@Test
	public void passvalues() {

		String value = "kolar";
		elem = driver.findelement(By.xpath("(//input[@id='q'])[2]"));
		elem.clear();
		elem.click();
		elem.send_keys(value);
		staticWait(1000);
		driver.findelement(By.xpath("//button[contains(text(), 'Search')]")).click();
            	staticWait(1000);
           	 String msg = driver.findelements(By.xpath("//*[@id='forecast_list_ul']/div")).getText();
           	 if (msg.contains(value)) {
            System.out.println("System is working fine");
        } else {
            System.out.println("There is some issue");
        }	
		
	}

	@AfterClass
	public void closebrowser() {
		if (driver != null)
			driver.quit();
	"
