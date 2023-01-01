package com.First_project.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(ListnerImplementation.class)
public class Login {
	WebDriver driver;
@Test(dataProvider = "getExceldata",dataProviderClass =DataProviderex.class)

	public void login(String username,String password)
	{
	
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		System.out.println(username);
		System.out.println(password);
		
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		
		Assert.assertTrue(false);
	//	driver.close();
	
}
}