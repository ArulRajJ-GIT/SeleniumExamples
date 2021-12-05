package seleniumStudies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> sorting = driver.findElements(By.xpath("http://www.leafground.com/pages/sortable.html"));
		
		WebElement fromElement=sorting.get(6);
		WebElement toElement=sorting.get(0);
		
		Actions act=new Actions(driver);
		act.clickAndHold(fromElement).moveToElement(toElement).release(toElement).build().perform();
		
		driver.quit();
	}

}
