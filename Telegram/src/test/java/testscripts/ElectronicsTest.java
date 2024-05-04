package testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ElectronicsTest {
	
	@Test//(invocationCount = 2,threadPoolSize =5,enabled = false)
	public void register() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Register");
		driver.quit();
	}
	@Test //(dependsOnMethods ="register")
	//(priority =0)
	public void login() {
		WebDriver driver=new ChromeDriver();
		System.out.println("login");
		driver.quit();
	}
	@Test(dependsOnMethods ="login")
	public void addtocart() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Addtocart");
		driver.quit();
	}
	@Test(dependsOnMethods ="addtocart")
	public void payment() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Payment");
		driver.quit();
	}
	@Test(dependsOnMethods ="payment")
	public void confirmorder() {
		WebDriver driver=new ChromeDriver();
		System.out.println("Confirmorder");
		driver.quit();
	}
	
	
	
	

}
