package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageBase {

	protected WebDriver driver;
	//Create constructor
	
	public PageBase(WebDriver driver)
		{
		
		  PageFactory.initElements(DriverContext.driver, this);
		
		
		}
	
	
			 
}
