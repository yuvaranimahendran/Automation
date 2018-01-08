package org.cuskwake;

import java.util.HashMap;
import java.util.List;
import org.cushwake.pages.CaseStudiesPages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utility.Base;

public class CaseStudiesTest extends Base {

	static WebDriver driver;
	CaseStudiesPages caseStudies = null;

	@BeforeClass
	public static void lauchBrowser() {
		driver = getDriver();
	}

	@Test
	public void caseStudiesCushWake() throws InterruptedException {
		List<HashMap<String, String>> readValue = readValueFromExcelSheet();
		System.out.println(readValue);
		caseStudies = new CaseStudiesPages();
		btnClick(caseStudies.getLnkCaseStudies());
		btnClick(caseStudies.getLnkFeaturedReports());
		WebElement txt = caseStudies.getLnkAreWeOverbuilding();

		btnClick(caseStudies.getLnkAreWeOverbuilding());

		 WebElement w = caseStudies.getTxtFirstName();
		 WebElement myDynamicElement =
		 (new WebDriverWait(driver,
		 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("usrUTils")));
		 w.sendKeys("Test");
		setText(caseStudies.getTxtFirstName(), readValue.get(1).get("C_First_Name"));
		setText(caseStudies.getTxtLastName(), readValue.get(1).get("C_Last_Name"));
		setText(caseStudies.getTxtEmail(), readValue.get(1).get("C_Email"));
		setText(caseStudies.getTxtCompany(), readValue.get(1).get("C_Company"));
		setText(caseStudies.getTxtCity(), readValue.get(1).get("C_City"));
		btnClick(caseStudies.getBtnSubmit());
	}

	@AfterClass
	public static void closeFBApp() {

	}
}
