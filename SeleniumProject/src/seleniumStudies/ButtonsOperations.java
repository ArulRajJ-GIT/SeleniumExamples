package seleniumStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement homeBtn = driver.findElement(By.id("home"));
		homeBtn.click();
		
		driver.navigate().back();
		
		WebElement positionBtn = driver.findElement(By.id("position"));
		Point location = positionBtn.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println(x + " "+ y);
		
		WebElement colorOfBtn = driver.findElement(By.id("color"));
		String cssValue = colorOfBtn.getCssValue("background-color");
		System.out.println(cssValue);
		
		WebElement sizeOfBtn = driver.findElement(By.id("size"));
		Dimension size = sizeOfBtn.getSize();
		System.out.println(size);
		
		//driver.quit();
	}

}
