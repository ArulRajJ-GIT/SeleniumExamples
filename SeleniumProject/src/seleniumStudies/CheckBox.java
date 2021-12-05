package seleniumStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement langSelect = driver.findElement(By.xpath("//*[contains(text(), 'Java')]"));
		langSelect.click();
		
		WebElement seleniumSlect = driver.findElement(By.xpath("(//*[contains(text(), 'Selenium')])[2]"));
		boolean selected = seleniumSlect.isSelected();
		System.out.println(selected);
		
		
		WebElement unSelect = driver.findElement(By.xpath("//*[contains(text(), 'I am Selected')]"));
		unSelect.click();
		
		driver.quit();
	}

}
