package seleniumStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement radioBtn = driver.findElement(By.id("yes"));
		radioBtn.click();
		
		WebElement radioBtn2 = driver.findElement(By.name("news"));
		boolean selected = radioBtn.isSelected();
		System.out.println(selected);
		
		WebElement below20 = driver.findElement(By.name("age"));
		below20.click();
		
		driver.quit();
	}

}
