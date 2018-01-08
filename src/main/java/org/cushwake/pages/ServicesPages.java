package org.cushwake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utility.Base;

public class ServicesPages extends Base {
	public ServicesPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[text()='Services'])[2]")
	private WebElement lnkServices;
	// To find webelement using index //(//*[@class='drawerHeader'])[1]
	
	//*[@id="form1"]/div[3]/div/div[1]/div/div[2]/div/div[1]/h3/span
	
	@FindBy(xpath = "(//*[@class='drawerHeader'])[1]")
	private WebElement accAssetServices;

	public WebElement getAccAssetServices() {
		return accAssetServices;
	}

	public void setAccAssetServices(WebElement accAssetServices) {
		this.accAssetServices = accAssetServices;
	}

	@FindBy(xpath = "(//*[@class='drawerHeader'])[2]")
	private WebElement accCapitalMarkets;

	@FindBy(xpath = "(//*[@class='drawerHeader'])[3]")
	private WebElement accConsulting;

	@FindBy(xpath = "(//*[@class='drawerHeader'])[4]")
	private WebElement accGlobalAccoupier;

	@FindBy(xpath = "(//*[@class='drawerHeader'])[5]")
	private WebElement accLeasing;

	@FindBy(xpath = "(//*[@class='drawerHeader'])[6]")
	private WebElement accVandA;

	public WebElement getLnkServices() {
		return lnkServices;
	}

	public void setLnkServices(WebElement lnkServices) {
		this.lnkServices = lnkServices;
	}

	public WebElement getAccCapitalMarkets() {
		return accCapitalMarkets;
	}

	public void setAccCapitalMarkets(WebElement accCapitalMarkets) {
		this.accCapitalMarkets = accCapitalMarkets;
	}

	public WebElement getAccConsulting() {
		return accConsulting;
	}

	public void setAccConsulting(WebElement accConsulting) {
		this.accConsulting = accConsulting;
	}

	public WebElement getAccGlobalAccoupier() {
		return accGlobalAccoupier;
	}

	public void setAccGlobalAccoupier(WebElement accGlobalAccoupier) {
		this.accGlobalAccoupier = accGlobalAccoupier;
	}

	public WebElement getAccLeasing() {
		return accLeasing;
	}

	public void setAccLeasing(WebElement accLeasing) {
		this.accLeasing = accLeasing;
	}

	public WebElement getAccVandA() {
		return accVandA;
	}

	public void setAccVandA(WebElement accVandA) {
		this.accVandA = accVandA;
	}

	public WebElement getAccAcquireProperty() {
		return accAcquireProperty;
	}

	public void setAccAcquireProperty(WebElement accAcquireProperty) {
		this.accAcquireProperty = accAcquireProperty;
	}

	// to find weelement uisng text (//a[text()='Acquire Property'])
	@FindBy(xpath = "//a[text()='Acquire Property']")
	private WebElement accAcquireProperty;

}
