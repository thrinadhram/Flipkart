package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clickandhold {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.id("draggable"));
		Thread.sleep(2000);
		WebElement target = driver.findElement(By.id("droppable"));
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.clickAndHold(source).release(target).perform();
		Thread.sleep(4000);

	}

}
