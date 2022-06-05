package pageobects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class aboutaaa {

	WebDriver driver;
	public aboutaaa(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath="//div[@class='nb__3N2G9 nb__2WC_s']")
	WebElement Ac;
	
	
	public void bedlogin() throws InterruptedException
	{
		
		 JavascriptExecutor ex = (JavascriptExecutor)driver;

		ex.executeScript("arguments[0].scrollIntoView()", Ac);
		Thread.sleep(2000);
		ex.executeScript("arguments[0].click();",Ac);
		Thread.sleep(3000);
		


						
		
				
		
		
			}
}
