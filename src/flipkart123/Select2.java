package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select2 {

	public static void main(String[] args) throws InterruptedException {
		System.getProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
	WebElement cars =	driver.findElement(By.id("cars"));
	Select item=new Select(cars);
	System.out.println(item.isMultiple());
	item.selectByVisibleText("Saab");
	Thread.sleep(4000);
	item.selectByIndex(0);
	Thread.sleep(4000);
	item.selectByValue("audi");
	Thread.sleep(4000);
	item.deselectByIndex(3);
	Thread.sleep(4000);
	item.deselectByValue("volvo");
	Thread.sleep(4000);
	item.deselectByVisibleText("Saab");
	Thread.sleep(4000);
	System.out.println(item.getAllSelectedOptions().size());
	System.out.println(item.getOptions().size());
	
	
	
	

	}

}
