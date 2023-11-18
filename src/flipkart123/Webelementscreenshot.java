package flipkart123;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webelementscreenshot {

	public static void main(String[] args) throws IOException, InterruptedException  {
		System.setProperty("webelement.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		WebElement table =  driver.findElement(By.id("example"));
	File source	=table.getScreenshotAs(OutputType.FILE);
	File dest = new File("myimg\\table.PNG");
	FileHandler.copy(source,dest);
	Thread.sleep(4000);
			
	}

}
