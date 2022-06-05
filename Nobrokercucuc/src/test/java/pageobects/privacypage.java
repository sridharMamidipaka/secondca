package pageobects;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class privacypage {

	WebDriver driver;
	public privacypage(WebDriver driver )
	{
		this.driver =driver;
	}
	
	@FindBy(xpath="//a[@href='/privacy\']") WebElement Privacy;
	@FindBy(xpath="(//div[@class='nb__1GRNJ'])[1]") WebElement text;


	public void moruee() throws InterruptedException
	{
JavascriptExecutor ex = (JavascriptExecutor)driver;
		
		ex.executeScript("arguments[0].scrollIntoView()", Privacy);
		Thread.sleep(2000);
		ex.executeScript("arguments[0].click();", Privacy);
		Thread.sleep(3000);

		
		
		
		
		
	}
}
