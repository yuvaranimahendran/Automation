package org.cushwake.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.utility.Base;

public class NewsPages extends Base {
	
	@FindBy(xpath = "//*[@id='header-wrapper']/header/div[1]/div/div[2]/div[2]/nav/ul/li[6]/a")
	private WebElement lnkNewsHeader;
	
	public WebElement getLnkNewsHeader() {
		return lnkNewsHeader;
	}

	public void setLnkNewsHeader(WebElement lnkNewsHeader) {
		this.lnkNewsHeader = lnkNewsHeader;
	}

	public WebElement getLnkSeeAll() {
		return lnkSeeAll;
	}

	public void setLnkSeeAll(WebElement lnkSeeAll) {
		this.lnkSeeAll = lnkSeeAll;
	}

	@FindBy(xpath = "//*[@id='form1']/div[3]/div/div[2]/div[2]/div/a")
	private WebElement lnkSeeAll;
	
	/*@FindBy(xpath = "//*[@id='header-wrapper']/header/div[2]/div/nav[2]/ul/li[7]/a")
	private WebElement lnkGooglePlus;*/
	
	//*[@id="header-wrapper"]/header/div[2]/div/nav[2]/ul/li[6]/a/img
	
	/*@FindBy(xpath = "//*[@id='header-wrapper']/header/div[2]/div/nav[2]/ul/li[6]/a/img")
	private WebElement lnkBlog;
	
	@FindBy(xpath = "//*[@id='header-wrapper']/header/div[2]/div/nav[2]/ul/li[4]/a/img")
	private WebElement lnkYouTube;*/
	

}