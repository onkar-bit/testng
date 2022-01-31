import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginandLogout {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		//Login
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		//add to cart and checkout
		WebElement add = driver.findElement(By.xpath("//div[text() = 'Sauce Labs Backpack']"));
		add.click();
		Thread.sleep(3000);
		WebElement cart = driver.findElement(By.xpath("//button[text() = 'Add to cart']"));
		cart.click();
		Thread.sleep(3000);
		WebElement cartadded = driver.findElement(By.xpath("//a[@class = 'shopping_cart_link']"));
		cartadded.click();
		Thread.sleep(3000);
		WebElement check = driver.findElement(By.xpath("//button[@id = 'checkout' and @name = 'checkout']"));
		check.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'first-name' and @name = 'firstName']")).sendKeys("om");
		driver.findElement(By.xpath("//input[@id = 'last-name' and @name = 'lastName']")).sendKeys("kishor");
		driver.findElement(By.xpath("//input[@id = 'postal-code' and @name = 'postalCode']")).sendKeys("413658");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id = 'continue' and @name = 'continue']")).click();
		Thread.sleep(3000);
		WebElement finish = driver.findElement(By.xpath("//button[@id = 'finish' and @name = 'finish']"));
		finish.click();
		
		//verify order placed or not
		String msg = driver.findElement(By.xpath("//div[@id='checkout_complete_container']/h2")).getText();
		System.out.println("The msg: "+msg);
		if(msg.equals(msg)) {
			System.out.println("Orderd successfully test PASS");
		}
		else {
			System.out.println("not ordered test FAIL");
		}
		
		WebElement back = driver.findElement(By.xpath("//button[@id = 'back-to-products' and @name = 'back-to-products']"));
		back.click();
		
		//Logout
		driver.findElement(By.xpath("//button[text() = 'Open Menu']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text() = 'Logout']")).click();
	}

}
