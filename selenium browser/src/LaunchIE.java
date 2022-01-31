import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
public class LaunchIE {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","C:\\Users\\285971\\eclipse-workspace\\IEDriverServer_Win32_4.0.0\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.google.com");
		

	}

}
