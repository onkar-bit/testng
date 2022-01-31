import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDraganddrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.navigate().to("https://demoqa.com/droppable");
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination = driver.findElement(By.id("droppable"));
		
		Actions demo = new Actions(driver);
		demo.dragAndDrop(source, destination).build().perform();
		
		String text = destination.getText();
		if(text.equals("Dropped!")) {
			System.out.println("PASS dropped");
		}
		else {
			System.out.println("FAIL not dropped");
		}

	}

}
