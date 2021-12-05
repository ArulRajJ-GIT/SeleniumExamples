package seleniumStudies;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/upload.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement uploadClick = driver.findElement(By.xpath("//input[@name='filename']"));
		uploadClick.click();
		
		String fileLocation="C:\\Users\\Arul\\Downloads\\testleaf.xlsx";
		
		StringSelection convertedFile=new StringSelection(fileLocation); //StringSelection is class, it converts String value into text 
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(convertedFile, null);
		
		Robot act= new Robot();
		act.keyPress(KeyEvent.VK_CONTROL);
		act.keyPress(KeyEvent.VK_V);
		act.keyRelease(KeyEvent.VK_V);
		act.keyRelease(KeyEvent.VK_CONTROL);
		act.keyPress(KeyEvent.VK_ENTER);
		act.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
	}

}
