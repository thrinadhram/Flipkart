package flipkart123;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Multiplebrowsers {

	public static void main(String[] args) throws InterruptedException {
		
		//How to handle multiple browsers or multiple tabs or multiple windows.
	System.setProperty("webelement.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("location='https://www.cypress.io/how-it-works/'");
		WebElement element = driver.findElement(By.xpath("//a[text() = ' Log In ']"));
		je.executeScript("arguments[0].click()",element);
		Thread.sleep(4000);
		Set<String> set = driver.getWindowHandles();
		List<String> list = new ArrayList<String>(set);
		driver.switchTo().window(list.get(1));
		Thread.sleep(4000);
		
		
		
	WebElement github=	driver.findElement(By.xpath("//span[@class='pull-left']"));
	github.click();

	}

}
