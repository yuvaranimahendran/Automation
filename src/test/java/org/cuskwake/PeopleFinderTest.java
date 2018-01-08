package org.cuskwake;

import java.util.HashMap;
import java.util.List;

import org.cushwake.pages.AboutUsPages;

import org.cushwake.pages.PeopleFinderPages;
import org.openqa.selenium.WebDriver;
import org.utility.Base;

public class PeopleFinderTest extends Base {
	
	static WebDriver driver;
	PeopleFinderPages peopleFinder = null;

	@org.testng.annotations.BeforeClass
	public static void lauchBrowser() {
		driver = getDriver();


}
	@org.testng.annotations.Test
	public void peopleFinderCushWake() throws InterruptedException {
		List<HashMap<String, String>> readValue = readValueFromExcelSheet();
		peopleFinder = new PeopleFinderPages();
		btnClick(peopleFinder.getLnkPeopleFinderIcon());
		setText(peopleFinder.getTxtEmployeeName(), "Mike");
		setText(peopleFinder.getDnDLocation(), "Georgia - US");
		btnClick(peopleFinder.getBtnSearchPeople());
		btnClick(peopleFinder.getBtnViewProfile());	
	}	
	
	@org.testng.annotations.AfterClass
	public static void closeFBApp() {
		driver.quit();

	}
	
}
