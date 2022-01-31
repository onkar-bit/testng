import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.techlistic.com/p/selenium-practice-form.html");
		
		WebElement name = driver.findElement(By.xpath("//input[@name ='firstname']"));
		name.sendKeys("akshay");
		
		WebElement lname = driver.findElement(By.xpath("//input[@name ='lastname']"));
		lname.sendKeys("ka");
		
		driver.findElement(By.xpath("//input[@id ='sex-0']")).click();
		
		driver.findElement(By.xpath("//input[@id ='exp-2']")).click();
		
		WebElement date = driver.findElement(By.xpath("//input[@id ='datepicker']"));
		date.sendKeys("22/05/1976");
		
		driver.findElement(By.xpath("//input[@id ='profession-1']")).click();
		
		driver.findElement(By.xpath("//input[@id ='tool-2']")).click();
		driver.findElement(By.xpath("//input[@id ='tool-1']")).click();
		
		WebElement drop = driver.findElement(By.xpath("//select[@id ='continents']"));
		Select obj2 = new Select(drop);
		obj2.selectByIndex(4);
		
		WebElement cmd = driver.findElement(By.xpath("//select[@id ='selenium_commands']"));
		Select obj = new Select(cmd);
		obj.selectByVisibleText("WebElement Commands");

	}

}
