import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GuruScroll {


	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chrom.edriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.album.alexflueras.ro/index.php");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(4000,0)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(-4000,0)");
		
		driver.navigate().to("https://www.lambdatest.com/");
		
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-5000)");

	}

}
