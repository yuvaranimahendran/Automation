package org.cushwake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class SectorsPages extends Base {

	public SectorsPages() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[text()='Sectors'])[2]")
	private WebElement lnkSectors;

	public WebElement getLnkSectors() {
		return lnkSectors;
	}

	public void setLnkSectors(WebElement lnkSectors) {
		this.lnkSectors = lnkSectors;
	}

	public WebElement getLnkBFS() {
		return lnkBFS;
	}

	public void setLnkBFS(WebElement lnkBFS) {
		this.lnkBFS = lnkBFS;
	}

	public WebElement getLnkHospitality() {
		return lnkHospitality;
	}

	public void setLnkHospitality(WebElement lnkHospitality) {
		this.lnkHospitality = lnkHospitality;
	}

	public WebElement getLnkViewFullStory() {
		return lnkViewFullStory;
	}

	public void setLnkViewFullStory(WebElement lnkViewFullStory) {
		this.lnkViewFullStory = lnkViewFullStory;
	}

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[3]/div/ul/li[1]/a")
	private WebElement lnkBFS;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[3]/div/ul/li[7]/a")
	private WebElement lnkHospitality;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[1]/div/div/div[2]/div/p/a")
	private WebElement lnkViewFullStory;

}
