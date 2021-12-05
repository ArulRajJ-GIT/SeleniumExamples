package seleniumStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		WebElement alertBox = driver.findElement(By.xpath("//button[contains(text(), 'Alert Box')]"));
		alertBox.click();
		
		org.openqa.selenium.Alert alert= driver.switchTo().alert();
		alert.accept();
		
		WebElement confirmAlert = driver.findElement(By.xpath(".xpath(\"//button[contains(text(), 'Alert Box')]\")"));
		confirmAlert.click();
		
		org.openqa.selenium.Alert alert1= driver.switchTo().alert();
		alert1.dismiss();
		
		
		WebElement promptAlert = driver.findElement(By.xpath("//button[contains(text(), 'Prompt Box')]"));
		promptAlert.click();
		
		org.openqa.selenium.Alert alert2= driver.switchTo().alert();
		alert2.sendKeys("This is Arul raj");
		alert2.accept();
		
		
		driver.quit();
	}

}
