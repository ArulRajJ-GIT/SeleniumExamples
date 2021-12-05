package seleniumStudies;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableOperations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		List<WebElement> numOfColumns = driver.findElements(By.tagName("th"));
		int cloumnSize = numOfColumns.size();
		System.out.println(cloumnSize);
		
		List<WebElement> numOfRows = driver.findElements(By.tagName("tr"));
		int rowSize = numOfRows.size();
		System.out.println(rowSize);
		
		WebElement progresss = driver.findElement(By.xpath("(//td[contains(text(),'80')])[1]"));
		String text = progresss.getText();
		System.out.println(text);
		
		List<WebElement> allProgess = driver.findElements(By.xpath("//td[2]"));
		
		List<Integer> numList=new ArrayList<Integer>();
		
		for (WebElement integer : allProgess) {
			String indiValue= integer.getText().replace("%", "");
			numList.add(Integer.parseInt(indiValue));
		}
		
		driver.quit();
	}

}
