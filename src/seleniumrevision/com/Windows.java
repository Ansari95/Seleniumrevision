package seleniumrevision.com;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows {
	
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.leafground.com/pages/Window.html");
		  
		  String firstWindow = driver.getWindowHandle();
		  
		  WebElement multiwindowClick = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/button"));
		  multiwindowClick.click();
		  
		  Set<String> windowHandles = driver.getWindowHandles();
		  int size = windowHandles.size();
		  System.out.println(size);
		  
		driver.switchTo().window(firstWindow);
		  
		 WebElement closeExceptFirstWindow = driver.findElement(By.id("color"));
		 closeExceptFirstWindow.click();
		 
		Set<String> windowHandles2 = driver.getWindowHandles();
		
		for (String closeall : windowHandles2) {
			
			if(!firstWindow.equals(closeall))
			
				driver.switchTo().window(closeall);
				driver.close();
			
			
			
		}
			 
		}
		  
	}