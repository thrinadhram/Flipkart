package flipkart123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./Drivers\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://hamcrest.org/JavaHamcrest/javadoc/2.2");
		//frame 2
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.hamcrest.collection")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//frame 1
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("org.hamcrest")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(3000);
		
		//frame 3
		driver.switchTo().frame("packageFrame");
		driver.findElement(By.partialLinkText("Co")).click();
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
		System.out.println("i tested all frame functionality in given browser");
		
		driver.close();

	}

}