package org.pojo;

import org.helper.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends BaseClass {
	public FbPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="email")
	private WebElement getEmail;
	@FindBy(id="pass")
	private WebElement getPass;
	@FindBy(name="login")
	private WebElement login;
	public WebElement getGetEmail() {
		return getEmail;
	}
	public WebElement getGetPass() {
		return getPass;
	}
	public WebElement getLogin() {
		return login;
	}
	
	

}
