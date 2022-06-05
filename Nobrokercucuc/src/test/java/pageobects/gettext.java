package pageobects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class gettext {

WebDriver driver;
	
	public gettext(WebDriver driver )
	{
		this.driver =driver;
	}
	@FindBy(xpath= "//div[@class='nb__37fWx']")WebElement menu;


	public void searcho( ) throws InterruptedException
	{
		
	
		 		
		 driver.getTitle();
		 String s=menu.getText();
		 System.out.print("This is a text the text");
		 System.out.println(s);
		 
		 Thread.sleep(1000);
		
	}
}
