package pageobects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Facebookpage {

WebDriver driver;
	
	public Facebookpage(WebDriver driver )
	{
		this.driver =driver;
		
	}
		@FindBy(xpath="(//a[@class='nb__10K_d'])[1]") WebElement lon_Ele;
		
	
      public void facepageoo() throws InterruptedException
    {
    	  JavascriptExecutor ex = (JavascriptExecutor)driver;
			
			ex.executeScript("arguments[0].scrollIntoView()", lon_Ele);
			Thread.sleep(2000);
			ex.executeScript("arguments[0].click();", lon_Ele);
			Thread.sleep(4000);
    	 
    	
    	     	  
    	  
    }
}
