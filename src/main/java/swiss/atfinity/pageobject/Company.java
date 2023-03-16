package swiss.atfinity.pageobject;

import org.openqa.selenium.support.PageFactory;

import swiss.atfinity.base.Base;
import swiss.atfinity.utility.Log;

public class Company extends Base{

	public Company() {
		PageFactory.initElements(driver, this);
	}
	

	/**
	 * Get web page title
	 * 
	 */
	public String getTitle() {

		extentTest.info("get company page title");
		Log.info("get company page title");
		String title = driver.getTitle();
		return title;
	}

}
