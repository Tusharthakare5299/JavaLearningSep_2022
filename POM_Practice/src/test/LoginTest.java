package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	@Test(priority=0,groups= {"Smoke","Regression"})

	public void verifyLoginPage() {
		    String verifyloginTitle = loginpage.TitleOfPageLoginPage();
		    Assert.assertEquals(verifyloginTitle,"Login");
		
	}
	@Test(priority=2,groups= {"Sanity","regression"})
     public void VerifyUrlOfLoginpage() {
    	 String verifyurl= loginpage.VerifyUrlOfLoginpage();
    	 Assert.assertEquals(verifyurl,"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
