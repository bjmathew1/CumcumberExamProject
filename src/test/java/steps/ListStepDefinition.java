package steps;

import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ListPage;
import pages.TestBase;

public class ListStepDefinition extends TestBase{
	ListPage listPage;
	
	@Before
	public void SetupContext() {
		initDriver();
		listPage = PageFactory.initElements(driver, ListPage.class);
		driver.get("https://techfios.com/test/101/");
		takeScreenshot(driver);
	}

	@Given ("^The \"([^\"]*)\" button exists in \"([^\"]*)\" field$")
	public void the_button_exists_in_field(String button, String buttonField) {
		switch(buttonField){
		case "SetSkyBlueBackground":
			listPage.validatSkyBlueBackgroundButtonExists();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			break;
			
		case "SetWhiteBackground":
			listPage.validateWhiteBackgroundButtonExists();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			
			break;
			
		default:
			System.out.println("Unable to Validate that Change Background Color Buttons Exist");	
		}
	}
	
	@When("^I click on the \"([^\"]*)\" button in the \"([^\"]*)\" field$")
	public void i_click_on_the_button_in_the_field(String button,String buttonField )  {
		
		switch(buttonField){
		case "SetSkyBlueBackground":
			listPage.clickSetSkyBlueBackgroundButton();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			break;
			
		case "SetWhiteBackground":
			listPage.clickSetWhiteBackgroundButton();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			
			break;
			
		default:
			System.out.println("Unable to click on Change Background Color Buttons");	
			
		}
	}

	
	@Then("^The background color will change to \"([^\"]*)\" in the \"([^\"]*)\" field$")
	public void the_background_color_will_change_to_in_the_field(String background,String backgroundField)  {
		switch(backgroundField){
		case "SkyBlueBackground":
			listPage.validatSkyBlueBackground();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			break;
			
		case "WhiteBackground":
			listPage.validateWhiteBackground();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}
			
			break;
			
		default:
			System.out.println("Unable to Validate Background Color has Changed");	
			
		}
	}
	
	@After
	public void tearDown() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			}
		driver.close();
		driver.quit();
	}
	
}


