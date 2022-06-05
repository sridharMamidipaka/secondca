package pageobects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class sitemap {
	WebDriver driver;
	public sitemap(WebDriver driver )
	{
		this.driver =driver;
	}

	@FindBy(xpath="//a[@href='/sitemap']") WebElement sitemap;
	public void aboutu() throws InterruptedException
	{
		System.out.println("this is site location ");
		 System.out.println(sitemap.getLocation());
		 Thread.sleep(1000);
		 
		 
		
	}
}
