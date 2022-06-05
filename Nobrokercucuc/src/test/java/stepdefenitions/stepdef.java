package stepdefenitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageobects.Emi;
import pageobects.menuapp;
import utiliy.readproperties;
import utiliy.screenshots;

public class stepdef {
	readproperties prop = new readproperties();
	WebDriver Driver;

	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver", prop.getchromepath());

	}

	@When("user opens url {string}")
	public void user_opens_url(String string) throws IOException {
		Driver = new ChromeDriver();
		Driver.get("https://www.nobroker.in/");
		screenshots.getScreenshot(Driver, "user");

	}

	@Then("close the browser")
	public void close_the_browser() {
		Driver.quit();

	}

	@Then("user clicks on the menu button")
	public void user_clicks_on_the_menu_button() throws InterruptedException {

		menuapp lopi = PageFactory.initElements(Driver, menuapp.class);
		lopi.signtobrokerr();
	}

	@Then("then click on paints and back")
	public void then_click_on_paints_and_back() {
		menuapp lopi = PageFactory.initElements(Driver, menuapp.class);
		lopi.paint();

		Driver.navigate().back();

	}

	@When("Entre into website and get text")
	public void entre_into_website_and_get_text() throws InterruptedException {
		pageobects.gettext lop4 = PageFactory.initElements(Driver, pageobects.gettext.class);

		lop4.searcho();

	}

	@Then("user  go the text box")
	public void user_go_the_text_box() throws InterruptedException {
		pageobects.Accleaning lopi5 = PageFactory.initElements(Driver, pageobects.Accleaning.class);
		// Thread.sleep(2000);
		lopi5.serching("Banglore");
		Thread.sleep(2000);

	}

	@Then("Entrerd the text of the user wants")
	public void entrerd_the_text_of_the_user_wants() {
		pageobects.Accleaning lopi5 = PageFactory.initElements(Driver, pageobects.Accleaning.class);
		lopi5.enter();

	}

	@Then("user clicks on the broker button")
	public void user_clicks_on_the_broker_button() throws InterruptedException {
		pageobects.Avoidbrokers lopi9 = PageFactory.initElements(Driver, pageobects.Avoidbrokers.class);
		Thread.sleep(2000);
		lopi9.studypageo();

	}

	@Then("user clicks on the about calculator button")
	public void user_clicks_on_the_about_calculator_button() throws InterruptedException {
		pageobects.aboutaaa lopi6 = PageFactory.initElements(Driver, pageobects.aboutaaa.class);

		lopi6.bedlogin();

	}

	@When("then click on Emi calculator is visible")
	public void then_click_on_emi_calculator_is_visible() throws InterruptedException {
		Emi lopi7 = PageFactory.initElements(Driver, Emi.class);
		lopi7.assersearcho();
	}

	@Then("user clicks on the facebook page to connect  button")
	public void user_clicks_on_the_facebook_page_to_connect_button() throws InterruptedException {
		pageobects.Facebookpage lopi8 = PageFactory.initElements(Driver, pageobects.Facebookpage.class);
		lopi8.facepageoo();
	}

	@Then("user clicks on site map")
	public void user_clicks_on_site_map() throws InterruptedException {
		 pageobects.sitemap lopia= PageFactory.initElements(Driver,pageobects.sitemap.class);
		 lopia.aboutu();

	}
	@When("user clicks on privacy  maps")
	public void user_clicks_on_privacy_maps() throws InterruptedException {
		 pageobects.privacypage lopioo= PageFactory.initElements(Driver,pageobects.privacypage.class);
	      		 lopioo.moruee();

	    	}


}
