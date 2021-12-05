package seleniumStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement txtBox = driver.findElement(By.id("email"));
		txtBox.sendKeys("Arul raj");
		
		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		appendBox.sendKeys("New Text");
		
		WebElement getTxt = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String text = getTxt.getAttribute("value");
		System.out.println(text);
		
		WebElement clearText = driver.findElement(By.xpath("(//input[@name='username'])[2]"));
		clearText.clear();
		
		WebElement disabledBox = driver.findElement(By.xpath("//input[@disabled='true']"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
	}

}
