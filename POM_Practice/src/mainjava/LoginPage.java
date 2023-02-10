package mainjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test.BaseTest;

    public class LoginPage extends BaseTest {

//  All The Locators Of Page
	@FindBy(xpath = "//h5[text()='Login']")
	WebElement txtOfloginpage;

//	Imitillization Of variables/Locators
    public LoginPage(WebDriver driver) {
	this.driver=driver;
    PageFactory.initElements(driver, this);
}

//	methods require to perform test step
//   Author : Tushar Thakare
//	 Date   : 4 Feb 2023
//	Description : This Test Method Is used to verify login page Title
//	 parameter return : String 
   	public String TitleOfPageLoginPage() {
		return txtOfloginpage.getText();
	}

   	//	methods require to perform test step
//  Author : Tushar Thakare
//	 Date   : 4 Feb 2023
//	Description : This Test Method Is used to verify Url of login page
//	 parameter return : String 
   	public String VerifyUrlOfLoginpage() {
   		return driver.getCurrentUrl();
   	}

   	}

