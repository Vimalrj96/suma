package org.pojo;

import org.frameBase.FrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newcart extends FrameWork {

	public newcart() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3[text()='Young Adults']")
	private WebElement tour;
	
	@FindBy(xpath="//h3[text()='Philippines One Life Adventures - 10 Days']")
	private WebElement phili;
	
	@FindBy(xpath="(//*[contains(text(),'Check Availability')])[2]")
	private WebElement check;
	
	@FindBy(xpath="(//li[contains(text(),' May 2024')])")
	private WebElement date;
	
	@FindBy(xpath="(//*[contains(text(),'Confirm Dates')])[2]")
	private WebElement conf;
	
	public WebElement getConf() {
		return conf;
	}

	@FindAll({
	@FindBy(xpath="//*[@aria-label='+']"),	
	@FindBy(xpath="//button[contains(@class,'scout-element__counter-button--add')]")})
	private WebElement added;

	@FindBy(xpath="(//*[contains(@class,'scout-element__select-field')])[2]")
	private WebElement two;
	
	@FindBy(id="t2-1")
	private WebElement name;
	
	@FindBy(id="t4-1")
	private WebElement lastna;
	
	@FindBy(id="t6-1")
	private WebElement phn;

	@FindBy(id="t7-1")
	private WebElement dat;
	
	@FindBy(id="t7-1-month")
	private WebElement mo;
	
	@FindBy(id="t7-1-year")
	private WebElement yr;
	
	@FindBy(xpath="//*[contains(text(),'Male')]")
	private WebElement male;
	
	@FindBy(id="t15-1")
	private WebElement coun;

	public WebElement getTour() {
		return tour;
	}

	public WebElement getPhili() {
		return phili;
	}

	public WebElement getCheck() {
		return check;
	}

	public WebElement getDate() {
		return date;
	}

	

	public WebElement getAdded() {
		return added;
	}

	public WebElement getTwo() {
		return two;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getLastna() {
		return lastna;
	}

	public WebElement getPhn() {
		return phn;
	}

	public WebElement getDat() {
		return dat;
	}

	public WebElement getMo() {
		return mo;
	}

	public WebElement getYr() {
		return yr;
	}

	public WebElement getMale() {
		return male;
	}

	public WebElement getCoun() {
		return coun;
	}
	
	
	
	
}
