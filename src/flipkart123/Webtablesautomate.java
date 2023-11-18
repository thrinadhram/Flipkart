package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Webtablesautomate {

	public static void main(String[] args) {
		System.setProperty("webelement.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
	System.out.println(driver.findElements(By.id("example")).size());//
	System.out.println(driver.findElements(By.xpath("//table[@id='example']//tr")).size());
	System.out.println(driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size());
	
	
	}

}
