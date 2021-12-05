package seleniumStudies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
		dropDown1.click();
		Select select = new Select(dropDown1);
		select.selectByIndex(1);
		
		WebElement dropDown2 = driver.findElement(By.id("dropdown2"));
		dropDown2.click();
		Select select1 = new Select(dropDown2);
		select1.selectByValue("2");
		
		WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
		dropDown3.click();
		Select select2 = new Select(dropDown3);
		select2.selectByVisibleText("Loadrunner");
		List<WebElement> numOfDropDOwn = select2.getOptions();
		int size = numOfDropDOwn.size();
		System.out.println(size);
		
		dropDown3.sendKeys("Selenium");
		
		WebElement selectMultiple = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select/option[1]"));
		Select select4= new Select(selectMultiple);
		select4.selectByIndex(1);
		select4.selectByIndex(2);
		select4.selectByIndex(4);
		
		
		
		
		
		driver.quit();
	}

}
