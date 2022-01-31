import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Shopping {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.xpath("//a[@title='Log in to your customer account']")).click();
		WebElement email = driver.findElement(By.xpath("//input[@id='email_create']"));
		email.sendKeys("mnopq@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(9000);
		
		driver.findElement(By.xpath("//input[@id='id_gender1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("jack");
		WebElement lname = driver.findElement(By.xpath("//input[@id='customer_lastname']"));
		lname.sendKeys("jones");
		WebElement pwd = driver.findElement(By.xpath("//input[@id='passwd']"));
		pwd.sendKeys("abc123");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select obj = new Select(day);
		obj.selectByValue("3");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='months']"));
		Select obj2 = new Select(month);
		obj2.selectByValue("3");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='years']"));
		Select obj3 = new Select(year);
		obj3.selectByValue("1990");
		
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("jack");
		driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("jones");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("666,pune");
		
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("pune");
		WebElement state = driver.findElement(By.xpath("//select[@id='id_state']"));
		Select obj4 = new Select(state);
		obj4.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("41300");
		
		WebElement contry = driver.findElement(By.xpath("//select[@id='id_country']"));
		Select obj5 = new Select(contry);
		obj5.selectByVisibleText("United States");
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9999999999");
		
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("pune maharashtra");
		
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		
		Thread.sleep(4000);
		
		String userText= driver.findElement(By.xpath("//span[text()='jack jones']")).getText();
		
		if(userText.contains("jack jones")) {
			System.out.println("User created test PASS");
				
		}
		else {
			System.out.println("User not created test FAIL");
		}
		
	}

}
