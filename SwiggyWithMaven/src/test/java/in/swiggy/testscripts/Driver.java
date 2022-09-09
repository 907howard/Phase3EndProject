package in.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import in.swiggy.pages.CheckOutPage;
import in.swiggy.pages.LandingPage;
import in.swiggy.pages.OrderPage;
import in.swiggy.pages.RestaurantListPage;

public class Driver extends Tools {
	protected static LandingPage landingPage;
	protected static RestaurantListPage rp;
	protected static OrderPage op;
	protected static CheckOutPage co;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\907ho\\Downloads\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		landingPage = new LandingPage(driver);
		rp = new RestaurantListPage(driver);
		op = new OrderPage(driver);
		co = new CheckOutPage(driver);
		
	}

	
}
