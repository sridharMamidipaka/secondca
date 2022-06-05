package Hybrid;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Accleaning {
	WebDriver driver;
	public Accleaning(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//input[@id='listPageSearchLocality']") WebElement Sale_search;
	@FindBy(xpath="//button[@class='prop-search-button btn btn-primary btn-lg']") WebElement Sel_room; 
	//@FindBy(xpath="//img[@alt='Pune']") WebElement Sel_areass; 

	
	
	public void serching(String city) throws InterruptedException 
	{
		
		Sale_search.sendKeys(city);


		Sel_room.click();
	    Helperclass.captureScreenshots(driver);
			
		
				}
}
