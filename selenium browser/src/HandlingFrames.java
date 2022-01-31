import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingFrames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/frames");
		
		driver.switchTo().frame("frame1");
		
		WebElement text =driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		System.out.println("the text is: "+text.getText());
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement text2 = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
		System.out.println("the text "+text2.getText());
		
		
	}

}
