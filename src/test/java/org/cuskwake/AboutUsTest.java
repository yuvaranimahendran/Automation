package org.cuskwake;

import static org.junit.Assert.assertEquals;

import java.util.HashMap;
import java.util.List;

import org.cushwake.pages.AboutUsPages;
import org.openqa.selenium.WebDriver;
import org.utility.Base;

public class AboutUsTest extends Base {
	static WebDriver driver;
	AboutUsPages aboutUs = null;

	@org.testng.annotations.BeforeClass
	public static void lauchBrowser() {
		driver = getDriver();

	}

	@org.testng.annotations.Test
	public void aboutUsCushWake() {
		List<HashMap<String, String>> readValue = readValueFromExcelSheet();
		aboutUs = new AboutUsPages();
		btnClick(aboutUs.getLnkAboutUs());
		btnClick(aboutUs.getLnkGleadership());
		btnClick(aboutUs.getLnkAboutusGLship());
		btnClick(aboutUs.getLnkCentennial());
		switchParentWindows();
		jsScrollDown(aboutUs.getBtnVisitGWebsite());
		btnClick(aboutUs.getBtnVisitGWebsite());
		switchParentWindows2nd();
		btnClick(aboutUs.getLnkAboutUs());
		
		pause();
		btnClick(aboutUs.getLnkComHistory());
		btnClick(aboutUs.getLnkContactUs());
		setText(aboutUs.getFirstName(), readValue.get(1).get("First_Name"));
		assertEquals(readValue.get(1).get("First_Name"), getAttribute(aboutUs.getFirstName()));
		setText(aboutUs.getLastName(), readValue.get(1).get("Last_Name"));
		assertEquals(readValue.get(1).get("Last_Name"), getAttribute(aboutUs.getLastName()));
		setText(aboutUs.getEmailAdress(), readValue.get(1).get("Email_Address"));
		assertEquals(readValue.get(1).get("Email_Address"), getAttribute(aboutUs.getEmailAdress()));
		setText(aboutUs.getTxtConfEmail(), readValue.get(1).get("Confirm_Email_Address"));
		assertEquals(readValue.get(1).get("Confirm_Email_Address"), getAttribute(aboutUs.getTxtConfEmail()));
		// selectByVisibleText(aboutUs.getCountry(),
		// readValue.get(1).get("Country"));
		setText(aboutUs.getZipcode(), readValue.get(1).get("Zip_Postal_Code"));
		setText(aboutUs.getOfficePhone(), readValue.get(1).get("Office_Phone"));
		setText(aboutUs.getMObilePhone(), readValue.get(1).get("Mobile_Phone"));
		setText(aboutUs.getYourTitle(), readValue.get(1).get("Your_Title"));
		selectByVisibleText(aboutUs.getReasonForContact(), readValue.get(1).get("Reason_for_Contact"));
		selectByVisibleText(aboutUs.getContactPreference(), readValue.get(1).get("Contact_Preference"));
		setText(aboutUs.getComments(), readValue.get(1).get("Comments"));
		getScreenShot("Contactus");
		btnClick(aboutUs.getSubmit());

	}

	 @org.testng.annotations.AfterClass
	public static void closeFBApp() {
	 driver.quit();

	 }
	 }



