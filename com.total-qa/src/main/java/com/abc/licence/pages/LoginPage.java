package com.abc.licence.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	private By usernameID = By.id("username");
	private By pwordID = By.id("pass word");
	private By signInXpath = By.xpath("//button[text()='Login']");
	
	public LoginPage( WebDriver driver) {
		this.driver=driver;
		
	}
	public void setuserName(String uNameValue) {
		driver.findElement(usernameID).sendKeys(uNameValue);
	}
	public void setpassword(String pwdValue) {
		driver.findElement(pwordID).sendKeys(pwdValue);
	}
	
	public void clickSignin() {
		driver.findElement(signInXpath).click();
	}
	public HomePage loginValiduser(String uName,String pWord) {
		setuserName(uName);
		setpassword(pWord);
		clickSignin();
		return new HomePage(driver);
	}
	}
