package com.server;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//This class is used for page object model(POM)
public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	By username=By.xpath("//input[@id='txtUsername']");
	By password=By.xpath("//input[@id='txtPassword']");
	By loginbutt=By.xpath("//input[@id='btnLogin']");
public void getLogin(String user,String pass) throws Exception
{
	driver.findElement(username).sendKeys(user);
	driver.findElement(password).sendKeys(pass);
	Thread.sleep(3000);
	ReadExcel.WriteData(0, 0, 2,driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getText());
	driver.findElement(loginbutt).click();
}
}
