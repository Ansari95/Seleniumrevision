package seleniumrevision.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;

public class Interactwithlink {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\seleniumrevision.com\\driversFile\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://www.leafground.com/pages/Link.html");
	  
	  
	  WebElement findLinkpath = driver.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/a"));
	  String linkpath = findLinkpath.getAttribute("href");
	  System.out.println(linkpath);
	  
	  List<WebElement> findElements = driver.findElements(By.tagName("a"));
	  int size = findElements.size();
	  System.out.println("Total link is "+ size);
	  
	  
	  WebElement verifyBroken = driver.findElement(By.linkText("Verify am I broken?"));
	  verifyBroken.click();
	  String newPageLInk = driver.getTitle();
	  
	  if(newPageLInk.contains("404")){
		  
		  System.out.println("this link is broken");
		  }
	  else {
		System.out.println("this link is not broken");
	}
	  
	  
	  
	  
	}

}
