import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifySearchResult {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
		WebElement move = driver.findElement(By.xpath("//a[@title='Women']"));
		Actions action = new Actions(driver);
		action.moveToElement(move).build().perform();
		Thread.sleep(6000);
		
		WebElement tshirt = driver.findElement(By.xpath("//li/ul/li/ul/li/a[@title='T-shirts']"));
		tshirt.click();
		Thread.sleep(9000);
		
		String text = driver.findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).getText();
		System.out.println("The text: "+text);
		
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("Faded Short Sleeve T-shirts");
		driver.findElement(By.xpath("//button[@name='submit_search']")).click();
		Thread.sleep(9000);
		
		String productname = driver.findElement(By.xpath("//a[@class='product-name' and @title='Faded Short Sleeve T-shirts']")).getText();
		System.out.println("After search product name: "+productname);
		
		if(productname.equals(text)) {
			System.out.println("Product matches test PASS");
		}
		else {
			System.out.println("Product not matches test FAIL");
		}
		
		//get price
		WebElement img =driver.findElement(By.xpath("//img[@alt='Faded Short Sleeve T-shirts']"));
		Actions b= new Actions(driver);
		b.moveToElement(img).build().perform();
		
		WebElement price = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/div[2]/span"));
		System.out.println("The price: "+price.getText());
		
		
	}

}
