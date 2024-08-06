package org.tactics.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public WebDriver driver;


	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[contains(text(),'core black/footwear white/gum5')]//parent::a")
	private WebElement firstProduct;
	


	public WebElement getFirstProduct() {
		return firstProduct;
	}

}
