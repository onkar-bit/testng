import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.w3schools.com/Jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.switchTo().frame("iframeResult");
		WebElement text = driver.findElement(By.xpath("/html/body/h2"));
		System.out.println("the text: "+text.getText());
		
		WebElement button = driver.findElement(By.xpath("html/body/button"));
		button.click();
		Alert demo = driver.switchTo().alert();
		demo.accept();

	}

}
