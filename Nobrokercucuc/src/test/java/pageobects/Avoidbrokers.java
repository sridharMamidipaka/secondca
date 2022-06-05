package pageobects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Avoidbrokers {

	WebDriver driver;

	public Avoidbrokers(WebDriver driver )
	{
		this.driver =driver;
		
	}
	@FindBy(xpath="//a[@href='/about/tenants']") WebElement Brokers;
	@FindBy(xpath="//div[@class='w-3/4 py-1p px-2p']") WebElement content;
		public void studypageo() throws InterruptedException
	 {
		
		 
			JavascriptExecutor ex = (JavascriptExecutor)driver;
			
			ex.executeScript("arguments[0].scrollIntoView()", Brokers);
			Thread.sleep(2000);
			ex.executeScript("arguments[0].click();", Brokers);
			Thread.sleep(2000);
			System.out.println(content.getText());

			
			
			
			 
		 


	 }
}
