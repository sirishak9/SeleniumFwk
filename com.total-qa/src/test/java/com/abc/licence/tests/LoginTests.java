package com.abc.licence.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.abc.licence.pages.HomePage;
import com.abc.licence.pages.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTests {
	@Test(description = "Validate the title of the website")
	public void validateTotalQaTitle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://total-qa.com/html-examples/");
		LoginPage lPage = new LoginPage(driver);
		HomePage hPage = lPage.loginValiduser("selenium", "selenium123#");
		String actual =hPage.getLoginMessage();
		String expected = "Login Successful";
		Assert.assertEquals(actual, expected);
		
		
		
	}
}
