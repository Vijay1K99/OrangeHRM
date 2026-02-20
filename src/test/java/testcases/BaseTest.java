package testcases;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;


public class BaseTest {

	public static WebDriver driver;
	public static Properties prop;
	
	@BeforeSuite
	public void setup() throws IOException
	{
		driver = new ChromeDriver();
		FileInputStream fs= new FileInputStream("C:\\Users\\kumar\\eclipse-workspace\\AutomationFramework\\src\\main\\java\\configration\\config.properties");
		prop= new Properties();
		prop.load(fs);
		driver.get(prop.getProperty("url"));
		
	}
	
	@AfterSuite
	public void closure()
	{
		driver.quit();
		
	}
	
}
