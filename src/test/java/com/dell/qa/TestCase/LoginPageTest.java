package com.dell.qa.TestCase;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.dell.qa.base.TestBase;
import com.dell.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginPage; 
public LoginPageTest() throws IOException {
}
	
@BeforeSuite
public void setUp() throws IOException {
	initialization();
	loginPage = new LoginPage();
}
@Test(priority=1)
public void Title() {
	System.out.println(loginPage.VerifyTitle());
	
}
@Test(priority=2)
public void Loginto() {
	loginPage.ClickLogin();

}
@Test(priority=3,dependsOnMethods="Loginto")
public void TitleAfterLogin() {
	System.out.println("Test Case Title after login"+loginPage.VerifyTitle());
	
}
@Test(priority=4,dependsOnMethods="Loginto")
public void  Login(){
	loginPage.Login();
	
}
@AfterSuite
public void tearDown() {
	driver.close();
	
}
}
