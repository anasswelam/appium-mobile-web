package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (id ="username")
	WebElement emailBTN ;
	
	@FindBy (id="password")
	WebElement passBTN;
	
	@FindBy (id="loginbtn")
	WebElement loginBTN ;
	
	public void openPage(String username, String password) {
		
		sendText(emailBTN, username);
		sendText(passBTN, password);
		clickButton(loginBTN);
	}

}
