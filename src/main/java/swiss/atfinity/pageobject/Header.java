package swiss.atfinity.pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import swiss.atfinity.actiondriver.Action;
import swiss.atfinity.base.Base;
import swiss.atfinity.utility.Log;

public class Header extends Base{

	private Action action = new Action();
	
	@FindBy(id="logo")
	private WebElement logo;
	
	@FindBy(xpath = "//nav/ul/li[1]/a")
	private WebElement software;
	
	@FindBy(xpath = "//nav/ul/li[2]/a")
	private WebElement workingTogether;
	
	@FindBy(xpath = "//nav/ul/li[3]/a")
	private WebElement caseStudies;
	
	@FindBy(xpath = "//nav/ul/li[4]/a")
	private WebElement career;
	
	@FindBy(xpath = "//nav/ul/li[5]/a")
	private WebElement aboutUs;
	
	@FindBy(xpath = "//*[@id='body_home']/header/div/nav/ul/li[5]/a")
	private WebElement aboutus;
	
	@FindBy(xpath = "//nav/ul/li[5]/ul/li[1]/a")
	private WebElement company;
	
	@FindBy(xpath = "//nav/ul/li[5]/ul/li[2]/a")
	private WebElement team;
	
	@FindBy(xpath = "//nav/ul/li[5]/ul/li[3]/a")
	private WebElement knowHow;
	
	public Header() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean findLogo() {
		action.explicitWait(driver, logo, 10);
		extentTest.info("check company logo load or not");
		
		boolean result = action.findElement(driver, logo);
		Log.info("check company logo load or not");
		
		if(result) {
			extentTest.pass("company logo load successfully");				
			return(result);
		} else {
			extentTest.fail("company logo failed to load");				
			return(result);
		}
		
	}
	
	public Software clickOnSoftware() {
		extentTest.info("check software link");
		
		if(software.getText().equals("Software")) {
			extentTest.pass("correct software link name");
			Log.info("correct software link name");
		} else {
			extentTest.fail("incorrect software link name");	
			Log.info("incorrect software link name");
		}
		
		Log.info("click on the software link");
		extentTest.info("click on  the software link");
		action.click(driver, software);
		
		return new Software();
		
	}
	
	public WorkTogether clickOnWorkingTogether() {
		extentTest.info("check working together link");
		
		if(workingTogether.getText().equals("Working together")) {
			extentTest.pass("correct working together link name");
			Log.info("correct working together link name");
		} else {
			extentTest.fail("incorrect working together link name");	
			Log.info("incorrect working together link name");
		}
		
		Log.info("click on the  working together link");
		extentTest.info("click on the  working together link");
		action.click(driver, workingTogether);
		
		return new WorkTogether();
		
	}
	
	public CaseStudies clickOnCaseStudies() {
		extentTest.info("check case studies link");
		
		if(caseStudies.getText().equals("Case Studies")) {
			extentTest.pass("correct case studies link name");
			Log.info("correct case studies link name");
		} else {
			extentTest.fail("incorrect case studies link name");	
			Log.info("incorrect case studies link name");
		}
		
		Log.info("click on the case studies link");
		extentTest.info("click on the  case studies link");
		action.click(driver, caseStudies);
		
		return new CaseStudies();
		
	}
	
	public Career clickOnCareer() {
		extentTest.info("check case studies link");
		
		if(career.getText().equals("Career")) {
			extentTest.pass("correct career link name");
			Log.info("correct career link name");
		} else {
			extentTest.fail("incorrect career link name");	
			Log.info("incorrect career link name");
		}
		
		Log.info("click on the career link");
		extentTest.info("click on the  career link");
		action.click(driver, career);
		
		return new Career();
		
	}
	
	public Company clickOnCompany() {
		extentTest.info("check company link");
		extentTest.info("hover mouse on about us");
		Log.info("hover mouse on about us");
		action.mouseHover(driver,aboutus);
		
		if(company.getText().equals("Company")) {
			extentTest.pass("correct company link name");
			Log.info("correct company link name");
		} else {
			extentTest.fail("incorrect company link name");	
			Log.info("incorrect company link name");
		}
		
		Log.info("click on the company link");
		extentTest.info("click on the  company link");
		action.click(driver, company);
		
		return new Company();
		
	}
	
	public Team clickOnTeam() {
		extentTest.info("check team link");
		extentTest.info("hover mouse on about us");
		Log.info("hover mouse on about us");
		action.mouseHover(driver,aboutus);
		
		if(team.getText().equals("Team")) {
			extentTest.pass("correct team link name");
			Log.info("correct team link name");
		} else {
			extentTest.fail("incorrect team link name");	
			Log.info("incorrect team link name");
		}
		
		Log.info("click on the team link");
		extentTest.info("click on the  team link");
		action.click(driver, team);
		
		return new Team();
		
	}
	
	public KnowHow clickOnKnowHow() {
		extentTest.info("check know how link");
		extentTest.info("hover mouse on about us");
		Log.info("hover mouse on about us");
		action.mouseHover(driver,aboutus);
		
		if(knowHow.getText().equals("Know-how")) {
			extentTest.pass("correct know how link name");
			Log.info("correct know how link name");
		} else {
			extentTest.fail("incorrect know how link name");	
			Log.info("incorrect know how link name");
		}
		
		Log.info("click on the know how link");
		extentTest.info("click on the  know how link");
		action.click(driver, knowHow);
		
		return new KnowHow();
		
	}
}
