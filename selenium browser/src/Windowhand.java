import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhand {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		driver.findElement(By.xpath("//a[text() =' Click this link to start new Tab '][1]")).click();
		driver.findElement(By.xpath("//a[text() =' Click this link to start new Tab '][3]")).click();

		
		String parentwindow = driver.getWindowHandle();
		
		ArrayList<String> allwindow = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(allwindow.get(2));
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Java Selenium",Keys.ENTER);
		
		System.out.println("The Title: "+driver.getTitle());
		
		driver.switchTo().window(allwindow.get(0));
		
		System.out.println("The title: "+driver.getTitle());
		WebElement text =driver.findElement(By.xpath("//div[@class ='titlewrapper']/h1/a"));
		System.out.println("the text: "+text.getText());
		
		driver.switchTo().window(allwindow.get(2));
		
		driver.findElement(By.xpath("//input[@type='text' and @name='q']")).clear();
		driver.findElement(By.xpath("//input[@type='text' and @name='q']")).sendKeys("Selenium webdriver",Keys.ENTER);
		System.out.println("The title: "+driver.getTitle());
		driver.findElement(By.xpath("//div[@class='yuRUbf']/a")).click();
		System.out.println("The title:"+driver.getTitle());
		
		driver.switchTo().window(allwindow.get(1));
		
		driver.findElement(By.xpath("//div[@title='Sign In']")).click();
		Thread.sleep(2000);
		boolean rest = driver.findElement(By.xpath("//input[@id='persistent']")).isSelected();
		System.out.println("Checkbox Selected or not: "+rest);
		driver.findElement(By.xpath("//a[@id='createacc']")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("pqr");
		System.out.println("The title: "+driver.getTitle());

	}

}
