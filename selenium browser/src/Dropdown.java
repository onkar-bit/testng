import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text() = 'Create New Account']")).click();
		Thread.sleep(3000);
		
		//select day
		WebElement daydropdown = driver.findElement(By.id("day"));
		Select obj = new Select(daydropdown);
		obj.selectByValue("30");
		
		//select month
		WebElement monthdropdown = driver.findElement(By.id("month"));
		Select obj1 = new Select(monthdropdown);
		obj1.selectByValue("3");
		
		//select year
		WebElement yeardropdown = driver.findElement(By.id("year"));
		Select obj3 = new Select(yeardropdown);
		obj3.selectByValue("1996");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value ='2']")).click();

	}

}
