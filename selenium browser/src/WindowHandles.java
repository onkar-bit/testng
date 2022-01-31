import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://seleniumpractise.blogspot.com/2017/07/multiple-window-examples.html");
		
		String parentwindow = driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.xpath("//a[text() =' Click this link to start new Tab '][1]")).click();
		System.out.println("the title: "+driver.getTitle());
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows.size());
		
		for(String child : allwindows) {
			if(!parentwindow.equals(child)) {
				driver.switchTo().window(child);
			}
		}
		System.out.println(driver.getTitle());


	}

}
