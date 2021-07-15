package seleniumrevision.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertworking {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		
	      System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.leafground.com/pages/Alert.html");
		  
		  WebElement normalalret = driver.findElement(By.xpath("(//button[@onclick='normalAlert()'])"));
		  normalalret.click();
		  driver.switchTo().alert().accept();
		   
		  WebElement confirmALert = driver.findElement(By.xpath("(//button[@onclick='confirmAlert()'])")); 
		  confirmALert.click();
		  driver.switchTo().alert().dismiss();
		  
		  WebElement promptAlert = driver.findElement(By.xpath("(//button[@onclick='confirmPrompt()'])"));
		  promptAlert.click();
		  driver.switchTo().alert().sendKeys("hello");
		  driver.switchTo().alert().accept();
		  
		  
		  
		  
		  
	}

}
