package test;

import java.io.IOException;

import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

import Pages.LoginPage;
import data.JsonFile;

public class LoginTest extends BaseTest{

	public LoginPage login;
	
	
	@Test
	public void userlogin() throws IOException, ParseException {
		
		driver.get("https://maharatech.gov.eg/login/index.php");
		JsonFile jsonreader = new JsonFile();
		jsonreader.JsonReader();
		
		login = new LoginPage(driver);
		login.openPage(jsonreader.username, jsonreader.password);
		
	}
	
}
