package Runner;


import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Hybrid.retalagreement;
import Hybrid.Accleaning;
import Hybrid.Emipage;
import Hybrid.Facebookpage;
import Hybrid.Loginpage;
import Hybrid.privacypage;
import Hybrid.gettext;
import Hybrid.sitemap;
import Hybrid.menuapp;
import Hybrid.Avoidbrokers;

public class loginnobroker extends Baseclass {

	@Test(priority=1)
	public void loginApp() throws InterruptedException
	
	{   
		log.info("Testcase-1 execution start");
		logger =report.createTest("login app");
		Loginpage lopin= PageFactory.initElements(driver,Loginpage.class);
		logger.info("stating Apllication");
		 lopin.LoginToCrm();
		 log.info("Successfully Login");
		   logger.pass("login page");
		   log.info("Testcase-1 is successfully executed");
    }
	
  @Test(priority=2)
   public void searchpapp() throws InterruptedException
	
	{   
	  log.info("Testcase-2 execution start");
	  logger=report.createTest("loginpage");
	  menuapp lopi= PageFactory.initElements(driver,menuapp.class);
		 lopi.signtobrokerr();
		 log.info("click on menu page");
		 logger.pass("login done");
		  log.info("Testcase-2 is successfully executed");
		             
    }
  
	@Test(priority=3)
	 public void menuappoo() throws InterruptedException
		
		{    
		log.info("Testcase-3 execution start");
		Reporter.log("menu Done", true);

		 logger=report.createTest("serachbox");

		 gettext lopi4= PageFactory.initElements(driver,gettext.class);
			 lopi4.searcho();
			 log.info("Successfully done of getting text");
			 logger.pass("searching done");
			 log.info("Testcase-3 is successfully executed");
			            
	    }
	
	@Test(priority=4)
	 public void searapp() throws InterruptedException
		
	 {   
		log.info("Testcase-4 execution start");
		Reporter.log("searching Done", true);

		logger=report.createTest("Emicalculartor");

		Accleaning lopi5= PageFactory.initElements(driver,Accleaning.class);
		logger.info("searching for bed");
			 lopi5.serching("Hyderabad,Telengana");
			 log.info("Successfully went to Emi calculator");
			 logger.pass("searching done");
			 log.info("Testcase-4 is successfully executed");
			 			         
	    }
	
	@Test(priority=6)
	 public void aboutaa() throws InterruptedException
		
	 { 	
		log.info("Testcase-5 execution start");
		Reporter.log("rentapp Done", true);
		logger=report.createTest("rentapp");
		     Emipage lopi6= PageFactory.initElements(driver,Emipage.class);
		      Thread.sleep(10000);

			 lopi6.bedlogin();
			 
			 
			 
			 log.info("Successfully went to rent");
			 logger.pass("booking done");
			 log.info("Testcase-5 is successfully executed");

	    }

    @Test(priority=7)
	 public void rentalagr() throws InterruptedException
		
		{   
    	log.info("Testcase-6 execution start");
    	Reporter.log("assertions Done", true);
    	     logger=report.createTest("rentagreement");
		     retalagreement lopi7= PageFactory.initElements(driver,retalagreement.class);
		     logger.info("comparison");
		    
		   		     
             lopi7.assersearcho();
             Thread.sleep(4000);
                        Thread.sleep(10000);

			 log.info("Successfully rental agrement ");
			 logger.pass("agrement done");
			 log.info("Testcase-6 is successfully executed");
			
	    }
    
	 @Test(priority=8)
	 public void loancart() throws InterruptedException
		
		{  
		 log.info("Testcase-7 execution start");
		 logger=report.createTest("facebookpage");
		     Facebookpage lopi8= PageFactory.initElements(driver,Facebookpage.class);
		     
		     Thread.sleep(4000);
			 lopi8.tvpageoo();
			 
			 log.info("Successfully Facebook");
			 logger.pass("searching for facebook is pass");
			 log.info("Testcase-7 is successfully executed");
			     
	    }

	@Test(priority=5)
	 public void studyapp() throws InterruptedException
		
		{ 
		 log.info("Testcase-8 execution start");
		 logger=report.createTest("Nobrokerapp");
		     Avoidbrokers lopi9= PageFactory.initElements(driver,Avoidbrokers.class);
			 lopi9.studypageo();
			 log.info("Successfully now broker app");
			 logger.pass("No broker app done");
			 log.info("Testcase-8 is successfully executed");
     
	    }
	 
	   @Test(priority=9)
	 public void siteapp() throws InterruptedException
		
		{ 
		 log.info("Testcase-9 execution start");
		 logger=report.createTest("sitepage");
		     sitemap lopia= PageFactory.initElements(driver,sitemap.class);
			 lopia.aboutu();
			 log.info("Successfully get site location ");
			 logger.pass("done with sitepage");
			 log.info("Testcase-9 is successfully executed");
  
	    }
	 
	 @Test(priority=10)
	 public void infoapp() throws InterruptedException
		
		{ 
		 log.info("Testcase-10 execution start");
		 logger=report.createTest("moreinfo");

		      privacypage lopioo= PageFactory.initElements(driver,privacypage.class);
		      logger.info("getall the text");
			 lopioo.moruee();
			 log.info("Successfully Infoapp");
			 logger.pass("done and back to eclipse");
			 log.info("Testcase-10 is successfully executed");
			 
	    }

}
