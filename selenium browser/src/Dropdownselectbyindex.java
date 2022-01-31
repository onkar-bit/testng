import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownselectbyindex {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		Thread.sleep(3000);
		
		//day
		WebElement daydrop = driver.findElement(By.id("day"));
		Select obj = new Select(daydrop);
		obj.selectByIndex(29);
		
		//month
		WebElement monthdrop = driver.findElement(By.id("month"));
		Select obj2 = new Select(monthdrop);
		obj2.selectByIndex(2);
		
		//year
		WebElement yeardrop = driver.findElement(By.id("year"));
		Select obj3 = new Select(yeardrop);
		obj3.selectByIndex(25);

	}

}
