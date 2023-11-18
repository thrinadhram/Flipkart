package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Highlightofwebelementt {

	public static void main(String[] args) throws InterruptedException {
	//how to highlight an object or control or webelement
		System.setProperty("webelement.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("location ='https://www.thepancard.com/newpancard.php'");
//		je.executeScript("document.getElementById('proof_dob').style.border='2px solid Red'");
//		Thread.sleep(4000);
//		je.executeScript("document.getElementById('proof_dob').style.background='Green'");
		WebElement heighlight = driver.findElement(By.id("proof_dob"));
		je.executeScript("arguments[0].style.border= '4px solid Green';",heighlight);
		je.executeScript("arguments[0].style.background = 'yellow';",heighlight);
		

	}

}
