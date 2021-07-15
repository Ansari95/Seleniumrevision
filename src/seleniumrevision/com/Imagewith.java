package seleniumrevision.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Imagewith {
	public static WebDriver driver;
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.leafground.com/pages/Image.html");
		  
		  WebElement brokenImage = driver.findElement(By.xpath("(//div[@class='example'])[2]//img"));
		  
		  if(brokenImage.getAttribute("naturalWidth").equals("0"));
		  
		  System.out.println("this image is broken");
	
	}

}
