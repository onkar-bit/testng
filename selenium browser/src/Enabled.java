import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
		
		boolean first = driver.findElement(By.xpath("//button[@id ='demo']")).isEnabled();
		System.out.println("Button is enabled or disabled: "+first);
		
		boolean second = driver.findElement(By.xpath("//button[@id ='demo']")).isDisplayed();
		System.out.println("Button is displayed or not: "+second);

	}

}
