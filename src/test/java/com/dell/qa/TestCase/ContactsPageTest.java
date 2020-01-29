package com.dell.qa.TestCase;

import java.io.IOException;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.dell.qa.base.TestBase;
import com.dell.qa.pages.ContactsPage;
import com.dell.qa.pages.LoginPage;


public class ContactsPageTest extends TestBase{
	LoginPage loginPage;
	public ContactsPageTest() throws IOException {
		super();
		
	}
	ContactsPage contacts;
	@BeforeSuite
		public void setUp() throws IOException {
		initialization();
		loginPage = new LoginPage();
		contacts = new ContactsPage();
	}
	@Test(priority=1)
	public void contacts() {
		loginPage.ClickLogin();
		loginPage.Login();
		
		contacts.Contacts();
	}
	@Test(priority=2)
	public void contactsFill() {
		contacts.ContactsFillPage();
	}
}
