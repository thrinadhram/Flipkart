package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

class Extracetabledata {

	public static void main(String[] args) {
		System.setProperty("webelement.edge.driver", "./Driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		WebElement element = driver.findElement(By.id("example"));
		System.out.println(element.getText());

	}

}
