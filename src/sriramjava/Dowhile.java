package sriramjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dowhile {

	public static void main(String[] args) {
		String browser = "edge";
		do {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.selenium.dev/downloads/");
			
		}
		while (browser.equals("firefox"));
		System.out.println("end");
		
		

	}

}
