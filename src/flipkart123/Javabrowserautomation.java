package flipkart123;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Javabrowserautomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webelement.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(3000);
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("location='https://amazon.com'");
		Thread.sleep(3000);
		System.out.println(je.executeScript("return document.title"));
		System.out.println(je.executeScript("return document.URL"));
		
		je.executeScript("history.back()");
		je.executeScript("history.scrollRestoration");
		je.executeScript("history.forward()");
			
		// System.out.println(je.executeScript(""));

	}

}
