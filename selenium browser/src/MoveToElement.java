import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement demo = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions action = new Actions(driver);
		action.moveToElement(demo).build().perform();
		System.out.println("the title: "+driver.getTitle());
		//Thread.sleep(3000);
		
		WebElement demo1 = driver.findElement(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a[2]"));
		Actions link = new Actions(driver);
		link.moveToElement(demo1).build().perform();	
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='_6WOcW9 _3YpNQe'][2]")).click();
		//Thread.sleep(3000);
		System.out.println("the title: "+driver.getTitle());
		
		

	}

}
