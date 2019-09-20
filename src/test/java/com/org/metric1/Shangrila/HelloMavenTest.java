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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HelloMavenTest{
	
	public ChromeDriver driver;

	
	@Test(priority=2)
	public void EntringTestFirst() throws InterruptedException
	{
		System.out.println("SecondTest");	
        driver.findElement(By.xpath("//a[text()=' REGISTER ']")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName")));
        driver.findElement(By.id("userName")).sendKeys("Raghavendra");
        driver.findElement(By.id("usrPwd")).sendKeys("kavya382");
        driver.findElement(By.id("cnfUsrPwd")).sendKeys("kavya382");
        driver.findElement(By.xpath("//label[text()=\"Select Security Question\"]")).click();
        driver.findElement(By.xpath("//span[text()='What is your pet name?']")).click();
        driver.findElement(By.xpath("//input[@placeholder='Security Answer']")).sendKeys("Raghav");
        driver.findElement(By.xpath("//label[text()='Select Preferred Language']")).click();
        driver.findElement(By.xpath("//span[text()='हिंदी']")).click();
		JavascriptExecutor javae=(JavascriptExecutor)driver;
		javae.executeScript("window.scrollBy(700,0)", "");
		driver.navigate().back();
		  Thread.sleep(2000);
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
		JavascriptExecutor java1e=(JavascriptExecutor)driver;
		javae.executeScript("window.scrollBy(1200,0)", "");
		
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
