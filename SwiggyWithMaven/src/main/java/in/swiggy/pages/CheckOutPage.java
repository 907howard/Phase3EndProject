package in.swiggy.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage {
	private WebDriverWait wait;

	@FindBy(xpath="//span[text()='Secure Checkout']")
	private WebElement checkOutText;
	
	
	public CheckOutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	}
	
	
	/*public String getCheckoutMsg() {
		String checkOutMsg = checkOutText.getText();
		return checkOutMsg;
	} */
	
	public String getCheckOutMsg() {
		wait.until(ExpectedConditions.visibilityOf(checkOutText));
		String text = checkOutText.getText();
		return text;
	}
	
}
