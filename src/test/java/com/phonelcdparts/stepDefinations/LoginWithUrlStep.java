package com.phonelcdparts.stepDefinations;

import com.phonelcdparts.Base.BaseStep;
import com.phonelcdparts.LoginPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginWithUrlStep extends BaseStep {
	LoginPage lp;

	@Given("user open {string} and {string}")
	public void userOpenAnd(String browser, String url) {
		OpenApp(browser, url);
	}
	@Given("user click my account")
	public void userClickMyAccount() {
		lp = new LoginPage(driver);
		lp.myAcountMethod();
	}
	@Given("user click login button")
	public void userClickLoginButton() {
		lp.loginButtonMethod();
	}
	@When("user enter username {string}")
	public void userEnterUsername(String enterusername) {
		lp.userNameMethod(enterusername);
	}
	@When("user enter password {string}")
	public void userEnterPassword(String enterpassword) {
		lp.passwordMethod(enterpassword);
	}
	@When("user click on sing in button")
	public void userClickOnSingInButton() {
		//lp.singInMethod();
	}
	@Then("user logged in phonelcdparts")
	public void userLoggedInPhonelcdparts() {
		closeApp();
	}



	
	




}
