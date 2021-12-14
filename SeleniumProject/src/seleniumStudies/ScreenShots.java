package seleniumStudies;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Alert.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*TakesScreenshot screenShot=(TakesScreenshot) driver;  //These four lines for taking SS before alert box
		File srcFile = screenShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("ScreenShot.png");
		//FileInputStream destFile=new FileInputStream("screenshot.png");
		FileUtils.copyFile(srcFile, destFile);*/
		
		WebElement alert = driver.findElement(By.xpath("//button[contains(text(), 'Alert Box')]"));
		alert.click();
		
		Robot robot=new Robot(); //1.Create object for Robot class
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//2.get Screen Size with ToolKit
		Rectangle rectangle=new Rectangle(screenSize);  //3.create obj for Rectangle class
		BufferedImage createScreenCapture = robot.createScreenCapture(rectangle); ////4. use createScreenCapture method for rectangle obj
		File file= new File("ScreenShotSlert.png"); //5.destination file
		ImageIO.write(createScreenCapture, "png", file); //6.converting file source to destination with image format
		
		
		//driver.quit();
	}

}
