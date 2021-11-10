package com.Runner;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import com.Mavenproject.suriyasirpromain;

public class suriyasirprorunner extends suriyasirpromain {
	
	public static void main(String[] args) throws InterruptedException, IOException {
        driver = getBrowser("chrome");
		getURL("http://automationpractice.com/index.php");
		maximize();
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		clickOnElement(login);
		WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		inputValueElement(text,"jerinsk75@gmail.com");
		WebElement passwrd = driver.findElement(By.xpath("//input[@id='passwd']"));
		inputValueElement(passwrd,"Jerin@1997");
		WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
		clickOnElement(submit);
		
		WebElement women = driver.findElement(By.xpath("//a[text()='Women']"));
		clickOnElement(women);
		WebElement java = driver.findElement(By.xpath("(//form[@method='post'])[1]"));
		scrollUpandDown(java);
	
		WebElement orange = driver.findElement(By.xpath("(//div[@class='product-container'])[1]"));
		
		WebElement quickview = driver.findElement(By.xpath("(//a[@class='quick-view'])[1]"));
		clickOnElement(quickview);
		
		WebElement outer = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		frame(0);
		
		thread();
		WebElement quantities = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		clickelements(quantities);
		WebElement select = driver.findElement(By.xpath("//select[@name='group_1']"));
		
		//Select s = new Select(select);
		dropdown("byValue",select,"2");
		WebElement blue = driver.findElement(By.xpath("//a[@name='Blue']"));
		clickOnElement(blue);
		WebElement exclusive = driver.findElement(By.xpath("//button[@class='exclusive']"));
		clickOnElement(exclusive);
		defaultcontent();
		thread();
		
		WebElement proceed = driver.findElement(By.xpath("//span[contains(text(),'Proceed')]"));
		clickOnElement(proceed);
		WebElement check = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		clickOnElement(check);
		WebElement seconds = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		scrollUpandDown(seconds);
		WebElement pro = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		clickOnElement(pro);
		
		WebElement checkb = driver.findElement(By.xpath("//input[@type='checkbox']"));
		clickOnElement(checkb);
		WebElement subm = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(subm);
		
		WebElement checqe = driver.findElement(By.xpath("//a[@class='cheque']"));
		clickOnElement(checqe);
		WebElement mit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickOnElement(mit);
		screenshot();	
		

}
}

	
