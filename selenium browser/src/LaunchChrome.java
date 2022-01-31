import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LaunchChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		//driver.navigate().to("https://www.google.com");
		
		String i = driver.getTitle();
		System.out.println("The title is:" + i);
		//System.out.println("The title is: " + driver.getTitle());
		
		
		String j = driver.getCurrentUrl();
		System.out.println("The current URL is:" + j);
		//System.out.println("The current URL is: " +driver.getCurrentUrl());		
		driver.close();

	}

}
