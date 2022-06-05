package pageobects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Emi {
	WebDriver driver;

	public Emi(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//a[contains(text(),'EMI Calculator')]") WebElement Emi;
	

	
	 public void assersearcho() throws InterruptedException
	 
 {
		 JavascriptExecutor ex = (JavascriptExecutor)driver;
			
			ex.executeScript("arguments[0].scrollIntoView()", Emi);
			
			Thread.sleep(2000);
			ex.executeScript("arguments[0].click();", Emi);
			Thread.sleep(2000);

			
			
			
			


	 

	 
	 }
}
