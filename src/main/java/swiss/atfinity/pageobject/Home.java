package swiss.atfinity.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiss.atfinity.actiondriver.Action;
import swiss.atfinity.base.Base;
import swiss.atfinity.utility.Log;

public class Home extends Base{

	private Action action = new Action();
	
	@FindBy(css="h1.home_title")
	private WebElement coverTitle;
	
	@FindBy(css="#home_top > div > div.simpli_mod.simpli_mod_teaser > div > div:nth-child(2) > div > div > a")
	private WebElement clientOnboardingForSwissNeobank;
	
	
	
	@FindBy(css="#home_top > div > div.simpli_mod.simpli_mod_text > div > div > div:nth-child(2) > div > video")
	private WebElement video;
	

	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	/**
	 * Get web page title
	 * 
	 */
	public String getTitle() {
		
		extentTest.info("get home page title");
		Log.info("get home page title");
		String title = driver.getTitle();
		return title;
	}
	
	/**
	 * Get "A leading software to automate your client processes" 
	 * 
	 */
	public String getCoverTitle() {
		extentTest.info("get home page cover title");
		Log.info("get home page cover title");
		String title = coverTitle.getText();
		return title;
	}
	
	/**
	 * Get video
	 * 
	 */
	public boolean getVideo(int time) {
		extentTest.info("get home page cover video");
		Log.info("get home page cover video");
		boolean result = action.getVideo(video, time);
		return result;
	}
	
	public ClientOnboardingForSwissNeobank testCaseStudySelfOnboardingNeobankLink() {
		
		extentTest.info("check Case Study \"Self-Onboarding Neobank\" link name");
		Log.info("check Case Study \"Self-Onboarding Neobank\" link name");
		if(clientOnboardingForSwissNeobank.getText().equals("Case Study \"Self-Onboarding Neobank\"")) {
			extentTest.pass("check Case Study \"Self-Onboarding Neobank\" correct link name");
			Log.info("check Case Study \"Self-Onboarding Neobank\"  correct link name");
		} else {
			extentTest.fail("check Case Study \"Self-Onboarding Neobank\" incorrect link name");
			Log.info("check Case Study \"Self-Onboarding Neobank\"  incorrect link name");
		}
		
		extentTest.info("click on  Case Study \"Self-Onboarding Neobank\" link");
		Log.info("click on  Case Study \"Self-Onboarding Neobank\" link");
		clientOnboardingForSwissNeobank.click();
		
		return new ClientOnboardingForSwissNeobank();
	}
}
