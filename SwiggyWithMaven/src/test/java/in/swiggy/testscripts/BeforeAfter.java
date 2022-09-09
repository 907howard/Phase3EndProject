package in.swiggy.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools {

	@Before   //Using a hook
	public void setup(Scenario scenario) {
		
		Driver.init();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com");
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
