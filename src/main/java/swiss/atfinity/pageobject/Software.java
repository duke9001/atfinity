package swiss.atfinity.pageobject;

import org.openqa.selenium.support.PageFactory;

import swiss.atfinity.actiondriver.Action;
import swiss.atfinity.base.Base;

public class Software extends Base{

	private Action action = new Action();
	
	public Software() {
		PageFactory.initElements(driver, this);
	}
	

	/**
	 * Get web page title
	 * 
	 */
	public String getTitle() {
		extentTest.info("get software page title");
		String title = action.getTitle(driver);
		return title;
	}
}
