package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	WebDriver ldriver;
	
	public Loginpage (WebDriver rdriver)
	{
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="user-name")
	WebElement txtUserName;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txtPassword;
	
	@FindBy(name="login-button")
	WebElement btnLogin;
	
	
	
	
	public void SetUsername(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	
	public void SetPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void ClickSubmit()
	{
		btnLogin.click();
	}
	
	
}
