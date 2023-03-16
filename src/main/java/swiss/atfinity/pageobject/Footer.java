package swiss.atfinity.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import swiss.atfinity.actiondriver.Action;
import swiss.atfinity.base.Base;

public class Footer extends Base{

	private Action action = new Action();
	
	@FindBy(id="swiss")
	private WebElement plusLogo;
	
	@FindBy(xpath = "//*[@id='body_home']/div[1]/img")
	private WebElement paralaxImage;
	
	@FindBy(id="footer_img_text")
	private WebElement threeGoodWorkReasons;
	
	@FindBy(xpath = "//*[@id='footer_img_text']/ol/li[1]")
	private WebElement reasonOne;
	
	@FindBy(xpath = "//*[@id='footer_img_text']/ol/li[2]")
	private WebElement reasonTwo;
	
	@FindBy(xpath = "//*[@id='footer_img_text']/ol/li[3]")
	private WebElement reasonThree;
	
	@FindBy(xpath = "//*[@id='footer_left']/div/strong")
	private WebElement addressHeader;
	
	@FindBy(xpath = "//*[@id='footer_left']/div/text()[1]")
	private WebElement addressLine1;
	
	@FindBy(xpath = "//*[@id='footer_left']/div/text()[2]")
	private WebElement addressLine2;

	@FindBy(xpath = "//*[@id='footer_left']/div/text()[3]")
	private WebElement addressLine3;

	@FindBy(xpath = "//*[@id='footer_left']/div/text()[4]")
	private WebElement addressLine4;
	
	@FindBy(xpath = "//*[@id='footer_left']/div/a")
	private WebElement email;
	
	@FindBy(xpath = "//*[@id='footer_nav']/ul/li[1]/a")
	private WebElement software;
	
	@FindBy(xpath = "//*[@id='footer_nav']/ul/li[3]/a")
	private WebElement caseStudies;
	
	@FindBy(xpath = "//*[@id='footer_nav']/ul/li[2]/a")
	private WebElement workingTogether;
	
	@FindBy(xpath = "//*[@id='footer_nav']/ul/li[4]/a")
	private WebElement career;
	
	@FindBy(xpath = "//*[@id='footer_nav']/ul/li[5]/a")
	private WebElement aboutUs;
	
	@FindBy(xpath = "//*[@id='footer_nav']/ul/li[5]/ul/li[1]/a")
	private WebElement company;
	
	@FindBy(xpath = "//*[@id='footer_nav']/ul/li[5]/ul/li[2]/a")
	private WebElement team;
	
	@FindBy(xpath = "//*[@id='footer_nav']/ul/li[5]/ul/li[3]/a")
	private WebElement knowNow;
	
	@FindBy(xpath = "//*[@id='footer_right']/div/a[1]")
	private WebElement documentation;
	
	@FindBy(xpath = "//*[@id='footer_right']/div/a[2]")
	private WebElement apiDocumentation;
	
	@FindBy(xpath = "//*[@id='footer_right']/div/a[3]")
	private WebElement pressandMedia;
	
	@FindBy(xpath = "//*[@id='footer_right']/div/a[4]")
	private WebElement legalNote;
	
	@FindBy(xpath = "//*[@id='footer_right']/div/a[5]")
	private WebElement dataProtection;
	
	@FindBy(xpath = "//*[@id='linkedin']")
	private WebElement linkedinLink;
	
	@FindBy(xpath = "//*[@id='linkedin']/img")
	private WebElement linkedinLinkLogo;
	
	@FindBy(xpath = "//*[@id='footer_btm']/div[4]/ul/li[1]/a")
	private WebElement de;
	
	@FindBy(xpath = "//*[@id='footer_btm']/div[4]/ul/li[2]/a")
	private WebElement en;
}
