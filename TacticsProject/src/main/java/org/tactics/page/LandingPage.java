package org.tactics.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {

	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="header-desktop-search-input")
	private WebElement searchField;
	
	@FindBy(xpath="//a[text()='Account']")
	private WebElement accountField;
	
	
	public WebElement getAccountField() {
		return accountField;
	}


	public WebElement getSearchField() {
		return searchField;
	}
	
	
	
	
	
	
	
}
