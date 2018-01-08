package org.cushwake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class PeopleFinderPages extends Base {
	
	public PeopleFinderPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//*[text()='People Finder'])[1]")
	private WebElement lnkPeopleFinderIcon;
	
	public WebElement getLnkPeopleFinderIcon() {
		return lnkPeopleFinderIcon;
	}

	public void setLnkPeopleFinderIcon(WebElement lnkPeopleFinderIcon) {
		this.lnkPeopleFinderIcon = lnkPeopleFinderIcon;
	}

	public WebElement getTxtEmployeeName() {
		return txtEmployeeName;
	}

	public void setTxtEmployeeName(WebElement txtEmployeeName) {
		this.txtEmployeeName = txtEmployeeName;
	}

	public WebElement getDnDLocation() {
		return dnDLocation;
	}

	public void setDnDLocation(WebElement dnDLocation) {
		this.dnDLocation = dnDLocation;
	}

	public WebElement getBtnSearchPeople() {
		return btnSearchPeople;
	}

	public void setBtnSearchPeople(WebElement btnSearchPeople) {
		this.btnSearchPeople = btnSearchPeople;
	}

	public WebElement getBtnViewProfile() {
		return btnViewProfile;
	}

	public void setBtnViewProfile(WebElement btnViewProfile) {
		this.btnViewProfile = btnViewProfile;
	}

	@FindBy(xpath = "//*[@id='ctl15_txtEmployee']")
	private WebElement txtEmployeeName;
	
	@FindBy(xpath = "//*[@id='ctl15_inLocation']")
	private WebElement dnDLocation;
	
	//*[@id="ctl15_btnGo"]
	
	@FindBy(xpath = "//*[@id='ctl15_btnGo']")
	private WebElement btnSearchPeople;
	
	@FindBy(xpath = "(//*[@class='button flatButton'])[1]")
	private WebElement btnViewProfile;

}
