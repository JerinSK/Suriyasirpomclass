package com.Runner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.Mavenproject.Base;

import java.io.File;
import java.io.IOException;
public class Test_Runner extends Base {



	public static void main(String[] args) throws InterruptedException, IOException {
		
		//driver.get("https://en-gb.facebook.com/");
		getUrl("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		WebElement signin = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		//signin.click();
		clickOnElement(signin);
		Thread.sleep(2000);
	    WebElement fina = driver.findElement(By.name("firstname"));
	    //fina.sendKeys("Jerin");
	    inputValueElement(fina,"Jerin");
	    WebElement finde = driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]"));
	    //finde.sendKeys("Kala");
	    inputValueElement(finde,"Kala");

	    WebElement element = driver.findElement(By.xpath("(//input[@type=\'text\'])[4]"));
	    //element.sendKeys("skzeus5@gmail.com");
	    inputValueElement(element,"skzeus5@gmail.com");

	    WebElement fun = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		//fun.sendKeys("Jerin@1997");
	    inputValueElement(fun,"Jerin@1997");

		//select
	    WebElement day = driver.findElement(By.id("day"));
	    Select s = new Select(day);
	    s.selectByValue("17");
	    WebElement month = driver.findElement(By.id("month"));
	    Select s1 = new Select(month);
	    s1.selectByIndex(6);
	    WebElement year = driver.findElement(By.id("year"));
	    Select s2 = new Select(year);
	    s2.selectByVisibleText("1997");
	    WebElement driv = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));
	    //driv.click();
	    clickOnElement(driv);
	    WebElement driving = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	    //driving.click();
	    clickOnElement(driving);
	    //Thread.sleep(3000);
	    WebElement last_button = driver.findElement(By.xpath("(//button[@type=\'submit\'])[2]"));
	    //last.click();
	    clickOnElement(last_button);
	    
		
		
		
    
		
		
		
				
		
		
		
	}

	
		
	}





