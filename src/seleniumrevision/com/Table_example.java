package seleniumrevision.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_example {
	public static WebDriver driver;
	public static void main(String[] args) {
		 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\Selenium_pro\\Browsers\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("http://www.leafground.com/pages/table.html");
		  
		List<WebElement> numberOfColumns = driver.findElements(By.tagName("th"));
		int size = numberOfColumns.size();
		System.out.println(size);
		
		List<WebElement> numberOfRows = driver.findElements(By.tagName("tr"));
		int size2 = numberOfRows.size();
		System.out.println(size2);
		
		
		WebElement learnInteract = driver.findElement(By.xpath("//*[text()='Learn to interact with Elements']//following::td[1]"));
		String text = learnInteract.getText();
		System.out.println(text);
		
		
		List<WebElement> leastNumber = driver.findElements(By.xpath("//td[2]"));
		
		ArrayList<Integer> covertstring = new ArrayList<>();
		
		for (WebElement string : leastNumber) {
			
				String remove = string.getText().replace("%", "");
			
				covertstring.add(Integer.parseInt(remove));
				
			}
		
		System.out.println(covertstring);
		
		Integer min = Collections.min(covertstring);
		System.out.println(min+"%");
		
		//String xpath = ""/""+min+"/"";
		
		
		
		
		
		
		
		
		
		
		
		
		
		  
		  
		  
	}

}
