package org.cushwake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class CaseStudiesPages extends Base {
	public CaseStudiesPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Case Study'])[2]")
	private WebElement lnkCaseStudies;

	public WebElement getLnkCaseStudies() {
		return lnkCaseStudies;
	}

	public void setLnkCaseStudies(WebElement lnkCaseStudies) {
		this.lnkCaseStudies = lnkCaseStudies;
	}

	public WebElement getLnkFeaturedReports() {
		return lnkFeaturedReports;
	}

	public void setLnkFeaturedReports(WebElement lnkFeaturedReports) {
		this.lnkFeaturedReports = lnkFeaturedReports;
	}

	public WebElement getLnkAreWeOverbuilding() {
		return lnkAreWeOverbuilding;
	}

	public void setLnkAreWeOverbuilding(WebElement lnkAreWeOverbuilding) {
		this.lnkAreWeOverbuilding = lnkAreWeOverbuilding;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public void setTxtFirstName(WebElement txtFirstName) {
		this.txtFirstName = txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public void setTxtLastName(WebElement txtLastName) {
		this.txtLastName = txtLastName;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(WebElement txtEmail) {
		this.txtEmail = txtEmail;
	}

	public WebElement getTxtCompany() {
		return txtCompany;
	}

	public void setTxtCompany(WebElement txtCompany) {
		this.txtCompany = txtCompany;
	}

	public WebElement getTxtCity() {
		return txtCity;
	}

	public void setTxtCity(WebElement txtCity) {
		this.txtCity = txtCity;
	}

	public WebElement getBtnSubmit() {
		return btnSubmit;
	}

	public void setBtnSubmit(WebElement btnSubmit) {
		this.btnSubmit = btnSubmit;
	}

	@FindBy(xpath = "//*[@id='form1']/footer/div[2]/div[3]/nav/ul[1]/li[1]/a")
	private WebElement lnkFeaturedReports;

	@FindBy(xpath = "//*[@id='featured_1_rptFeatured_hlImage_0']/div[2]/div")
	private WebElement lnkAreWeOverbuilding;

	@CacheLookup
	@FindBy(xpath = "//label[text()='First Name']/following-sibling::input")
	private WebElement txtFirstName;

	@FindBy(xpath = "//*[@id='263412_26813pi_263412_26813']")
	private WebElement txtLastName;

	@FindBy(xpath = "//*[@id='263412_26817pi_263412_26817']")
	private WebElement txtEmail;

	@FindBy(xpath = "//*[@id='263412_26815pi_263412_26815']")
	private WebElement txtCompany;

	@FindBy(xpath = "//*[@id='263412_26855pi_263412_26855']")
	private WebElement txtCity;

	@FindBy(xpath = "//*[@id='pardot-form']/p[10]/input")
	private WebElement btnSubmit;

}
