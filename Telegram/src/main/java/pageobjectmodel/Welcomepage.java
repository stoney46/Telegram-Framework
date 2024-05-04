package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Welcomepage {
	
	
	public Welcomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
     

	@FindBy(partialLinkText = "BOOKS")
	private WebElement bookslink;
	
	public WebElement getBookslink() {
		return bookslink;
		
		
		
	}

	
	

}
