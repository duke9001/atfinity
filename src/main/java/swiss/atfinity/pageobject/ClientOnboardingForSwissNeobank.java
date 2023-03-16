package swiss.atfinity.pageobject;

import org.openqa.selenium.support.PageFactory;

import swiss.atfinity.base.Base;

public class ClientOnboardingForSwissNeobank extends Base{

	public ClientOnboardingForSwissNeobank() {
		PageFactory.initElements(driver, this);
	}
	
	/* 
	 * Get page title 
	 * 
	 */
	public String getTitle() {
		
		String title = driver.getTitle();
		return title;
	}
}
