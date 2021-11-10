package com.Mavenproject;

import java.io.File;
import java.io.IOException;

import org.omg.IOP.CodecPackage.TypeMismatch;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

public class suriyasirpromain {
	public static WebDriver driver;
	public static WebDriver getBrowser(String type) {
		if(type.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver//chromedriver.exe");
				driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			driver = new FirefoxDriver();
		} 
		
		return driver;

}
	public static void frame(int value) {
		driver.switchTo().frame(value);

	}
	public static void maximize() {
		driver.manage().window().maximize();

	}
	public static void getURL(String url) {
	       driver.get(url);
		}
	public static void quit() {
		driver.quit();
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void inputValueElement(WebElement element,String value) {
		element.sendKeys(value);
	}
	public static void close() {
		driver.close();
	}
	public static void dropdown(String type , WebElement element ,String value ) {
		Select s = new Select(element);
		if (type.equalsIgnoreCase("by Value")) {
			s.selectByValue(value);
			
		}
		else if(type.equalsIgnoreCase("byVisisbleText")) {
			s.selectByVisibleText(value);
		}
		else if(type.equalsIgnoreCase("byIndex")) {
			int data = Integer.parseInt(value);
		    s.selectByIndex(data);
		
		}
	}

	
	
	public static void alert() {
		driver.switchTo().alert().accept();
	
	}
	public static void thread() throws InterruptedException {
		Thread.sleep(2000);

	}
	public static void scrollUpandDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();",element);
		}
	public static void defaultcontent() {
        driver.switchTo().alert();
	}
	public static void moveelements(WebElement element) {
        Actions a = new Actions(driver);
        a.moveToElement(element).build().perform();
	}
	public static void clickelements(WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();
		

	}
	public static void screenshot()throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Yogan\\eclipse-workspace\\Mavenproject\\src\\Screenshot\\snapy.png");
		FileHandler.copy(src, des);

	}
	

	}


















