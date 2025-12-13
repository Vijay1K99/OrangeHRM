	package testcases;
	
	import java.io.FileInputStream;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.Properties;
	
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.openqa.selenium.chrome.ChromeOptions;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	
	
	public class BaseTest1 {
	
		public static WebDriver driver;
		public static Properties prop;
		
		@BeforeMethod
		public void setup() throws IOException
		{
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			FileInputStream fs= new FileInputStream("C:\\Users\\kumar\\eclipse-workspace\\AutomationFramework\\src\\main\\java\\configration\\config.properties");
			prop= new Properties();
			prop.load(fs);
			driver.get(prop.getProperty("url"));
			
		}
		
		@AfterMethod
		public void closure()
		{
			driver.quit();
			
		}
		
	}
