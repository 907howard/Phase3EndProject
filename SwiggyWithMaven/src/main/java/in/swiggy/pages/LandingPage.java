package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	//@FindBy(linkText = "Bangalore")
	//private WebElement City;
	
	@FindBy(id="location")
	private WebElement LocationBox;
	
	//@FindBy(xpath="(//span[contains(@class ,'_2W-T9')])[1]")
	
	@FindBy(xpath="//span[text()='Bangalore, Karnataka, India']")
	private WebElement cityName;
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void typeLocation() {
		LocationBox.sendKeys("ban");
	}
	
	public void selectLocation() {
		cityName.click();
	}
	
}
