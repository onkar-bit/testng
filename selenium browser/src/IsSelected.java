import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://www.testdiary.com/training/selenium/selenium-test-page/");
		
		boolean rest1 = driver.findElement(By.id("restapibox")).isSelected();
		System.out.println("checkbox selected or not: "+rest1);
		
		if(rest1== false) {
			System.out.println("Test has need select checkbox");
		}
		else {
			System.out.println("By default has selected");
		}

	}

}
