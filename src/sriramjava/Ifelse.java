package sriramjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ifelse {
public static void main(String[] args) {
	

		WebDriver driver= null;
		System.out.println("start");
		String browser = "firefox";
		if (browser.equals("firefox")) {
			 driver = new ChromeDriver();
			 
			
			
		

		}else {
			 driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println("end");
	
			
		}

	}


