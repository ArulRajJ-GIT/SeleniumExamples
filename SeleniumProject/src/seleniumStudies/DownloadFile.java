package seleniumStudies;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/download.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement downloadXLS = driver.findElement(By.linkText("Download Excel"));
		downloadXLS.click();
		
		File file=new File("C:\\Users\\Arul\\Downloads");
		File[] listFiles = file.listFiles();
		
		for (File file2 : listFiles) {
			if(file2.getName().equals("TestData.xls")) {
				System.out.println("File Downloaded");
			}
		}
		
		driver.quit();
	}

}
