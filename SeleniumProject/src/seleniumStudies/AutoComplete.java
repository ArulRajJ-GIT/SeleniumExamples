package seleniumStudies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/autoComplete.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement typeHere = driver.findElement(By.id("tags"));
		typeHere.sendKeys("s");
		
		List<WebElement> allElements = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		for (WebElement webElement : allElements) {
			if(webElement.equals("Web Services")) {
				System.out.println(webElement);
				webElement.click();
				break;
			}
			
		}
		
		driver.quit();
	}

}
