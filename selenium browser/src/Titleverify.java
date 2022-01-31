import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titleverify {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		String title= "Facebook – log in or sign up";
		
		if(title.equals(title)) {
			System.out.println("Test is pass");
			
		}
		else {
			System.out.println("Test is fail");
		}
		
		String title1= driver.getTitle();
		System.out.println("The title of page is: "+title1);
		
		String text1 = driver.findElement(By.xpath("//h2[@class = '_8eso']")).getText();
	    System.out.println("The text is: "+text1);
	    
	    String url = driver.getCurrentUrl();
	    System.out.println("The URL is: "+url);

	}

}
