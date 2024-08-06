package org.tactics.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.tactics.page.AccountPage;
import org.tactics.page.LandingPage;
import org.tactics.page.ProductPage;
import org.tactics.page.SearchPage;
import org.testng.annotations.Test;

public class ProductSearchTest extends BaseClass {
	LandingPage landingPage;
	@Test
	public void searchProduct() {

		landingPage = new LandingPage(driver);
		landingPage.getSearchField().sendKeys("Adidas Shoe",Keys.ENTER);
		SearchPage searchpage = new SearchPage(driver);
		searchpage.getFirstProduct().click();
		ProductPage productPage = new ProductPage(driver);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();", productPage.getShoeSize());
		productPage.getShoeSize().click();
		productPage.getAddToCart().click();

	}

	@Test
	public void loginAccount() {


		landingPage =new LandingPage(driver);
		landingPage.getAccountField().click();
		AccountPage accountPage =new AccountPage(driver);
		accountPage.getUsername().sendKeys("kpalanivel605@gmail.com");
		accountPage.getPassword().sendKeys("palani@123");
		accountPage.getLogin().click();


	}



}
