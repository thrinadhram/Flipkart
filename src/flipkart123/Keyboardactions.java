package flipkart123;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboardactions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		Thread.sleep(4000);
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(4000);
		actions.sendKeys(Keys.PAGE_UP).build().perform();
		actions.sendKeys(Keys.END).perform();
		Thread.sleep(4000);
		actions.sendKeys(Keys.HOME).perform();
		

	}

}
