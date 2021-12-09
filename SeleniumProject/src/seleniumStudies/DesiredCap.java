package seleniumStudies;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCap {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");
		
		DesiredCapabilities cap=new DesiredCapabilities(); //object creation for DesiredCap
		
		//cap.setAcceptInsecureCerts(true);  //to open Insecure WebPage Automatcally
		
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("incognito");
		
		options.addArguments("--start-maximized");
		options.merge(cap); //Chrome options to merge the Capablities
		
		WebDriver driver= new ChromeDriver(options); //calling that options here
		
		driver.get("https://www.google.com/");
		
		
		driver.quit();
	}

}
