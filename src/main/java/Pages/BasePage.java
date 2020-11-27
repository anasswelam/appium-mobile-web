package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BasePage {

	protected WebDriver driver ;
	public JavascriptExecutor jse;

	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickButton(WebElement button) {
		button.click();
	}
	
	public void sendText(WebElement text, String value) {
		text.sendKeys(value);
	}
	public void scroll() {
		jse.executeScript("ScrollBy(0,2500)");
	}
	
	
}
