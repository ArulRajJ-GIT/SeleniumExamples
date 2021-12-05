package seleniumStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Calendar.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement calender = driver.findElement(By.id("datepicker"));
		calender.click();
		
		//calender.sendKeys("01/10/2021"+Keys.ENTER);
		
		WebElement nxtMonth = driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		nxtMonth.click();
		
		WebElement nxtMonthDate = driver.findElement(By.xpath("//a[contains(text(),'10')]"));
		nxtMonthDate.click();
		
		driver.quit();
	}

}
