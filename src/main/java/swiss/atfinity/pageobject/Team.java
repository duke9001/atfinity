package swiss.atfinity.pageobject;

import org.openqa.selenium.support.PageFactory;

import swiss.atfinity.base.Base;
import swiss.atfinity.utility.Log;

public class Team extends Base{

	public Team() {
		PageFactory.initElements(driver, this);
	}
	

	/**
	 * Get web page title
	 * 
	 */
	public String getTitle() {
		
		extentTest.info("get know how page title");
		Log.info("get know how page title");
		String title = driver.getTitle();
		return title;
	}
}
