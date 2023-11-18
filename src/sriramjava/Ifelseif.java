




























package sriramjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ifelseif {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.out.println("start");
		String browser = "edge";
		if (browser.equals("chrome")) {
			driver= new ChromeDriver();
			
		}else if (browser.equals("firefox")) {
			driver= new FirefoxDriver();
			
			
		}else if (browser.equals("edge")) {
			driver = new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.quit();
		System.out.println("end");
			
		}
		
	

	}


