import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionRightclick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rclick = driver.findElement(By.xpath("//span[text() = 'right click me']"));
		Actions demo = new Actions(driver);
		demo.contextClick(rclick).build().perform();

	}

}
