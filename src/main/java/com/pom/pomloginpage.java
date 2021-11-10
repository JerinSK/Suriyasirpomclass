package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pomloginpage {
	public WebDriver driver;
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement email;
    @FindBy(xpath=("(//button[@type='submit'])[2]"))
    private WebElement submit;
    @FindBy(xpath="//div[@id='uniform-id_gender1']")
    private WebElement gender;
    @FindBy(xpath="//input[@id='customer_firstname']")
    private WebElement firstname;
    @FindBy(xpath="//(input[@type='text'])[3]")
    private WebElement text;
    @FindBy(xpath="//input[@type='password']")
    private WebElement passwrd;
    @FindBy(xpath="//select[@id='days']")
    private WebElement day;
    @FindBy(xpath="//select[@id='months']")
    private WebElement month;
    @FindBy(xpath="//select[@id='years']")
    private WebElement years;
    @FindBy(xpath="(//input[@type='checkbox'])[1]")
    private WebElement check;
    @FindBy(xpath=("(//input[@type='checkbox'])[2]"))
    private WebElement box;
    @FindBy(xpath=("(//input[@type='text'])[7]"))
    private WebElement textb;
    @FindBy(xpath=("(//input[@type='text'])[8]"))
    private WebElement te;
    @FindBy(xpath=("(//input[@type='text'])[9]"))
    private WebElement tex;
    @FindBy(xpath=("(//input[@type='text'])[10]"))
    private WebElement t;
    @FindBy(xpath=("//select[@name='id_state']"))
    private WebElement bo;
    @FindBy(xpath=("(//input[@type='text'])[11]"))
    private WebElement boxe;
    @FindBy(xpath=("//select[@name='id_country']"))
    private WebElement country;
    @FindBy(xpath=("//textarea[@name='other']"))
    private WebElement other;
    @FindBy(xpath=("(//input[@type='text'])[12]"))
    private WebElement type;
    @FindBy(xpath=("(//input[@type='text'])[13]"))
    private WebElement texteee;
    @FindBy(xpath=("(//input[@type='text'])[14]"))
    private WebElement findee;
    @FindBy(xpath=("(//button[@type='submit'])[2]"))
    private WebElement craz;
    public pomloginpage(WebDriver abc) {
    	this.driver = abc;
    	PageFactory.initElements(driver, this);
    	
    }
	public WebElement getEmail() {
		return email;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getGender() {
		return gender;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getText() {
		return text;
	}
	public WebElement getPasswrd() {
		return passwrd;
	}
	public WebElement getDay() {
		return day;
	}
	public WebElement getMonth() {
		return month;
	}
	public WebElement getYears() {
		return years;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getBox() {
		return box;
	}
	public WebElement getTextb() {
		return textb;
	}
	public WebElement getTe() {
		return te;
	}
	public WebElement getTex() {
		return tex;
	}
	public WebElement getT() {
		return t;
	}
	public WebElement getBo() {
		return bo;
	}
	public WebElement getBoxe() {
		return boxe;
	}
	public WebElement getCountry() {
		return country;
	}
	public WebElement getOther() {
		return other;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getTexteee() {
		return texteee;
	}
	public WebElement getFindee() {
		return findee;
	}
	public WebElement getCraz() {
		return craz;
	}
}
