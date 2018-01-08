package org.cuskwake;

import java.util.HashMap;
import java.util.List;

import org.cushwake.pages.ServicesPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.utility.Base;

public class ServicesTest extends Base {
	static WebDriver driver;
	ServicesPages service = null;

	@BeforeClass
	public static void lauchBrowser() {
	driver = getDriver();

	}

	@Test
	public void serviceCushWake() throws InterruptedException {
		//List<HashMap<String, String>> readValue = readValueFromExcelSheet();
		service = new ServicesPages();

		btnClick(service.getLnkServices());
		getScreenShot("1");

		btnClick(service.getLnkServices());
		getScreenShot("1");
		pause();
        jsScrollDown(driver.findElement(By.xpath("//*[@id='form1']/div[3]/div/div[1]/div/div[2]/h1")));
		getScreenShot("2");
		btnClick(service.getAccCapitalMarkets());
		getScreenShot("3");
		btnClick(service.getAccConsulting());
		getScreenShot("4");
		btnClick(service.getAccGlobalAccoupier());
		getScreenShot("5");
		btnClick(service.getAccLeasing());
		getScreenShot("6");
		btnClick(service.getAccVandA());
		getScreenShot("7");
		jsScrollUp(service.getAccAcquireProperty());
		btnClick(service.getAccAcquireProperty());
		getScreenShot("8");

	}

	@org.testng.annotations.AfterClass
	public static void closeFBApp() {
		driver.quit();

	}
}
