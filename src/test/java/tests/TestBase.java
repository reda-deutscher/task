package tests;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class TestBase 
{
	public static WebDriver driver ; 
	
	public static String downloadPath = System.getProperty("user.dir") + "\\Downloads";
	

	public static FirefoxOptions firefoxOption() {
		FirefoxOptions option = new FirefoxOptions();
		option.addPreference("browser.download.folderList", 2);
		option.addPreference("browser.download.dir", downloadPath);
		option.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
		option.addPreference("browser.download.manager.showWhenStarting", false);
		option.addPreference("pdfjs.disabled", true);
		return option;
	}

	public static ChromeOptions chromeOption() {
		
		ChromeOptions options = new ChromeOptions();
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default.content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadPath);
		options.setExperimentalOption("prefs", chromePrefs);
		
		return options;
	}

	@BeforeSuite
	@Parameters({"browser"})
	public void startDriver(@Optional("chrome") String browserName) 
	{
		
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver(chromeOption()); 
		}

		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver(firefoxOption()); 
		}

		else if (browserName.equalsIgnoreCase("ie")) 
		{
			driver = new InternetExplorerDriver(); 
		}

		else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver(); 
		}
		
		driver.manage().window().maximize();
		driver.navigate().to("https://www.jetblue.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	 

     try {
         // إيجاد زر "Accept All Cookies" باستخدام Selector المناسب
         WebElement acceptCookiesButton = driver.findElement(By.xpath("//button[text()='Accept All Cookies']"));
         
         // النقر على الزر لإغلاق النافذة
         acceptCookiesButton.click();
         
         System.out.println("clicked");
     } catch (Exception e) {
         System.out.println("notfound");
     }

//	@AfterSuite
//	public void stopDriver() 
//	{
//		driver.quit();
//	}

	// take screenshot when test case fail and add it in the Screenshot folder
//	@AfterMethod
//	public void screenshotOnFailure(ITestResult result) 
//	{
//		if (result.getStatus() == ITestResult.FAILURE)
//		{
//			System.out.println("Failed!");
//			System.out.println("Taking Screenshot....");
//		}
//}
	}
}


