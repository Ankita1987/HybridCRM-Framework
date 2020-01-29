package com.dell.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dell.qa.base.TestBase;

public class LoginPage extends TestBase{
	
@FindBy(name="email")
WebElement UserName;
@FindBy(name="password")
WebElement Password;
@FindBy(xpath="//div/form/div/div[3]")
WebElement Submit;
@FindBy(xpath="//html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[1]")
WebElement Login;
public LoginPage() throws IOException{
	PageFactory.initElements(driver, this);
}

public String VerifyTitle() {
return	driver.getTitle();	
}
public void ClickLogin() {
Login.click();
}
public void Login() {
	UserName.sendKeys(prop.getProperty("username"));	
	Password.sendKeys(prop.getProperty("password"));	
	Submit.click();
}
}
