package seleniumStudies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("http://www.leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement link = driver.findElement(By.linkText("Go to Home Page"));
		link.click();
		
		driver.navigate().back();
		
		WebElement linkText = driver.findElement(By.linkText("Find where am supposed to go without clicking me?"));
		String text = linkText.getAttribute("href");
		System.out.println(text);
		
		WebElement brokenLink = driver.findElement(By.linkText("Verify am I broken?"));
		brokenLink.click();
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("Link Broken");
		}else {
			System.out.println("Link is PErfect");
		}
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		List<WebElement> linksCount = driver.findElements(By.tagName("a"));
		int size = linksCount.size();
		System.out.println(size);
		
		//driver.quit();
	}

}
