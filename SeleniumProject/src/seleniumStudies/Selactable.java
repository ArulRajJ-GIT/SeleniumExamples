package seleniumStudies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selactable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/selectable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> selactable = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		int size = selactable.size();
		System.out.println(size);
		
		Actions act=new Actions(driver);
		/*act.keyDown(Keys.CONTROL).click(selactable.get(0));
		act.keyDown(Keys.CONTROL).click(selactable.get(1));
		act.keyDown(Keys.CONTROL).click(selactable.get(2));*/
		
		act.clickAndHold(selactable.get(0));
		act.clickAndHold(selactable.get(1));
		act.clickAndHold(selactable.get(2));
		
		driver.quit();
	}

}
