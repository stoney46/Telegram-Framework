package Genricutility;

import java.time.Duration;

import javax.security.auth.login.LoginContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjectmodel.Welcomepage;

import pageobjectmodel.LoginPage;
//import objectRepository.WelcomePage;

public class Baseclass {

	public WebDriver driver;
	@BeforeSuite
	public void bs() {
		System.out.println("Before suite");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("Before test");
	}
	@BeforeClass
	public void launchBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		System.out.println("Before class");
	}
	@BeforeMethod
	public void login() {
		Welcomepage welcome=new Welcomepage(driver);
		
		LoginPage login=new LoginPage(driver);
		welcome.getBookslink().click();
		
		login.getEmailTextField().sendKeys("nandanms@gmail.com");
		login.getPasswordTextField().sendKeys("nandan@1234");
		
		login.getLoginButton().click();
		
		System.out.println("Before method");
	}
	
	
	@AfterSuite
	public void as() {
		System.out.println("After suite");
	}
	
	@AfterTest
	public void at() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
		System.out.println("After class");
	}
	
	@AfterMethod
	public void logout() {
		Welcomepage welcome=new Welcomepage(driver);
		
		welcome.getBookslink().click();
		System.out.println("After method");
	}
	
}