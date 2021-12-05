package seleniumStudies;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		String windowHandle = driver.getWindowHandle();
		WebElement homeClick = driver.findElement(By.id("home"));
		homeClick.click();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String newWindow : windowHandles) {
			driver.switchTo().window(newWindow);
		}
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a/img"));
		editBox.click();
		driver.close();
		
		driver.switchTo().window(windowHandle);
		
		WebElement openMultiple = driver.findElement(By.xpath("//button[@onclick='openWindows()']"));
		
		int size = driver.getWindowHandles().size();
		System.out.println(size);
		
		WebElement closeWindows = driver.findElement(By.xpath("(//button[@id= 'color'])[1]"));
		closeWindows.click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		/*for (String newWindows1 : windowHandles2) {
			driver.switchTo().window(newWindows1).close();
		}*/
		for (String newWindows1 : windowHandles2) {
			if(!newWindows1.equals(windowHandle))
				driver.switchTo().window(newWindows1);
				driver.close();
		}

		driver.quit();
	}

}
