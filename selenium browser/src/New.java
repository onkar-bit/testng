import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class New extends sample {
	
	public void search() {
		driver.findElement(By.xpath("//input[@name='q' and @type='text']")).sendKeys("selenium",Keys.ENTER);
        System.out.println("The new title: "+driver.getTitle());
	}
	
	
	public static void main(String[] args) {
		New s1 = new New();
		s1.browser();
		s1.nevigate("https://www.google.com");
		s1.search();
		s1.click();
		s1.scroll();
	}
	

}
