import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/login.html");
		
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("password");
		driver.findElement(By.id("SubmitLogin")).click();

	}

}
