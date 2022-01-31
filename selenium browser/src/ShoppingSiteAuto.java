import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShoppingSiteAuto {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("rfkmgmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(9000);
		String data = driver.findElement(By.xpath("//div[@id='create_account_error']/ol/li")).getText();
		
		if(data.equals(data)) {
			System.out.println("Invalid email test PASS");
		}
		else {
			System.out.println("Valid email test FAIL");
		}

	}

}
