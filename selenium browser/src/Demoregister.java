import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demoregister {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		//register
		driver.findElement(By.name("firstName")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@name= 'lastName']")).sendKeys("pqr");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("56321489");
		
		driver.findElement(By.id("userName")).sendKeys("abcpqr");
		
		driver.findElement(By.name("address1")).sendKeys("pune");
		
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("solapur");
		
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("maha");
		
		driver.findElement(By.name("postalCode")).sendKeys("413007");
		
		WebElement country = driver.findElement(By.xpath("//select[@name = 'country']"));
		Select obj = new Select(country);
		obj.selectByValue("INDIA");
		
		driver.findElement(By.xpath("//input[@name='email' and @id ='email']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.xpath("//input[@name='password' and @type ='password']")).sendKeys("632147");
		
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("632147");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("submit")).click();
		
		//sign in 
		driver.findElement(By.linkText("sign-in")).click();
		//driver.findElement(By.xpath("//a[contains (text(), 'sign-in')]")).click();
		//driver.findElement(By.xpath("//a[text() = ' sign-in ']")).click();
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("632147");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

}
