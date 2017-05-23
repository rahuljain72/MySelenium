package Generic;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public abstract class BaseTest implements AutoConst{
public WebDriver driver;
	@BeforeMethod
	public void openApplication(){
	System.setProperty(GECKO_KEY,GECKO_VALUE);
	driver =new FirefoxDriver();
	driver.get("http://localhost/login.do");
	}
	@AfterMethod
	public void closeApplication(){
		driver.close();
	}
}

//IF webdriver is static then parallel execution is not possible.