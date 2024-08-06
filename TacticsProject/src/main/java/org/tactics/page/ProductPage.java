package org.tactics.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	WebDriver driver;

	public ProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);

	}
	
	@FindBy(xpath = "//*[text()='9']") 
	private WebElement shoeSize;
	
	@FindBy(id = "product-head-add-to-cart-button")
	private WebElement addToCart;

	
	public WebElement getShoeSize() {
		return shoeSize;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}
	
	

}
