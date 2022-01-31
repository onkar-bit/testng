import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.amazon.com/");
		WebElement demo = driver.findElement(By.xpath("//a[@id = 'nav-link-accountList']"));
		Actions action = new Actions(driver);
		action.moveToElement(demo).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text() = 'Account']")).click();
		System.out.println("The title is: "+driver.getTitle());
		
		

	}

}
