package MavenJenkins;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC003{
	
	@BeforeMethod
	public void btest(){
		
		System.out.println("This is Before Test case-3");
	}
	
	@Test
	public void DriverTestCase(){
			
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
//			driver.manage().window().maximize();
			driver.findElementById("email").sendKeys("Hello");
			driver.findElementById("pass").sendKeys("Hello");
			driver.quit();
	}
	
	
	@AfterMethod
	public void Atest(){
		
		System.out.println("This is After Test Case-3");
	}
	
	}