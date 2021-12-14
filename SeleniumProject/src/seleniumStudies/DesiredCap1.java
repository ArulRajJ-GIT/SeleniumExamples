package seleniumStudies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesiredCap1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Arul\\Downloads\\chromedriver.exe");

		DesiredCapabilities cap=new DesiredCapabilities(); //object creation for DesiredCap

		//cap.setAcceptInsecureCerts(true);  //to open Insecure WebPage Automatcally
		
		cap.setCapability("browserNmae", "chrome");

		ChromeOptions options=new ChromeOptions();

		//options.addArguments("incognito"); // to open incognito

		options.addArguments("--start-maximized"); // to maximize browser
		
		//options.setHeadless(true);
		
		//options.addArguments("disable-notification"); //disable notifications popup
		options.addArguments("disable-geolocation");  //disable location access pop-up
		//options.addArguments("diable-media_Stream");  //disable access for mic and camera popup
		
		
		options.merge(cap); //Chrome options to merge the Capablities
		
		WebDriver driver= new ChromeDriver(options); //calling that options here

		driver.get("https://www.gps-coordinates.net/my-location");
		
		
		
		


		//driver.quit();
	}

}
