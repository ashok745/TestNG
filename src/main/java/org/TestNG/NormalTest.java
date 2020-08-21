package org.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NormalTest {
	static WebDriver driver;
	@Test
	public static void launch(){
		System.setProperty("webdriver.chrome.driver", "E:\\Ashu\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

}
