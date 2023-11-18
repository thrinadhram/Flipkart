package sriramjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifcodition {

	public static void main(String[] args) {
		System.out.println("start");
		String browser = "chrome";
		if (browser.equals("chrome")) {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com");
			driver.quit();
			System.out.println("end");
			
		}
		
		

	}

}
