package seleniumrevision.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_example {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ELCOT\\Desktop\\eclipse\\seleniumrevision.com\\driversFile\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Button.html");
				
		WebElement getPosition = driver.findElement(By.xpath("(//button[@id='position'])"));
		int x = getPosition.getLocation().getX();
		int y = getPosition.getLocation().getY();
		System.out.println("x position is "+ x +" y position is "+ y);
		
		
		WebElement colour = driver.findElement(By.id("color"));
		String cssValue = colour.getCssValue("background-color");
		System.out.println(cssValue);

		WebElement sizeButton = driver.findElement(By.id("size"));
		int height = sizeButton.getSize().getHeight();
		int width = sizeButton.getSize().width;
		
		System.out.println("height is "+ height + " width is "+ width);
		
		
	}

}
