package seleniumStudies;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/icc-men-s-t20-world-cup-2021-22-1267897/points-table-standings");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement table = driver.findElement(By.tagName("table"));
		
		WebElement tableHead = table.findElement(By.tagName("thead"));
		
		List<WebElement> head = tableHead.findElements(By.tagName("th"));
		for (int i = 0; i < head.size(); i++) {
			WebElement headName = head.get(i);
			String text = headName.getText();
			System.out.println(text);
		}
		
		WebElement body = table.findElement(By.tagName("tbody"));
		
		List<WebElement> row = body.findElements(By.tagName("tr"));
		
		for (int i = 0; i < row.size(); i++) {
			WebElement rows = row.get(i);
			String text = rows.getText();
			System.out.println(text);
			List<WebElement> cell = rows.findElements(By.tagName("td"));
			for (int j = 0; j < cell.size(); j++) {
				WebElement cells = cell.get(j);
				String text2 = cells.getText();
				System.out.println(text2);
			}
			
		}
		
		driver.quit();
	}

}
