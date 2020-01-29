package com.dell.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.dell.qa.base.TestBase;

public class ContactsPage extends TestBase {
	public ContactsPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@href='/contacts/new']/button")
	WebElement New;
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement Contacts;
	@FindBy(name="first_name")
	WebElement FirstName;
	@FindBy(name="last_name")
	WebElement LastName;
	@FindBy(name="middle_name")
	WebElement MiddleName;
	@FindBy(xpath="//div[@name='company']/input")
	WebElement Company;
	@FindBy(xpath="//div[@class='fields']/div/button")
	WebElement Access;
	@FindBy(xpath="//label[@for='tags']/div")
	WebElement Tags;
	@FindBy(xpath="//input[@placeholder='Email address']")
	WebElement Email;
	@FindBy(xpath="//div[@name='category']")
	WebElement Category;
	@FindBy(xpath="//div[@name='status']")
	WebElement Status;
	@FindBy(name="description")
	WebElement Description;
	@FindBy(xpath="//input[@placeholder='Twitter handle']")
	WebElement TwitterHandle;
	@FindBy(xpath="//input[@name='do_not_call']")
	WebElement DoNotCall;
	@FindBy(xpath="//input[@name='position']")
	WebElement Positions;
	
	public void Contacts() {
		Contacts.click();
	}
	public void ContactsFillPage() {
		New.click();
		FirstName.sendKeys("ankita");
		LastName.sendKeys("ankita");
	System.out.println("Before selecting"+DoNotCall.isEnabled());
	DoNotCall.click();
	System.out.println("After selecting"+DoNotCall.isEnabled());
	}
	
}
