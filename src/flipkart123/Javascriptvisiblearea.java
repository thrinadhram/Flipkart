package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Javascriptvisiblearea {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webelement.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		WebElement element = driver.findElement(By.name("submit"));
		JavascriptExecutor je = (JavascriptExecutor) driver;
		// je.executeScript("arguments[0].scrollIntoView()",element);
//	je.executeScript("arguments[0].click()",element);
		je.executeScript("document.getElementsByName('submit')[0].scrollIntoView()");
		Thread.sleep(4000);

		je.executeScript("document.getElementsByName('submit')[0].click()");

	}

}
