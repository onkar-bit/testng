import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).click();
		Thread.sleep(7000);
		driver.switchTo().alert();
		alert.accept();
		
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		driver.switchTo().alert();
		alert.accept();
		String msg = driver.findElement(By.xpath("//span[@id='confirmResult']")).getText();
		System.out.println("the msg: "+msg);
		
		//promtbox alert
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		Alert alert1 = driver.switchTo().alert();
		alert1.sendKeys("hi how are you");
		alert.accept();
		String text = driver.findElement(By.xpath("//span[@id='promptResult']")).getText();
		System.out.println("the text: "+text);
			

	}

}
