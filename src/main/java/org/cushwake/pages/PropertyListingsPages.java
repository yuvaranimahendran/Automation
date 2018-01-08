package org.cushwake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class PropertyListingsPages extends Base {
	public PropertyListingsPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[text()='Property Listings']")
	private WebElement lnkPropertListingsIcon;

	// *[@id="content-wrapper"]/section[2]/div/div[1]/div[2]/div/div/div[1]/p/a

	// Americas

	public WebElement getLnkPropertListingsIcon() {
		return lnkPropertListingsIcon;
	}

	public void setLnkPropertListingsIcon(WebElement lnkPropertListingsIcon) {
		this.lnkPropertListingsIcon = lnkPropertListingsIcon;
	}

	public WebElement getLnkSearchPropertiesAmericas() {
		return lnkSearchPropertiesAmericas;
	}

	public void setLnkSearchPropertiesAmericas(WebElement lnkSearchPropertiesAmericas) {
		this.lnkSearchPropertiesAmericas = lnkSearchPropertiesAmericas;
	}

	public WebElement getLnkPLIndustrialUS() {
		return lnkPLIndustrialUS;
	}

	public void setLnkPLIndustrialUS(WebElement lnkPLIndustrialUS) {
		this.lnkPLIndustrialUS = lnkPLIndustrialUS;
	}

	public WebElement getLnkInvestmentSalesNY() {
		return lnkInvestmentSalesNY;
	}

	public void setLnkInvestmentSalesNY(WebElement lnkInvestmentSalesNY) {
		this.lnkInvestmentSalesNY = lnkInvestmentSalesNY;
	}

	public WebElement getBtnSearchListingsAllNeighborhoods() {
		return btnSearchListingsAllNeighborhoods;
	}

	public void setBtnSearchListingsAllNeighborhoods(WebElement btnSearchListingsAllNeighborhoods) {
		this.btnSearchListingsAllNeighborhoods = btnSearchListingsAllNeighborhoods;
	}

	public WebElement getBtnSearchListingsPtCb() {
		return btnSearchListingsPtCb;
	}

	public void setBtnSearchListingsPtCb(WebElement btnSearchListingsPtCb) {
		this.btnSearchListingsPtCb = btnSearchListingsPtCb;
	}

	public WebElement getBtnSearchListingsPtSu() {
		return btnSearchListingsPtSu;
	}

	public void setBtnSearchListingsPtSu(WebElement btnSearchListingsPtSu) {
		this.btnSearchListingsPtSu = btnSearchListingsPtSu;
	}

	public WebElement getBtnSearchListingsPrAllPrices() {
		return btnSearchListingsPrAllPrices;
	}

	public void setBtnSearchListingsPrAllPrices(WebElement btnSearchListingsPrAllPrices) {
		this.btnSearchListingsPrAllPrices = btnSearchListingsPrAllPrices;
	}

	public WebElement getBtnSearchListingsSearchNow() {
		return btnSearchListingsSearchNow;
	}

	public void setBtnSearchListingsSearchNow(WebElement btnSearchListingsSearchNow) {
		this.btnSearchListingsSearchNow = btnSearchListingsSearchNow;
	}

	@FindBy(xpath = "//*[@id='content-wrapper']/section[2]/div/div[1]/div[2]/div/div/div[1]/p/a")
	private WebElement lnkSearchPropertiesAmericas;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div/p[3]/a")
	private WebElement lnkPLIndustrialUS;

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div/p[6]/a")
	private WebElement lnkInvestmentSalesNY;

	@FindBy(id = "chkAllNeighborhoods")
	private WebElement btnSearchListingsAllNeighborhoods;

	@FindBy(xpath = "//*[@name='chk15-propertytype']")
	private WebElement btnSearchListingsPtCb;

	@FindBy(xpath = "//*[@name='chk16-propertytype']")
	private WebElement btnSearchListingsPtSu;

	@FindBy(xpath = "//*[@id='chkAllPriceRange']")
	private WebElement btnSearchListingsPrAllPrices;

	@FindBy(xpath = "//*[@id='btnEnter']")
	private WebElement btnSearchListingsSearchNow;

	/*
	 * @FindBy(xpath =
	 * "//*[@id='content-wrapper']/section[2]/div/div[2]/div[2]/div/div/div[1]/p/a")
	 * private WebElement lnkSearchPropertiesEMEA;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id='content-wrapper']/section[2]/div/div[3]/div[2]/div/div/div[1]/p/a")
	 * private WebElement lnkSearchPropertiesAPAC;
	 * 
	 * @FindBy(xpath =
	 * "//*[@id='content-wrapper']/section[2]/div/div[4]/div[2]/div/div/div[1]/p/a")
	 * private WebElement lnkSearchPropertiesCHINA;
	 */

}
