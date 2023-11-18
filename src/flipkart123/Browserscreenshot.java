package flipkart123;
//
import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Browserscreenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webelement.edge.driver", "./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/");
		WebElement table = driver.findElement(By.id("example"));
		// File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Shutterbug.shootPage(driver, Capture.FULL).save("./image7.PNG");

//		File tc = new File("myimg\\image6.PNG");
//		org.openqa.selenium.io.FileHandler.copy(ts, tc);
//		Thread.sleep(2000);
//		System.out.println("my screenshort is successfully completed");
////		
//		
//	

	}

}
