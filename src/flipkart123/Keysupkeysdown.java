package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keysupkeysdown {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
	driver.switchTo().frame("iframeResult");
	Actions actions = new Actions(driver);
	actions.keyDown(Keys.CONTROL).perform();
	Thread.sleep(4000);
	actions.click(driver.findElement(By.xpath("//option[text()='Volvo']")));
	Thread.sleep(4000);
	actions.click(driver.findElement(By.xpath("//option[text()='Audi']")));
	Thread.sleep(4000);
	actions.keyUp(Keys.CONTROL).perform();
	}

}
