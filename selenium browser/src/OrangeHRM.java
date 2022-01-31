import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\workplace\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		String title = driver.getTitle();
		System.out.println("The title of page: "+title);
		String url = driver.getCurrentUrl();
		System.out.println("The URL of page: "+url);
		
		//Login
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		pass.sendKeys("admin123");
		
		WebElement submit = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		submit.click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("menu_leave_viewLeaveModule")).click();
		
		//Edit details
		
		WebElement link = driver.findElement(By.xpath("//a[text() = 'Orange Test']"));
		link.click();
		
		WebElement edit = driver.findElement(By.xpath("//input[@id='btnSave']"));
		edit.click();
		
		WebElement fname = driver.findElement(By.xpath("//input[@id='personal_txtEmpFirstName']"));
		fname.clear();
		fname.sendKeys("Orange");
		
		WebElement lname = driver.findElement(By.xpath("//input[@id='personal_txtEmpLastName']"));
		lname.clear();
		lname.sendKeys("HRM");
		
		WebElement empid = driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
		empid.clear();
		empid.sendKeys("123456");
		
		WebElement gender = driver.findElement(By.xpath("//input[@id ='personal_optGender_2']"));
		gender.click();
		
		WebElement status = driver.findElement(By.id("personal_cmbMarital"));
		Select obj = new Select(status);
		obj.selectByValue("Married");
		
		WebElement nation = driver.findElement(By.id("personal_cmbNation"));
		Select obj2 = new Select(nation);
		obj2.selectByVisibleText("Indian");
		
		WebElement dob = driver.findElement(By.xpath("//input[@id = 'personal_DOB']"));
		dob.clear();
		dob.sendKeys("1975-03-08");
		
		WebElement save = driver.findElement(By.id("btnSave"));
		save.click();
		
		String savetitle = driver.getTitle();
		System.out.println("after save the title is: "+savetitle);
		
		String url1 = driver.getCurrentUrl();
		System.out.println("after save the URL is: "+url1);
		
		driver.findElement(By.xpath("//a[@id='welcome']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text() = 'Logout']")).click();
		Thread.sleep(3000);
		driver.close();

				

	}

}
