package org.cushwake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class CareersPages extends Base {

	public CareersPages() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLnkCareers() {
		return lnkCareers;
	}

	public void setLnkCareers(WebElement lnkCareers) {
		this.lnkCareers = lnkCareers;
	}

	public WebElement getLnkDiversityInclusion() {
		return lnkDiversityInclusion;
	}

	public void setLnkDiversityInclusion(WebElement lnkDiversityInclusion) {
		this.lnkDiversityInclusion = lnkDiversityInclusion;
	}

	public WebElement getLnkSubDiversityInclusion() {
		return lnkSubDiversityInclusion;
	}

	public void setLnkSubDiversityInclusion(WebElement lnkSubDiversityInclusion) {
		this.lnkSubDiversityInclusion = lnkSubDiversityInclusion;
	}

	public WebElement getLnkOurPhilosophy() {
		return lnkOurPhilosophy;
	}

	public void setLnkOurPhilosophy(WebElement lnkOurPhilosophy) {
		this.lnkOurPhilosophy = lnkOurPhilosophy;
	}

	public WebElement getLnkOurPeople() {
		return lnkOurPeople;
	}

	public void setLnkOurPeople(WebElement lnkOurPeople) {
		this.lnkOurPeople = lnkOurPeople;
	}

	public WebElement getLnkPartnerships() {
		return lnkPartnerships;
	}

	public void setLnkPartnerships(WebElement lnkPartnerships) {
		this.lnkPartnerships = lnkPartnerships;
	}

	public WebElement getLnkYourCareerAtCW() {
		return lnkYourCareerAtCW;
	}

	public void setLnkYourCareerAtCW(WebElement lnkYourCareerAtCW) {
		this.lnkYourCareerAtCW = lnkYourCareerAtCW;
	}

	public WebElement getLnkSubYourCareerAtCW() {
		return lnkSubYourCareerAtCW;
	}

	public void setLnkSubYourCareerAtCW(WebElement lnkSubYourCareerAtCW) {
		this.lnkSubYourCareerAtCW = lnkSubYourCareerAtCW;
	}

	@FindBy(xpath = "//*[@id='header-wrapper']/header/div[1]/div/div[2]/div[2]/nav/ul/li[7]/a")
	private WebElement lnkCareers;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[3]/div[2]/div/h2/i")
	private WebElement lnkDiversityInclusion;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[3]/div[2]/ul/li[1]/a")
	private WebElement lnkSubDiversityInclusion;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[3]/div[2]/ul/li[2]/a")
	private WebElement lnkOurPhilosophy;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[3]/div[2]/ul/li[3]/a")
	private WebElement lnkOurPeople;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[3]/div[2]/ul/li[4]/a")
	private WebElement lnkPartnerships;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[3]/div[2]/div/h2/i")
	private WebElement lnkYourCareerAtCW;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[3]/div[2]/ul/li[1]/a")
	private WebElement lnkSubYourCareerAtCW;

	/*
	 * @FindBy(xpath = "//*[@id='form1']/div[3]/div/div[2]/div[2]/div/a")
	 * private WebElement lnkSearchListings;
	 */

}
