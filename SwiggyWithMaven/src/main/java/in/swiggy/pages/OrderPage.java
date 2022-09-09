package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {
	
	
	@FindBy(xpath="(//div[contains(@class,'_1RPOp')])[1]")
	private WebElement addBtn;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkoutBtn;
	
	public OrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Add() {
		addBtn.click();	
	}
	
	public void clickCheckoutBtn() {
		checkoutBtn.click();	
	}
	

}
