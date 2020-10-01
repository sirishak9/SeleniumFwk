package com.abc.licence.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//added comments
public class HomePage {
	private WebDriver driver;
	private By loginMsg = By.id("msg");
	public HomePage(WebDriver driver) {
		this.driver=driver;
	}
	public String getLoginMessage() {
		String text = driver.findElement(loginMsg).getText();
		driver.findElement(By.xpath("")).click();
		return text;
		driver.get("");
		driver.getTitle();
	}
}
