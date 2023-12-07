package com.phonelcdparts.stepDefinations;

import com.phonelcdparts.Base.BaseStep;
import com.phonelcdparts.RegistrationPages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep extends BaseStep {
	RegistrationPage RP;

	@Given("user open browser {string} and give url {string} to open application")
	public void userOpenBrowserAndGiveUrlToOpenApplication(String browser, String url) {
		OpenApp(browser, url);
	}

	@Given("user click <myaccount button> and <carteaccount button> to put valid information")
	public void userClickMyaccountButtonAndCarteaccountButtonToPutValidInformation() {
		RP = new RegistrationPage(driver);
		RP.myAcountMethod();
		RP.crateAccountOneMethod();
	}

	@When("user enter {string} in firstnamefield")
	public void userEnterInFirstnamefield(String enterfirstname) {
		RP.firstNameMethod(enterfirstname);
	}

	@When("user enter {string} in lastnamefield")
	public void userEnterInLastnamefield(String enterlastname) {
		RP.lastNameMethod(enterlastname);
	}

	@When("user enter {string} in emailfield")
	public void userEnterInEmailfield(String enteremail) {
		RP.emailMethod(enteremail);
	}

	@When("user enter {string} in passwordfield")
	public void userEnterInPasswordfield(String enterpassword) {
		RP.passwordMethod(enterpassword);
	}

	@When("user enter {string} in confirmpasswordfield")
	public void userEnterInConfirmpasswordfield(String enterconfirmpassword) {
		// RP.confirmpasswordMethod(enterconfirmpassword);
	}

	@When("user click the create account button")
	public void userClickTheCreateAccountButton() {
		RP.crateaccountMethod();
	}

	@Then("user close the application")
	public void userCloseTheApplication() {
		closeApp();
	}







}

