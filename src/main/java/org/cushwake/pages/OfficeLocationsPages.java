package org.cushwake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class OfficeLocationsPages extends Base  {
	
	public OfficeLocationsPages() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLnkOfficeLocationIcon() {
		return lnkOfficeLocationIcon;
	}

	public void setLnkOfficeLocationIcon(WebElement lnkOfficeLocationIcon) {
		this.lnkOfficeLocationIcon = lnkOfficeLocationIcon;
	}

	public WebElement getTxTCity() {
		return txTCity;
	}

	public void setTxTCity(WebElement txTCity) {
		this.txTCity = txTCity;
	}

	public WebElement getBtnGo() {
		return btnGo;
	}

	public void setBtnGo(WebElement btnGo) {
		this.btnGo = btnGo;
	}

	@FindBy(xpath = "//*[@id='header-wrapper']/header/div[2]/div/nav[1]/ul/li[3]/a")
	private WebElement lnkOfficeLocationIcon;
	
	@FindBy(xpath = "//*[@id='ctl15_inLocation']")
	private WebElement txTCity;
	
	@FindBy(xpath = "//*[@id='ctl15_btnGo']")
	private WebElement btnGo;

}
