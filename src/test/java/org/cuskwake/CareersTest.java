package org.cuskwake;

import java.util.HashMap;
import java.util.List;
import org.cushwake.pages.AboutUsPages;
import org.cushwake.pages.CareersPages;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utility.Base;

public class CareersTest extends Base {

	static WebDriver driver;
	CareersPages careers = null;

	@BeforeClass
	public static void lauchBrowser() {
		driver = getDriver();
	}

	@Test
	public void aboutUsCushWake() throws InterruptedException {
		careers = new CareersPages();
		btnClick(careers.getLnkCareers());
		btnClick(careers.getLnkDiversityInclusion());
		btnClick(careers.getLnkSubDiversityInclusion());
		btnClick(careers.getLnkOurPhilosophy());
		btnClick(careers.getLnkOurPeople());
		btnClick(careers.getLnkPartnerships());
		btnClick(careers.getLnkYourCareerAtCW());
		btnClick(careers.getLnkSubYourCareerAtCW());
	}

	@AfterClass
	public static void closeFBApp() {
		//driver.quit();

	}

}