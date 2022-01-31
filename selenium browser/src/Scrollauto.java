import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollauto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		WebElement add = driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']"));
		Actions a = new Actions(driver);
		a.moveToElement(add).build().perform();
		Thread.sleep(3000);
		
		WebElement job = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));
		Actions j = new Actions(driver);
		j.moveToElement(job).build().perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@id='menu_admin_viewJobTitleList']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		js.executeScript("window.scrollBy(0,-1000)");

	}

}
