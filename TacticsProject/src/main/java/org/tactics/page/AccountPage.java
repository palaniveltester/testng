package org.tactics.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	public WebDriver driver;

	public AccountPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	@FindBy(id="login-email-input")
	private WebElement username;

	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement login;


	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
