package interviewQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InterviewQuestions {
	WebDriver driver;
	@Test(enabled = false)
	public void validateQuest1() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get("http://total-qa.com/html-examples/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.MILLISECONDS);
			WebElement e = driver.findElement(By.id("username"));
			 Dimension d = e.getSize();
			 System.out.println("Size::::" +d);
			 Rectangle r = e.getRect();
			 System.out.println("Rectangle::::" +r.getWidth() +" "+r.getHeight());
			 Point p = e.getLocation();
			 System.out.println("Location::::" +p +" "+p.getX()+" "+p.getY()+" "+p.x+" "+p.y);
			 String cssStyle = e.getCssValue("background-color");
			 System.out.println("CSSStyle::::" +cssStyle);
			 System.out.println(e.getAttribute("id"));
			 System.out.println(e.getCssValue("font-family"));
			  driver.close();
			
			
			 
	}
	@Test(description = "what is the javascript fuction used to enter the text in the textbox?")
	public void validateQuestion10() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://total-qa.com/html-examples/");
		driver.manage().window().maximize();
		String s = driver.getTitle();
		System.out.println(s);
		//to verify the text present in a web page
		WebDriverWait wait = new WebDriverWait(driver, 20);
		 Boolean result = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//div[@class='entry-title-subtitle']"), "HTML Examples"));
		 System.out.println(result);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		//zoom in for chrome browser using javascript
//		 //js.executeScript("document.body.style.zoom = '0.65'");
//		//to scroll to particular element using javascript
//		//var ele = document.getElementById('username')
//		//ele.scrollIntoView()
//		WebElement ele = driver.findElement(By.id("username"));
//		js.executeScript("arguments[0].scrollIntoView();", ele);
//		 try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
//		 //to change color of the textbox using javascript
//		 js.executeScript("document.getElementById('username').setAttribute('style','background:red')");
//		//to write in textbox using javascript
//		 js.executeScript("document.getElementById('username').setAttribute('value','Selenium')");
//		 try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		 driver.close();
	}

}
