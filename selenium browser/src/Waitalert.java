import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Waitalert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/alerts");
		//driver.findElement(By.id("confirmButton")).click();
		driver.findElement(By.id("promtButton")).click();
		
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("4568");
		alert.accept();
		
		
		/*String text =driver.findElement(By.id("confirmResult")).getText();
		System.out.println("The output: "+text);*/
		
		String text1 = driver.findElement(By.id("promptResult")).getText();
		System.out.println("The output is: "+text1);
	}

}
