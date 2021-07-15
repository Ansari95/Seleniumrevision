package seleniumrevision.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_box {

	public static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\seleniumrevision.com\\driversFile\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		WebElement enterEmail = driver.findElement(By.id("email"));
		enterEmail.sendKeys("ansa@123.com");
		
		Thread.sleep(3000);
		WebElement appendText = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input"));
		appendText.sendKeys("hello");
		
		//	//next default text operation done by same xpath
		Thread.sleep(3000);
		String defaultText = appendText.getAttribute("value");
		
		System.out.println(defaultText);
		
	
	
		
		//clear is also done by here
		Thread.sleep(3000);
		appendText.clear();
		
		
		WebElement isEnabledButton = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input"));
		
		if(isEnabledButton.isEnabled()){
			
			System.out.println("This button is enabled");
			
		}
		else {
			
			System.out.println("this button is not enabled");
		}
		
		
		
		
		
		
		
		
		

	}

}
