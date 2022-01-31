import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Multibrowser {

	public static void main(String[] args) {
		
		String browser = "chrome";
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com");
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\workplace\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com");
		}
		else if(browser.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\workplace\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.google.com");
		}

	}

}
