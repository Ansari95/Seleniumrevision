package seleniumrevision.com;

import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.io.ManagedSelector.Selectable;

public class Dropown {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.leafground.com/pages/Dropdown.html");
		  
		  WebElement firstSelectByIndex = driver.findElement(By.id("dropdown1"));
		  Select index = new Select(firstSelectByIndex);
		  index.selectByIndex(2);
		  
		  
		  WebElement secUsingText = driver.findElement(By.name("dropdown2"));
		  Select tsxt = new Select(secUsingText);
		  tsxt.selectByVisibleText("Selenium");
		  
		  WebElement usingValue = driver.findElement(By.id("dropdown3"));
		  Select value = new Select(usingValue);
		  value.selectByValue("2");
		  
		  WebElement numberOfDropDown = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/select"));
		  Select count = new Select(numberOfDropDown);
		  List<WebElement> options = count.getOptions();
		  int size = options.size();
		  System.out.println(size);
		  
		  WebElement senkeyMethod = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/select"));
		  senkeyMethod.sendKeys("selenium");
		  
		 WebElement allselect = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[6]/select"));
		 Select allselected = new Select(allselect);
		 List<WebElement> options2 = allselected.getOptions();
		 
		 for(int i = 0; i<options2.size();i++){
			 
			 allselected.selectByIndex(i);
			 
		 }
		 
		 
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
