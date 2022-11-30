package pageobject;

import 	org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;
		
		PageFactory.initElements(rDriver, this);
		
	}
	
  @FindBy(id = "Email")
WebElement email;
  
  @FindBy(id = "Password")
  WebElement Password;

@FindBy(xpath = "/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")
WebElement LoginBtn;

@FindBy(linkText = "Logout")
WebElement logout;

public void enterEmail(String emailadd)
{
	email.clear();
	email.sendKeys(emailadd);
}

public void enterPassword(String pwd)
{
Password.clear();
Password.sendKeys(pwd);	
}

public void ClickOnLoginButton()
{
	LoginBtn.click();
	}
public void ClickOnLogOutButton()
{
	logout.click();
}
}