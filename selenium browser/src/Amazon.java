import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\workplace\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fyour-account%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.findElement(By.id("createAccountSubmit")).click();
		
		driver.findElement(By.id("ap_customer_name")).sendKeys("akshay");
		driver.findElement(By.name("email")).sendKeys("9999999999");
		driver.findElement(By.id("ap_password")).sendKeys("pass");
		//driver.findElement(By.id("ap_password_check")).sendKeys("pass");
		Thread.sleep(3000);
		System.out.println("the title: "+driver.getTitle());
		driver.findElement(By.linkText("Sign in")).click();
		System.out.println("The title: "+driver.getTitle());
		//driver.findElement(By.partialLinkText("Sign")).click();

	}

}
