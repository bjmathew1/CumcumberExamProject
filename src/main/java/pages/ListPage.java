package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ListPage extends TestBase{
	
	WebDriver driver;
	public ListPage(WebDriver driver) {
		  this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set SkyBlue Background')]")WebElement SetSkyBlueBackgroundButton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")WebElement SkyBlueBackground;
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Set White Background')]")WebElement SetWhiteBackgroundButton;
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")WebElement WhiteBackground;
	
	//body[@style='background-color: white;']
	
	//body[@style='background-color: skyblue;']
	
	public void clickSetSkyBlueBackgroundButton() {
		SetSkyBlueBackgroundButton.click();  
		  try {
		   Thread.sleep(2000);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }
		 }
	
	public void clickSetWhiteBackgroundButton() {
		SetWhiteBackgroundButton.click();  
		  try {
		   Thread.sleep(2000);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }
		 }
	
	 public boolean validatSkyBlueBackgroundButtonExists() {
		 try {
			   Thread.sleep(2000);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
		 return SetSkyBlueBackgroundButton.isDisplayed();
		 
	 }
	 public boolean validateWhiteBackgroundButtonExists() {

		 try {
			   Thread.sleep(2000);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
		 return SetWhiteBackgroundButton.isDisplayed();
		 
	 }
	
	
	 public boolean validatSkyBlueBackground() {
			SetSkyBlueBackgroundButton.click(); 
		 try {
			   Thread.sleep(2000);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
		 return SkyBlueBackground.isDisplayed();
		 
	 }
	 
	 public boolean validateWhiteBackground() {
			SetWhiteBackgroundButton.click(); 
		 try {
			   Thread.sleep(2000);
			  } catch (InterruptedException e) {
			   e.printStackTrace();
			  }
		 return WhiteBackground.isDisplayed();
		 
	 }
	 
	
}
