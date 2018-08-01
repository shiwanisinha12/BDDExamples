package com.cg;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	WebDriver driver=null;
	
	
	@Before
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\shiwansi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new  ChromeDriver();
		driver.get("D:\\BDD\\TestLogin\\src\\main\\webapp\\login.html");
	}

	
	@Given("^I enter the username as (.*)$")
	public void sendUsername(String arg)throws Throwable
	{
		driver.findElement(By.id("txt1")).sendKeys(arg);
	}
	
	@And("^I enter the password as (.*)$")
	public void sendPassword(String arg)throws Throwable
	{
		driver.findElement(By.id("txt2")).sendKeys(arg);
	}
	
	@When("^I click on sign in$")
	public void clickButton()throws Throwable
	{
		driver.findElement(By.id("btn")).click();
	}
	
	@Then("^I get a message as wrong username$")
	public void getMessage1()throws Throwable
	{
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		assertEquals("Please enter correct username", alert.getText());
	}
	
	@Then("^I get a message as wrong password$")
	public void getMessage2()throws Throwable
	{
		Alert alert=driver.switchTo().alert();
		System.out.println(alert.getText());
		assertEquals("Please enter correct password", alert.getText());
	}
	
	@Then("I get the success page$")
	public void getSuccessPage()throws Throwable
	{
		System.out.println("login successful");
	}
}
