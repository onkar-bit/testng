import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.testdiary.com/training/selenium/selenium-test-page/");
		
		String title = "Selenium Test Page - Test Diary";
		if(title.equals(title)) {
			System.out.println("PASS");
		}
		else {
			System.out.println("FAIL");
		}
		
		String title1 = driver.getTitle();
		System.out.println("The title is: "+title1);
		
		String url = driver.getCurrentUrl();
		System.out.println("The URL is: "+url);
		
		//String source = driver.getPageSource();
		//System.out.println("The source is: "+source);
		
		//checkbox selected or not
		boolean rest = driver.findElement(By.id("seleniumbox")).isSelected();
		System.out.println("selected or not: "+rest);
		
		WebElement get = driver.findElement(By.xpath("//section[2]/p[1]/span/strong"));
		System.out.println("The text: "+get.getText());
		
		WebElement shirt = driver.findElement(By.xpath("//select[@id = 'Shirts']"));
		Select obj = new Select(shirt);
		obj.selectByIndex(1);
		
		WebElement skirt = driver.findElement(By.xpath("//select[@id ='Skirts']"));
		Select obj2 = new Select(skirt);
		obj2.selectByValue("RedSkirt");
		
		String ta = driver.findElement(By.xpath("//table[@id = 'testtable']/tbody/tr[2]/td[2]")).getText();
		System.out.println("the text: "+ta);
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		System.out.println("The link are "+link.size());
		
		WebElement name = driver.findElement(By.xpath("//input[@name = 'your-name']"));
		name.sendKeys("ak");
		
		WebElement mail = driver.findElement(By.xpath("//input[@name = 'your-email']"));
		mail.sendKeys("ak@gmail.com");
		
		WebElement sub = driver.findElement(By.xpath("//input[@name = 'your-subject']"));
		sub.sendKeys("i am ak");
		
		WebElement msg = driver.findElement(By.xpath("//textarea[@name = 'your-message']"));
		msg.sendKeys("i am ak and i am from pune");
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		
		
		

	}

}
