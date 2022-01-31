import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		
		String parentwindow = driver.getWindowHandle();
		
		ArrayList<String> allwindow = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(allwindow.get(1));
		
		WebElement text = driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println("The text: "+text.getText());
		
		driver.switchTo().window(allwindow.get(0));
		
		
		

	}

}
