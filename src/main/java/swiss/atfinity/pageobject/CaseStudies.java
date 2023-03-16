package swiss.atfinity.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiss.atfinity.actiondriver.Action;
import swiss.atfinity.base.Base;
import swiss.atfinity.utility.Log;

public class CaseStudies extends Base {

	private Action action = new Action();
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[1]/a")
	private WebElement clientLifecycleJourneyLink;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[1]/a/div/h4")
	private WebElement clientLifecycleJourneyTitle1;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[1]/a/div/h2")
	private WebElement clientLifecycleJourneyTitl2;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[1]/a/div/div/img")
	private WebElement clientLifecycleJourneyImage;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[2]/a")
	private WebElement advisorClientonBoardingLink;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[2]/a/div/h4")
	private WebElement advisorClientonBoardingTitle1;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[2]/a/div/h2")
	private WebElement advisorClientonBoardingTitl2;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[2]/a/div/div/img")
	private WebElement advisorClientonBoardingImage;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[3]/a")
	private WebElement clientSelfBoardingLink;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[3]/a/div/h4")
	private WebElement clientSelfBoardingTitle1;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[3]/a/div/h2")
	private WebElement clientSelfBoardingTitl2;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[3]/a/div/div/img")
	private WebElement clientSelfBoardingImage;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[4]/a")
	private WebElement complianceAppforVCLink;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[4]/a/div/h4")
	private WebElement complianceAppforVCTitle1;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[4]/a/div/h2")
	private WebElement complianceAppforVCTitl2;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[4]/a/div/div/img")
	private WebElement complianceAppforVCImage;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[5]/a")
	private WebElement amlKycLink;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[5]/a/div/h4")
	private WebElement amlKycTitle1;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[5]/a/div/h2")
	private WebElement amlKycTitl2;
	
	@FindBy(id="//div[@id='knowhow_content']/div/div/div/div[5]/a/div/div/img")
	private WebElement amlKycImage;
	
	public CaseStudies() {
		PageFactory.initElements(driver, this);
	}
	

	/**
	 * Get web page title
	 * 
	 */
	public String getTitle() {
		extentTest.info("get case studies page title");
		Log.info("get case studies page title");
		String title = driver.getTitle();
		return title;
	}
	
	
}
