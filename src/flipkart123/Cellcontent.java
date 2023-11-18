package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Cellcontent {

	public static void main(String[] args) {
		System.setProperty("webelement.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
	WebElement cell=	driver.findElement(By.xpath("((//table[@id='example']//tbody//tr)[5]//td)[3]"));
	System.out.println(cell.getText());
	cell = driver.findElement(By.xpath("((//table[@id = 'example']//tbody//tr)[6]//td)[4]"));
	System.out.println(cell.getText());

	}

}
