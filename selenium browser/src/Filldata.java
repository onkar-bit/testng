
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Filldata {
	

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		
		driver.findElement(By.id("firstName")).sendKeys("pqr");
		
		driver.findElement(By.id("lastName")).sendKeys("abc");
		
		driver.findElement(By.id("username")).sendKeys("pqr@gmail.com");
		
		driver.findElement(By.name("Passwd")).sendKeys("pass");
		
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("pass");
		
		driver.findElement(By.id("i3")).click();
		
		
		
	}

}
