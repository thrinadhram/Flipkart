package flipkart123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;

public class Actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Drivers//msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timesjobs.com/");
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		Thread.sleep(4000);
		WebElement searchjobs=driver.findElement(By.partialLinkText("Find Jobs"));
		org.openqa.selenium.interactions.Actions act = new org.openqa.selenium.interactions.Actions(driver);
		act.moveToElement(searchjobs).click().build().perform();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
	}

}
