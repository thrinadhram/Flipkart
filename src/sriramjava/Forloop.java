package sriramjava;

import java.util.Iterator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Forloop {

	public static void main(String[] args) {
		System.out.println("start");
		for (int i = 1; i < 3; i++) {
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver();
			driver.get("https://www.selenium.dev/downloads/");
			driver.quit();
		}
		System.out.println("end");

	}

}
