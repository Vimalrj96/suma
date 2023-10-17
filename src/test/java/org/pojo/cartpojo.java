package org.pojo;

import org.frameBase.FrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class cartpojo extends FrameWork{

	public cartpojo() {
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(xpath="//*[contains(@class,'clean-search__where')]")
	private WebElement where;
	
	@FindBy(xpath="//*[contains(@class,'clean-search__when-input')]")
	private WebElement when;
	
	@FindBy(xpath="//*[contains(@class,'selector__next-year')]")
	private WebElement year;
	
	//@FindBy(xpath="//*[contains(@data-label,'Oct 2023')]")
	//private WebElement mon;
	
	@FindBy(xpath="(//*[contains(text(),'Jan')])[2]")
	private WebElement month;

	@FindBy(id="ao-clp-clean-search__who-input")
	private WebElement ad;
	
	@FindBy(xpath="(//*[text()='Private Adventures'])[1]")
	private WebElement pri;
	
	@FindAll({
	@FindBy(xpath="//*[contains(text(),' Search')]"),	
	@FindBy(xpath="(//*[contains(@class,'ao-clp-clean-search__cta')])[1]")})
	private WebElement search;

	public WebElement getWhere() {
		return where;
	}

	public WebElement getWhen() {
		return when;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getAd() {
		return ad;
	}

	public WebElement getPri() {
		return pri;
	}

	public WebElement getSearch() {
		return search;
	}
	
	////
	///////////
	//////////////
	///////////////
	//////////////////
	//////////////////////
	@FindBy(xpath="//h4[contains(text(),'Eastern Canada Highlights in a Week')]")
	private WebElement pl;
	
	@FindBy(xpath="(//button[@target='_blank'])[2]")
	private WebElement con;

	public WebElement getPl() {
		return pl;
	}

	public WebElement getCon() {
		return con;
	}
	
	
	
}
