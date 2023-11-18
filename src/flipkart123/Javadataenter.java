package flipkart123;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Javadataenter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webelement.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("location='https://emicalculator.net/'");
		je.executeScript("document.getElementById('loaninterest').value='11.5'");
		Thread.sleep(4000);

		

	}

}
