package org.cuskwake;

import java.util.HashMap;
import java.util.List;

import org.cushwake.pages.OfficeLocationsPages;
import org.cushwake.pages.PeopleFinderPages;
import org.openqa.selenium.WebDriver;
import org.utility.Base;

public class OfficeLocationsTest extends Base {

	static WebDriver driver;
	OfficeLocationsPages officeLocations = null;

	@org.testng.annotations.BeforeClass
	public static void lauchBrowser() {
		driver = getDriver();

	}

	@org.testng.annotations.Test
	public void peopleFinderCushWake() throws InterruptedException {
		List<HashMap<String, String>> readValue = readValueFromExcelSheet();
		officeLocations = new OfficeLocationsPages();
		btnClick(officeLocations.getLnkOfficeLocationIcon());
		setText(officeLocations.getTxTCity(), "New York");
		btnClick(officeLocations.getBtnGo());

	}

	@org.testng.annotations.AfterClass
	public static void closeFBApp() {
		driver.quit();

	}
}