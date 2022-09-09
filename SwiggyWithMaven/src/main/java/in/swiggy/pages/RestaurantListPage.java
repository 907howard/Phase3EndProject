package in.swiggy.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RestaurantListPage {
	
	@FindBy(xpath="(//div[@class='nA6kb'])[2]")
	private WebElement selectRestaurant;
	
	public RestaurantListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Restaurant() {
		selectRestaurant.click();
	}

}
