package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Rowcontent {

	public static void main(String[] args) {
		System.setProperty("webelement.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		WebElement row = driver.findElement(By.xpath("(//table[@id='example']//tbody//tr)[3]"));
		System.out.println(row.getText());
		WebElement row5 = driver.findElement(By.xpath("(//table[@id='example']//tbody//tr)[5]"));
		System.out.println(row5.getText());

	}

}
