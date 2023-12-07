package com.phonelcdparts.stepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
	WebDriver driver;
	
	
	@Given("I open phonelcdparts application")
	public void iOpenPhonelcdpartsApplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.phonelcdparts.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
	@Given("I I click my account")
	public void iIClickMyAccount() {
		driver.findElement(By.className("user-act")).click();	
	}
	@Given("I click login button")
	public void iClickLoginButton() {
		driver.findElement(By.className("login")).click();	
	}
	@When("I enter my valid user name")
	public void iEnterMyValidUserName() {
		driver.findElement(By.id("email")).sendKeys("nsworld080@gmail.com");
	}
	@When("I enter my valid password")
	public void iEnterMyValidPassword() {
		driver.findElement(By.id("pass")).sendKeys("Ns123456789");
	}
	@When("I click sing in button")
	public void iClickSingInButton() {
		driver.findElement(By.name("send")).submit();
	}
	@Then("I can loged in")
	public void iCanLogedIn() {
		
	}

}
