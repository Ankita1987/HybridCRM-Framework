package com.dell.qa.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TestUtil {
public static long pageLoadTimeout=30;
public static long implicitlyWait=30;
public static void Simulation(WebElement Simulation ,String st) {
	Select s=new Select(Simulation);
	//String st="3PL - Simulation";
	s.selectByVisibleText(st);
	//s.selectByIndex(String 3PL - Simulation);
	
	}
}
