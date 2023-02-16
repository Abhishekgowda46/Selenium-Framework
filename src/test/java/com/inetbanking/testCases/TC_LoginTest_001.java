package com.inetbanking.testCases;

import java.io.IOException;
import org.testng.annotations.Listeners;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.Loginpage;

@Listeners(com.inetbanking.testCases.Listeners.class)
public class TC_LoginTest_001 extends BaseClass
{
    @Test
	public void loginTest() throws InterruptedException, IOException
	{
		driver.get(baseURL);
		
		Loginpage lp=new Loginpage(driver);
		lp.SetUsername(username);
		
		lp.SetPassword(password);
		lp.ClickSubmit();
		
	
    
	}
}
