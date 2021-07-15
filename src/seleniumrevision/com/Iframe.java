package seleniumrevision.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static WebDriver driver;
	public static void main(String[] args) {
		
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.leafground.com/pages/frame.html");
		  
		  driver.switchTo().frame(0);
		  WebElement frameclick = driver.findElement(By.id("Click"));
		  frameclick.click();
		  frameclick.getText();
		  
		  driver.switchTo().defaultContent();
		  
		  driver.switchTo().frame(1);
		  driver.switchTo().frame("frame2");
		  
		  WebElement click1 = driver.findElement(By.id("Click1"));
		  click1.click();
		  
		  driver.switchTo().defaultContent();
		  
		  
		  List<WebElement> findElementssize = driver.findElements(By.tagName("iframe"));
		  int size = findElementssize.size();
		  System.out.println(size);
		  
		  
		

	}

}
