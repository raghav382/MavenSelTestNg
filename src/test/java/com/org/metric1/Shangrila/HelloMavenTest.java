package com.org.metric1.Shangrila;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class HelloMavenTest{
	
	public ChromeDriver driver;

	
	@Test(priority=2)
	public void EntringTestFirst() throws InterruptedException
	{
		System.out.println("SecondTest");	
		  Thread.sleep(5000);
		  driver.close();
	}
	@Test(priority=1)
	public void raghu() throws InterruptedException
	{
		System.out.println("FirstTest");
		WebElement WE=driver.findElement(By.xpath("//img[@alt='Domestic Air Packages']"));
		Actions ACT=new Actions(driver);
		ACT.moveToElement(WE, 150, 250);
		Thread.sleep(5000);
		JavascriptExecutor javae=(JavascriptExecutor)driver;
		javae.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(3500);


		ACT.sendKeys(Keys.ARROW_DOWN).perform();
		ACT.sendKeys(Keys.ENTER).perform();
		
	}

	@BeforeClass
	public void openbrowser1() throws InterruptedException
	{
		System.out.println("Hello Relax");
		System.setProperty("webdriver.chrome.driver","D:\\JavaAutomation\\Files\\chromedriver_76.0.3809.68.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		  driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		  driver.get("https://irctc.co.in/");
	}
}
