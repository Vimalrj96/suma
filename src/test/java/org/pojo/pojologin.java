package org.pojo;

import org.frameBase.FrameWork;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pojologin extends FrameWork {

	public pojologin() {
			PageFactory.initElements(driver, this);
	}
	@FindAll({
		@FindBy(xpath="//div[contains(@class,'profile-placeholder')]")
	})
	private WebElement acct;
	
	@FindBy(xpath="(//*[contains(text(),'Log In')])[1]")
	private WebElement log;
	
	@FindAll({
		@FindBy(id="g_email"),
		@FindBy(xpath="//*[contains(@placeholder,'Enter your Email')]")
	})
	private WebElement mail;
	
	@FindAll({
		@FindBy(xpath="//*[contains(@placeholder,'Enter password')]"),
		@FindBy(id="g_password")
	})
	private WebElement pas;
	
	@FindBy(id="g_send")
	private WebElement logbutton;

	public WebElement getAcct() {
		return acct;
	}

	public WebElement getLog() {
		return log;
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPas() {
		return pas;
	}

	public WebElement getLogbutton() {
		return logbutton;
	}

	
	
	//*[contains(@class,'clean-search__where')]
	
}
