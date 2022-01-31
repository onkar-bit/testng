import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollbar {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.tutorialspoint.com/index.htm");
		
		WebElement link = driver.findElement(By.xpath("//a[@title='Python Tutorial']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", link);
		link.click();
		/*js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-900)");*/
		
		
		
		

	}

}
