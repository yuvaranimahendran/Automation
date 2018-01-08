package org.cushwake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class AboutUsPages extends Base {
	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_24C22E3E68BE4C75B56B04A014C4ACA4']")
	private WebElement txtOfficePhone;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_1B7A2FDD5AC045EA91FDBF1C7F9706A1']")
	private WebElement txtMobilePhone;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_256905A4D8D645588C66EE3754385311']")
	private WebElement txtYourTitle;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_E2156714C6AB4F13BB20D62C4D67FE18']")
	private WebElement dDnReasonForContact;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_78642DED8A63448A9A91B94A48588F13']")
	private WebElement dDnContactPreference;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_7D1EC894470145B8A1F781E836EFE4B3']")
	private WebElement txtComments;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_form_894E3593E2D7481AB0EFC3712850C630_submit']")
	private WebElement btnSubmit;

	@FindBy(xpath = "(//*[text()='About Us'])[2]")
	private WebElement lnkAboutUs;

	@FindBy(xpath = "//img[@alt='Global Leadership']")
	private WebElement lnkGleadership;

	@FindBy(xpath = "//*[@id='content-wrapper']/section[2]/div/strong/a[1]/img")
	WebElement lnkAboutusGLship;

	@FindBy(xpath = "//*[@alt='Centennial Button']")
	private WebElement lnkCentennial;

	@FindBy(xpath = "//*[@alt='Company History']")
	private WebElement lnkComHistory;

	@FindBy(xpath = "//*[@id='content-wrapper']/section[2]/div/p[1]/strong/a[4]/img")
	private WebElement lnkContactUs;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_2F31227276184A86B1A61F79E83CB77A']")
	private WebElement txtFirstName;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_6DCAC7E3B7934DCA8DF5153FE3647FC1']")
	private WebElement txtLastName;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_7FCD4613BB834FE7AF3C0EE601AEE45F']")
	private WebElement txtEmailAdress;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_67C7FF621E02429C889223E207E10E9D']")
	private WebElement txtConfEmail;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_6879DA6F1B4E44F7B32FF06E70D7747D']")
	private WebElement dDnCountry;

	@FindBy(xpath = "//*[@id='form_894E3593E2D7481AB0EFC3712850C630_field_251B00F2029F47AA8E0E41EACB4367EB']")
	private WebElement txtZipcode;

	@FindBy(xpath = "//*[text()='Visit our Global Website']")
	private WebElement btnVisitGWebsite;

	public WebElement getFirstName() {
		return txtFirstName;
	}

	public WebElement getEmailAdress() {
		return txtEmailAdress;
	}

	public WebElement getCountry() {
		return dDnCountry;
	}

	public WebElement getLastName() {
		return txtLastName;
	}

	public WebElement getZipcode() {
		return txtZipcode;
	}

	public WebElement getOfficePhone() {
		return txtOfficePhone;
	}

	public WebElement getMObilePhone() {
		return txtMobilePhone;
	}

	public WebElement getYourTitle() {
		return txtYourTitle;
	}

	public WebElement getReasonForContact() {
		return dDnReasonForContact;
	}

	public WebElement getContactPreference() {
		return dDnContactPreference;
	}

	public WebElement getComments() {
		return txtComments;
	}

	public WebElement getSubmit() {
		return btnSubmit;
	}

	public WebElement getLnkContactUs() {
		return lnkContactUs;
	}

	public WebElement getTxtConfEmail() {
		return txtConfEmail;
	}

	public WebElement getLnkComHistory() {
		return lnkComHistory;
	}

	public AboutUsPages() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLnkAboutUs() {
		return lnkAboutUs;
	}

	public WebElement getLnkGleadership() {
		return lnkGleadership;
	}

	public WebElement getLnkAboutusGLship() {
		return lnkAboutusGLship;
	}

	public WebElement getLnkCentennial() {
		return lnkCentennial;
	}

	public WebElement getBtnVisitGWebsite() {
		return btnVisitGWebsite;
	}

}
