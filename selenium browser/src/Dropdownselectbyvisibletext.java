import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselectbyvisibletext {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		WebElement demo = driver.findElement(By.xpath("//a[text() = 'Create New Account']"));
		demo.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name ='firstname']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name ='lastname']")).sendKeys("pqr");
		driver.findElement(By.xpath("//input[@name ='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name= 'reg_email_confirmation__']")).sendKeys("abc@gmail.com");
		WebElement pass = driver.findElement(By.xpath("//input[@name ='reg_passwd__']"));
		pass.sendKeys("123456");
		
		//day
		WebElement daydrop = driver.findElement(By.id("day"));
		Select obj = new Select(daydrop);
		obj.selectByVisibleText("30");
		
		//month
		WebElement monthdrop = driver.findElement(By.id("month"));
		Select obj2 = new Select(monthdrop);
		obj2.selectByVisibleText("Mar");
		
		//year
		WebElement yeardrop = driver.findElement(By.id("year"));
		Select obj3 = new Select(yeardrop);
		obj3.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value ='2']")).click();
	}

}
