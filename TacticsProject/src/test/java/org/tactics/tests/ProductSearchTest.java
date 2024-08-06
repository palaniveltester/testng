package org.tactics.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.tactics.page.LandingPage;
import org.tactics.page.ProductPage;
import org.tactics.page.SearchPage;
import org.testng.annotations.Test;

public class ProductSearchTest extends BaseClass {
	
	@Test
	public void searchProduct() {
		
		LandingPage landingPage = new LandingPage(driver);
		landingPage.getSearchField().sendKeys("Adidas Shoe",Keys.ENTER);
		SearchPage searchpage = new SearchPage(driver);
		searchpage.getFirstProduct().click();
		ProductPage productPage = new ProductPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", productPage.getShoeSize());
		productPage.getShoeSize().click();
		productPage.getAddToCart().click();
		
	}

}
