package com.dell.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.dell.qa.utilities.TestUtil;


public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public  TestBase() throws IOException {
		
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\ankita_rawat\\eclipse-workspace\\FreeCRMHybridFrameWork\\src\\main\\java\\com\\dell\\qa\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}


		public static void initialization() {
		//System.out.println(prop.getProperty("browser"));
		String browserName = prop.getProperty("browser");
				if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\main\\java\\com\\dell\\qa\\executables\\chromedriver.exe");
			driver = new ChromeDriver(); 
		}
		if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "gecko.exe");
			driver = new FirefoxDriver(); 
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitlyWait, TimeUnit.SECONDS);
		String url=prop.getProperty("url");
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		System.out.println(url+username+password);
		driver.get(prop.getProperty("url"));
		
	
}}