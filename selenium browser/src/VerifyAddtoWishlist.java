import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VerifyAddtoWishlist {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://automationpractice.com/index.php");
		
		WebElement move = driver.findElement(By.xpath("//a[text()='Women']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(move).build().perform();
		
		Thread.sleep(3000);
		
		//click add to wishlist
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[3]/a")).click();
		
		WebElement movement = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[1]/div/a[1]/img"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(movement).build().perform();
		
		WebElement add= driver.findElement(By.xpath("//a[@class='addToWishlist wishlistProd_5']"));
		add.click();
		Thread.sleep(6000);
		
		String text = driver.findElement(By.xpath("//p[@class='fancybox-error']")).getText();
		System.out.println("the text: "+text);
		
		if(text.equals(text)) {
			System.out.println("error msg displayed test PASS");
		}
		else {
			System.out.println("Error msg not get test FAIL");
		}
		

	}

}
