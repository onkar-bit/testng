package Launchgoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Shopingverify {
	
	public WebDriver driver;
	
	//Project by using parameter
	@Parameters("browser")
	@BeforeTest
	public void launch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\workplace\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
	}
	
	@Test
	public void go() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[normalize-space(text())='Sign in']")).click();
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("java@gmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
		String text= driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		System.out.println("the msg: "+text);
		if(text.contains(text)) {
			System.out.println("error msg are displayed test PASS");
		}
		else {
			System.out.println("error not displayed test FAIL");
		}
		
		
	}

}
