package flipkart123;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Javascriptclick {

	public static void main(String[] args) {
		System.setProperty("webelement.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("location = 'https://www.apsrtconline.in/oprs-web/guest/home.do?n=1'");
		je.executeScript("document.getElementById('searchBtn').click()");

	}

}
