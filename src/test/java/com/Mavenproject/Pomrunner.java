package com.Mavenproject;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pom.Pommodel;
import com.pom.pomloginpage;

public class Pomrunner extends Pommain {
	public static WebDriver driver = Pommain.getBrowser("chrome");
	public static Pommodel p = new Pommodel(driver);
	public static pomloginpage pl = new pomloginpage(driver);
	public static void main(String[] args) throws InterruptedException, IOException {
//        driver = getBrowser("chrome");
		getURL("http://automationpractice.com/index.php");
		maximize();
		
		
		
		clickOnElement(p.getSign_Btn());
		
		
		inputValueElement(pl.getEmail(),"Jerinsk75@gmail.com");
		
		clickOnElement(pl.getSubmit());
		thread();
	   
	    clickOnElement(pl.getGender());
	
		inputValueElement(pl.getFirstname(),"Jerin");
		
		inputValueElement(pl.getText(),"SK");
		
		inputValueElement(pl.getPasswrd(),"Jerin@1997");
		
		dropdown("byValue",pl.getDay(),"17");
		
		dropdown("byValue",pl.getMonth(),"6");
		
		dropdown("byValue",pl.getYears(),"1997");
		
		clickOnElement(pl.getCheck());
		
		clickOnElement(pl.getBox());
		
		inputValueElement(pl.getTextb(),"Amazon");
		
		inputValueElement(pl.getTe(),"Amazon facility center America");
		
		inputValueElement(pl.getTex(),"center called united States");
		
		inputValueElement(pl.getT(),"seward");
		
		dropdown("byValue",pl.getBo(),"2");
		
		inputValueElement(pl.getBoxe(),"99664");
		
		dropdown("byValue",pl.getCountry(),"21");
		
		inputValueElement(pl.getOther(),"9487356077");
		
		inputValueElement(pl.getType(),"7904076083");
		
		inputValueElement(pl.getTexteee(),"9487356077");
		
		inputValueElement(pl.getFindee(),"United States");
		
		clickOnElement(pl.getCraz());
		
		

}
}
