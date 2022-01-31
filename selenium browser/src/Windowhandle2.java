import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Windowhandle2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		driver.findElement(By.xpath("//a[text()=' Click this link to start new Tab '][2]")).click();
		
		String parentwindow = driver.getWindowHandle();
		
		ArrayList<String> allwindow = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(allwindow.get(1));
		
		System.out.println("The title: "+driver.getTitle());
		
		driver.switchTo().window(allwindow.get(0));
		
		System.out.println("The title: "+driver.getTitle());
		
		driver.switchTo().window(allwindow.get(1));
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("pqr");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9999999999");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("abcmkl");
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select obj = new Select(day);
		obj.selectByValue("30");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select obj2 = new Select(month);
		obj2.selectByIndex(2);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select obj3 = new Select(year);
		obj3.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
				
		
		

	}

}
