package org.cuskwake;

import java.util.HashMap;
import java.util.List;

import org.cushwake.pages.SectorsPages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utility.Base;

public class SectorsTest extends Base {

	static WebDriver driver;
	SectorsPages sectors = null;

	@BeforeClass
	public static void lauchBrowser() {
		driver = getDriver();
	}

	@Test
	public void sectorsCushWake() throws InterruptedException {

		sectors = new SectorsPages();

		btnClick(sectors.getLnkSectors());
		getScreenShot("Sec1");

		btnClick(sectors.getLnkBFS());
		getScreenShot("Sec2");

		btnClick(sectors.getLnkHospitality());
		getScreenShot("Sec4");

	}

	@AfterClass
	public static void closeFBApp() {
		driver.quit();

	}

}