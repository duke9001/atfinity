package swiss.atfinity.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiss.atfinity.actiondriver.Action;
import swiss.atfinity.base.Base;
import swiss.atfinity.utility.Log;

public class Career extends Base{

	private Action action = new Action();
	
	@FindBy(xpath = "//img[contains(@data-idatt,'104')]")
	private WebElement coverImage;
	
	public Career() {
		PageFactory.initElements(driver, this);
	}
	

	/**
	 * Get web page title
	 * 
	 */
	public String getTitle() {

		extentTest.info("get career page title");
		Log.info("get career page title");
		String title = driver.getTitle();
		return title;
	}
}
