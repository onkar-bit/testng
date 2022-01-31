import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framesprac {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("html/body/input")).sendKeys("akshay");
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("html/body/input[@id='a']")).click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement drop = driver.findElement(By.xpath("/html/body/select"));
		Select obj = new Select(drop);
		obj.selectByValue("babycat");

	}

}
