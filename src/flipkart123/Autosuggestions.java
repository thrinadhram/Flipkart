package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?n=1");
		WebElement element = driver.findElement(By.id("fromPlaceName"));
		Actions actions = new Actions(driver);
		actions.sendKeys(element,"hyd").perform();
		Thread.sleep(4000);
		actions.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(4000);
		actions.sendKeys(Keys.ENTER).perform();
		Thread.sleep(4000);
		driver.quit();

	}

}
