package seleniumStudies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);		
		WebElement frame1 = driver.findElement(By.xpath("(//button[@id= 'Click'])"));
		frame1.click();
		String text = frame1.getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.xpath("(//button[@id= 'Click1'])"));
		frame2.click();
		
		driver.switchTo().defaultContent();
		List<WebElement> totalFrames = driver.findElements(By.tagName("iframe"));
		int size = totalFrames.size();
		System.out.println(size);
		
		driver.quit();

		
	}

}
