import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ShoppingBuyProduct {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
		WebElement login = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		login.click();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mnopq@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("abc123");
		driver.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
		
		WebElement crs = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions action = new Actions(driver);
		action.moveToElement(crs).build().perform();
		
		WebElement link = driver.findElement(By.xpath("//ul/li/ul/li/a[@title='T-shirts']"));
		link.click();
		
		WebElement mou = driver.findElement(By.xpath("//img[@title='Faded Short Sleeve T-shirts']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(mou).build().perform();
		
		driver.findElement(By.xpath("//a[@title='View']")).click();
		
		driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
		
		WebElement size = driver.findElement(By.xpath("//select[@id='group_1']"));
		Select obj = new Select(size);
		obj.selectByValue("3");
		
		driver.findElement(By.xpath("//a[@name='Blue']")).click();
		
		driver.findElement(By.xpath("//button[@name='Submit']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		
		driver.findElement(By.xpath("//p[@class='cart_navigation clearfix']/a[1]")).click();
		
		Thread.sleep(6000);
		
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		WebElement process = driver.findElement(By.xpath("//button[@name='processCarrier']"));
		process.click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@title='Pay by check.']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='I confirm my order']")).click();
		Thread.sleep(3000);
				
		String confirm = driver.findElement(By.xpath("//p[text()='Your order on My Store is complete.']")).getText();
		System.out.println("The msg: "+confirm);
		
		
		if(confirm.contains("complete")) {
			System.out.println("order confirm test PASS");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0 ,500)");
			
			TakesScreenshot scrShot= ((TakesScreenshot)driver);
			File SrcFile= scrShot.getScreenshotAs(OutputType.FILE);
			File DestFile= new File("C:\\Users\\285971\\eclipse-workspace\\selenium browser\\Screenshot\\order.png");
			FileUtils.copyFile(SrcFile, DestFile);
			
		}
		else {
			System.out.println("order not confirm test FAIL");
		}

	}

}
