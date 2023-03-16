package swiss.atfinity.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import swiss.atfinity.base.Base;
import swiss.atfinity.pageobject.Career;
import swiss.atfinity.pageobject.CaseStudies;
import swiss.atfinity.pageobject.Company;
import swiss.atfinity.pageobject.Header;
import swiss.atfinity.pageobject.KnowHow;
import swiss.atfinity.pageobject.Software;
import swiss.atfinity.pageobject.Team;
import swiss.atfinity.pageobject.WorkTogether;
import swiss.atfinity.utility.Log;

public class HeaderTest extends Base {

	private Header header;
	private Software software;
	private WorkTogether workTogether;
	private CaseStudies caseStudies;
	private Career career;
	private Company company;
	private Team team;
	private KnowHow knowhow;

	public boolean TestSoftwareLink() {

		header = new Header();
		software = new Software();

		Log.startTestCase("verify header software link");
		header.clickOnSoftware();

		Log.info("verify user automatically redirect software page");
		extentTest.info("verify user automatically redirect software page");

		if(software.getTitle().equals("Atfinity - Software")) {
			Log.info("user has been successfully redirected to the software page");
			extentTest.pass("user has been successfully redirected to the software page");
			return true;
		} else {
			Log.info("redirecting to the software page unsuccessful");
			extentTest.fail("redirecting to the software page unsuccessful");
			return false;
		}



	}


	public boolean TestWorkingTogetherLink() {


		header = new Header();
		workTogether = new WorkTogether();

		Log.startTestCase("verify header working together link");
		header.clickOnWorkingTogether();

		Log.info("verify user automatically redirect to the working together page");
		extentTest.info("verify user automatically redirect to the working together page");

		if(workTogether.getTitle().equals("Atfinity - Working together")) {
			Log.info("user has been successfully redirected to the working together page");
			extentTest.pass("user has been successfully redirected to the working together page");
			return true;
		} else {
			Log.info("redirecting to the working together page unsuccessful");
			extentTest.fail("redirecting to the working together page unsuccessful");
			return false;
		}

	}

	public boolean TestCaseStudiesLink() {


		header = new Header();
		caseStudies = new CaseStudies();

		Log.startTestCase("verify header case studies link");
		header.clickOnCaseStudies();

		Log.info("verify user automatically redirect to the case studies page");
		extentTest.info("verify user automatically redirect to the case studies page");

		if(workTogether.getTitle().equals("Atfinity - Case Studies")) {
			Log.info("user has been successfully redirected to the case studies page");
			extentTest.pass("user has been successfully redirected to the case studies page");
			return true;
		} else {
			Log.info("redirecting to the case studies page unsuccessful");
			extentTest.fail("redirecting to the case studies page unsuccessful");
			return false;
		}

	}
	
	public boolean TestCareerLink() {


		header = new Header();
		career = new Career();

		Log.startTestCase("verify header career link");
		header.clickOnCareer();

		Log.info("verify user automatically redirect to the career page");
		extentTest.info("verify user automatically redirect to the career page");

		if(career.getTitle().equals("Atfinity - Career")) {
			Log.info("user has been successfully redirected to the career page");
			extentTest.pass("user has been successfully redirected to the career page");
			return true;
		} else {
			Log.info("redirecting to the career page unsuccessful");
			extentTest.fail("redirecting to the career page unsuccessful");
			return false;
		}

	}
	
	public boolean TestCompanyLink() {


		header = new Header();
		company = new Company();

		Log.startTestCase("verify header company link");
		header.clickOnCompany();

		Log.info("verify user automatically redirect to the company page");
		extentTest.info("verify user automatically redirect to the company page");

		if(company.getTitle().equals("Atfinity - Company")) {
			Log.info("user has been successfully redirected to the company page");
			extentTest.pass("user has been successfully redirected to the company page");
			return true;
		} else {
			Log.info("redirecting to the company page unsuccessful");
			extentTest.fail("redirecting to the company page unsuccessful");
			return false;
		}

	}
	
	public boolean TestTeamLink() {


		header = new Header();
		team = new Team();

		Log.startTestCase("verify header team link");
		header.clickOnTeam();

		Log.info("verify user automatically redirect to the team page");
		extentTest.info("verify user automatically redirect to the team page");

		if(team.getTitle().equals("Atfinity - Team")) {
			Log.info("user has been successfully redirected to the team page");
			extentTest.pass("user has been successfully redirected to the team page");
			return true;
		} else {
			Log.info("redirecting to the team page unsuccessful");
			extentTest.fail("redirecting to the team page unsuccessful");
			return false;
		}

	}
	
	public boolean TestKnowHowLink() {


		header = new Header();
		knowhow = new KnowHow();

		Log.startTestCase("verify header knowhow link");
		header.clickOnKnowHow();

		Log.info("verify user automatically redirect to the knowhow page");
		extentTest.info("verify user automatically redirect to the knowhow page");

		if(knowhow.getTitle().equals("Atfinity - Know-how")) {
			Log.info("user has been successfully redirected to the knowhow page");
			extentTest.pass("user has been successfully redirected to the knowhow page");
			return true;
		} else {
			Log.info("redirecting to the knowhow page unsuccessful");
			extentTest.fail("redirecting to the knowhow page unsuccessful");
			return false;
		}

	}
	
	
}
