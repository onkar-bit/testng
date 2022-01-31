import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Getdropdownoption {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		WebElement link =  driver.findElement(By.xpath("//a[text()='Create New Account']"));
		link.click();
		
		System.out.println("The tagname: "+link.getTagName());
		
		System.out.println("the attribute: "+link.getAttribute("class"));
		
		System.out.println("The css value: "+link.getCssValue("color"));
		
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select obj = new Select(day);
		
		List<WebElement> allday = obj.getOptions();
		System.out.println("The days: "+allday.size());
		
		for(int i=0;i<allday.size();i++) {
			System.out.println("all days: "+allday.get(i).getText());
		}
		
		System.out.println("-----------------------------------");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select obj2 = new Select(month);
		
		List<WebElement> allmonth = obj2.getOptions();
		
		System.out.println("The month: "+allmonth.size());
		
		for(int i=0;i<allmonth.size();i++) {
			System.out.println("The months: "+allmonth.get(i).getText());
		}
		
		System.out.println("-----------------------------------");
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select obj3 = new Select(year);
		
		List<WebElement>allyear = obj3.getOptions();
		System.out.println("The year: "+allyear.size());
		
		for(int i=0;i<allyear.size();i++) {
			System.out.println("all yaer: "+allyear.get(i).getText());
		}

	}

}
