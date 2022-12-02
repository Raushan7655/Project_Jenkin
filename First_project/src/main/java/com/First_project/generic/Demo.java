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
}
