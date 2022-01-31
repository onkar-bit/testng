import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GodadyAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://godaddy.com/");
		Thread.sleep(8000);

		driver.findElement(By.xpath("//button[@class='product-flyout-btn']")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//ul[@class='cms-nav']/li[1]/button")).click();
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//a[text()='Domain Name Search']")).click();
		Thread.sleep(8000);
		
		String text = driver.getTitle();
		System.out.println("The title: "+text);
		
		if(text.equals(text)) {
			System.out.println("title matches test PASS");
		}
		else {
			System.out.println("title not matches test FAIL");
		}

	}

}
