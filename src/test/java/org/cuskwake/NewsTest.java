package org.cuskwake;

import java.util.HashMap;
import java.util.List;
import org.cushwake.pages.NewsPages;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.utility.Base;

public class NewsTest extends Base {
	
	static WebDriver driver;
	NewsPages news = null;

	@BeforeClass
	public static void lauchBrowser() {
		driver = getDriver();

	}

	@Test
	public void newsCushWake() throws InterruptedException {
		List<HashMap<String, String>> readValue = readValueFromExcelSheet();
		news = new NewsPages();
		btnClick(news.getLnkNewsHeader());
		btnClick(news.getLnkSeeAll());
}
	
	@AfterClass
	public static void closeFBApp() {
		driver.quit();

	}

}
