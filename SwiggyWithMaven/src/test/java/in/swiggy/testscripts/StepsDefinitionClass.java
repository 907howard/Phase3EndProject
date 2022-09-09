package in.swiggy.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class StepsDefinitionClass  extends Driver{
	
	@Given("a user is on the landing page of Swiggy")
	public void a_user_is_on_the_landing_page_of_Swiggy()
	{
	  Assert.assertTrue(driver.getTitle().equals("Order food online from India's best food delivery service. Order from restaurants near you"));
	}
	
	@And("he Enters location as ban")
	public void he_Enters_location_as_ban() {
		
		landingPage.typeLocation();
	}
	
	@And("he selects first location from suggested location in suggestionBox")
	public void he_selects_first_location_from_suggested_location_in_suggestionBox() throws InterruptedException{
		
		Thread.sleep(5000);
		landingPage.selectLocation();
	}
	
	@And("he redirects to Restaurant listPage and select first suggested restaurant from recommended list")
	public void he_redirects_to_restaurant_list_page_and_select_first_suggested_restaurant_from_recommended_list() throws InterruptedException {
		
		Thread.sleep(5000);
		rp.Restaurant();
	}
	
	@And("he redirects to orderPage and adds first item to cart")
	public void he_redirects_to_order_page_and_adds_first_item_to_cart() throws InterruptedException {
	
		Thread.sleep(5000);
		op.Add();
	}
	
	
	@And("he click on checkout button")
	public void And_he_click_on_checkout_button() throws InterruptedException {
	
		Thread.sleep(5000);
		op.clickCheckoutBtn();
	}
	 
	@Then("Verify you are on Checkout page")
	public void Then_Verify_you_are_on_Checkout_page() {
		
		String expectedCheckOutMsg = "SECURE CHECKOUT";
		String actualMsg = co.getCheckOutMsg();
		Assert.assertEquals(actualMsg, expectedCheckOutMsg);
	}	
}
