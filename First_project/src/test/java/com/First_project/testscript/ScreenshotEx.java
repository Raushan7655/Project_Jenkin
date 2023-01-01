package com.First_project.testscript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotEx {

	public static void main(String[] args) throws IOException {

	WebDriverManager.chromedriver().setup() ;
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	TakesScreenshot t=(TakesScreenshot)driver;                   //    ghgftrf
	File src = t.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshot1/ss.png");
	FileUtils.copyFile(src, dest);
	}
}

