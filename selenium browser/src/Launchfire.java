import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launchfire {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\workplace\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		

	}

}
