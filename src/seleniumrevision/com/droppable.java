package seleniumrevision.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class droppable {
	public static WebDriver driver;
	public static void main(String[] args) {
	
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.leafground.com/pages/drop.html");
		  
		  WebElement from = driver.findElement(By.id("draggable"));
		  WebElement to = driver.findElement(By.id("droppable"));
		  
		  Actions action = new Actions(driver);
		 // action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		  
		  action.dragAndDrop(from, to).build().perform();
		  
	}

}
