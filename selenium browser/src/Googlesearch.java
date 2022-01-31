import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Googlesearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@name='q' and @type='text']")).sendKeys("mumbai weather",Keys.ENTER);
		WebElement text = driver.findElement(By.xpath("//span[@id ='wob_tm']"));
		System.out.println("the weather: "+text.getText());
		
		/*WebElement search = driver.findElement(By.xpath("//input[@name='q' and @type='text']"));
		Actions demo = new Actions(driver);
		demo.sendKeys(search, "javatpoint" , Keys.ENTER).build().perform();*/
		}

}
