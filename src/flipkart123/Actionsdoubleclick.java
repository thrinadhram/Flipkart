package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsdoubleclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dbclick/");
	WebElement div = driver.findElement(By.partialLinkText("Karl Swedberg and Jonathan Chaffer"));
	Actions action = new Actions(driver);
	action.doubleClick(div).build().perform();
	Thread.sleep(4000);	
	}

}
