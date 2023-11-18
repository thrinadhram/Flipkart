package sriramjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Whileloop {

	public static void main(String[] args) {
	System.out.println("start");
	String browser = "chrome";
	while (browser.equals("chrome")) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		driver.quit();
		browser="firefox";
		
	}
	System.out.println("end");

	}

}
