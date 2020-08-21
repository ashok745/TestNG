package org.TestNG;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PriorityClass {
	static WebDriver driver;
@BeforeClass
public static void launch(){
	System.setProperty("webdriver.chrome.driver", "E:\\Ashu\\chromedriver.exe");
	 driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
}
@BeforeMethod
public void sart() {
	Date d = new Date();
	System.out.println(d);
}
@Test
public void t1(){
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("ashok.testing9001@gmail.com");
}
@Test
public void t2(){
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("Ayadav@62");
}
@AfterMethod
public void end() {
	Date d = new Date();
	System.out.println(d);
}
@AfterClass
public void quit(){
	driver.quit();
}
}
