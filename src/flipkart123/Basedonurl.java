package flipkart123;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Basedonurl {

	public static void main(String[] args) {
		System.setProperty("webelement.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("location='https://www.cypress.io/how-it-works/'");
		


	}

}
