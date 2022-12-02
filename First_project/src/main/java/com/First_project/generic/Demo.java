package com.First_project.generic;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void demo()
	{
		Reporter.log("maven project",true);
	}
    @Test
    public void demo1()
    {
    	Reporter.log("maven project2",true);
    }
    
    @Test
    public void demo2()
    {
    	Reporter.log("maven project3",true);
    }
    @Test
    public void demo3()
    {
    	Reporter.log("maven project4",true);
    }
}
