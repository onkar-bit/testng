import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NewDropd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/select-menu");
		
		WebElement drop = driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select obj = new Select(drop);
		List<WebElement> all = obj.getOptions();
		
		System.out.println("The no: "+all.size());
		
		for(int i=0;i<all.size();i++) {
			System.out.println("the options: "+all.get(i).getText());
		}

	}

}
