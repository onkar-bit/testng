
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {
	
	public WebDriver driver;
	
	public void browser(){
	System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	public void nevigate(String url){
	
	driver.get(url);

	System.out.println("The title: "+driver.getTitle());
	}


	public void click() {
		driver.findElement(By.xpath("//h3[text()='Selenium']")).click();
	}
	
	public void scroll() {
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}


}
