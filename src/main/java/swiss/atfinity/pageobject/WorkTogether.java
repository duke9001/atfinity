package swiss.atfinity.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiss.atfinity.actiondriver.Action;
import swiss.atfinity.base.Base;

public class WorkTogether extends Base{

	private Action action = new Action();
	
	@FindBy(xpath = "//img[contains(@data-idatt,'234')]")
	private WebElement coverImage;
	
	@FindBy(xpath = "//div[@id='wt_top']/div[1]/div/div/div")
	private WebElement coverTitle;	

	@FindBy(xpath = "//img[contains(@data-idatt,'124')]")
	private WebElement consultingLogo;
	
	@FindBy(xpath = "//*[@id='software_center']/div/div[1]/div/h2")
	private WebElement consultingTitle;
	
	@FindBy(xpath = "//*[@id='software_center']/div/div[1]/div/div")
	private WebElement consultingParagraph;
	
	@FindBy(xpath = "//img[contains(@data-idatt,'125')]")
	private WebElement implementationLogo;
	
	@FindBy(xpath = "//div[contains(@data-id,'81')]/div/h2")
	private WebElement implementationTitle;
	
	@FindBy(xpath = "//div[contains(@data-id,'81')]/div/div")
	private WebElement implementationParagraph;
	
	@FindBy(xpath = "//img[contains(@data-idatt,'235')]")
	private WebElement trainingLogo;
	
	@FindBy(xpath = "//div[contains(@data-id,'82')]/div/h2")
	private WebElement trainingTitle;
	
	@FindBy(xpath = "//div[contains(@data-id,'82')]/div/div")
	private WebElement trainingParagraph;
	
	@FindBy(xpath = "//img[contains(@data-idatt,'127')]")
	private WebElement supportLogo;
	
	@FindBy(xpath = "//div[contains(@data-id,'83')]/div/h2")
	private WebElement supportTitle;
	
	@FindBy(xpath = "//div[contains(@data-id,'83')]/div/div")
	private WebElement supportParagraph;
	
	@FindBy(xpath = "//div[contains(@class,'wt_center_title')]/h3")
	private WebElement ourValue;
	
	@FindBy(xpath = "//div[contains(@data-id,'85')]/div/h2")
	private WebElement transparent;
	
	@FindBy(xpath = "//div[contains(@data-id,'85')]/div/div")
	private WebElement transparentParagraph;
	
	@FindBy(xpath = "//div[contains(@data-id,'86')]/div/h2")
	private WebElement pragmatic;
	
	@FindBy(xpath = "//div[contains(@data-id,'86')]/div/div")
	private WebElement pragmaticParagraph;
	
	@FindBy(xpath = "//div[contains(@data-id,'87')]/div/h2")
	private WebElement partnership;
	
	@FindBy(xpath = "//div[contains(@data-id,'87')]/div/div")
	private WebElement partnershipParagraph;
	
	@FindBy(xpath = "//img[contains(@data-idatt,'164')]")
	private WebElement cyrilDolisyImage;
	
	@FindBy(xpath = "//div[contains(@data-id,'88')]/div/div[1]")
	private WebElement cyrilDolisyParagraph;
	
	@FindBy(xpath = "//div[contains(@data-id,'88')]/div/div[2]")
	private WebElement cyrilDolisyTitle;
	
	public WorkTogether() {
		PageFactory.initElements(driver, this);
	}
	

	/**
	 * Get web page title
	 * 
	 */
	public String getTitle() {
		extentTest.info("get working together page title");
		String title = action.getTitle(driver);
		return title;
	}
}
