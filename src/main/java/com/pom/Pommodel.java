package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pommodel {
	public WebDriver driver;//----null driver
	@FindBy(xpath="//a[@class='login']")
	private WebElement sign_Btn;

	public Pommodel(WebDriver abc) {
		this.driver = abc;//this.driver = from runner class driver;
		PageFactory.initElements(driver, this );
		
		
	}

	public WebElement getSign_Btn() {
		return sign_Btn;
	}

}
