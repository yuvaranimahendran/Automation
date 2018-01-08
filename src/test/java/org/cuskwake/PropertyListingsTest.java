package org.cuskwake;

import java.util.HashMap;
import java.util.List;

import org.cushwake.pages.AboutUsPages;
import org.cushwake.pages.PropertyListingsPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.utility.Base;

public class PropertyListingsTest extends Base {

	static WebDriver driver;
	PropertyListingsPages propertyListings = null;
	
	 @org.testng.annotations.BeforeClass
	 public static void lauchBrowser() {
	 driver = getDriver();
	
	 }

	@org.testng.annotations.Test
	public void aboutUsCushWake() {
		propertyListings = new PropertyListingsPages();
		btnClick(propertyListings.getLnkPropertListingsIcon());
		btnClick(propertyListings.getLnkSearchPropertiesAmericas());
		btnClick(propertyListings.getLnkInvestmentSalesNY());
		switchParentWindows();
		btnClick(propertyListings.getBtnSearchListingsAllNeighborhoods());
		btnClick(propertyListings.getBtnSearchListingsPtCb());
		btnClick(propertyListings.getBtnSearchListingsPtSu());
		btnClick(propertyListings.getBtnSearchListingsPrAllPrices());
		btnClick(propertyListings.getBtnSearchListingsSearchNow());

	}

	 @org.testng.annotations.AfterClass
	 public static void closeFBApp() {
	 driver.quit();
	
	 }

}
