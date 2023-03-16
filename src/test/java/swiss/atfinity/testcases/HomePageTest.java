package swiss.atfinity.testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import swiss.atfinity.base.Base;
import swiss.atfinity.pageobject.ClientOnboardingForSwissNeobank;
import swiss.atfinity.pageobject.Header;
import swiss.atfinity.pageobject.Home;
import swiss.atfinity.utility.Log;

public class HomePageTest extends Base{

	
	
	/**
	 * Test navigation bar links  
	 * 
	 */
	@Test(testName = "Test navigationbar links", groups = {"Smoke", "Sanity", "Regression"})
	public void testNavigationBar() {


		HeaderTest headerTest = new HeaderTest();
		Header header = new Header();
		
		driver.get(readConfig.getBaseURL());
		extentTest.info("navigate to home url");	
		header.findLogo();
		softAssert.assertTrue(headerTest.TestSoftwareLink());

		driver.get(readConfig.getBaseURL()); 
		extentTest.info("navigate to home url");
		softAssert.assertTrue(headerTest.TestWorkingTogetherLink());

		driver.get(readConfig.getBaseURL()); 
		extentTest.info("navigate to home url");
		softAssert.assertTrue(headerTest.TestCaseStudiesLink());


		driver.get(readConfig.getBaseURL()); 
		extentTest.info("navigate to home url");
		softAssert.assertTrue(headerTest.TestCareerLink());
		
		driver.get(readConfig.getBaseURL()); 
		extentTest.info("navigate to home url");
		softAssert.assertTrue(headerTest.TestCompanyLink());
		
		driver.get(readConfig.getBaseURL()); 
		extentTest.info("navigate to home url");
		softAssert.assertTrue(headerTest.TestTeamLink());
		
		driver.get(readConfig.getBaseURL()); 
		extentTest.info("navigate to home url");
		softAssert.assertTrue(headerTest.TestKnowHowLink());

		softAssert.assertAll();
	}

	/**
	 * Test navigation bar links  
	 * 
	 */
	@Test(testName="Test home page title", groups={"Smoke", "Sanity", "Regression"})
	public void testHomePageCoverTitle() {
		
		Log.startTestCase("verify home page cover title");
		driver.get(readConfig.getBaseURL());
		extentTest.info("navigate to home url");	
		
		Home home = new Home();
		String title = home.getCoverTitle();
		if(title.equals("A leading software to automate your client processes")) {
			extentTest.pass("correct cover title");
			Log.info("correct cover title");
		} else {
			extentTest.fail("incorrect cover title");
			Log.info("incorrect cover title");
		}
		
		softAssert.assertEquals(title, "A leading software to automate your client processes");
		softAssert.assertAll();
		
		
	}
	
	/**
	 * Test video  
	 * 
	 */
	@Test(testName="Test home page video playing", groups={"Smoke", "Sanity", "Regression"})
	public void testHomePageVideo() {
		
		SoftAssert softAssert = new SoftAssert();
		
		Log.startTestCase("verify home page video");
		driver.get(readConfig.getBaseURL());
		extentTest.info("navigate to home url");	
		
		Home home = new Home();
		boolean result = home.getVideo(5000);
		
		softAssert.assertFalse(result);
		softAssert.assertAll();
	}
	
	/**
	 * Test video  
	 * 
	 */
	@Test(testName="Test home page client on boarding for SwissNeobank link", groups={"Smoke", "Sanity", "Regression"})
	public void testHomePageClientOnboardingForSwissNeobankLink() {
		
		SoftAssert softAssert = new SoftAssert();
		
		Log.startTestCase("verify home page client on boarding for SwissNeobank link");
		driver.get(readConfig.getBaseURL());
		extentTest.info("navigate to home url");	
		
		Home home = new Home();
		ClientOnboardingForSwissNeobank clientOnboardingForSwissNeobank = home.testCaseStudySelfOnboardingNeobankLink();
		
		if(clientOnboardingForSwissNeobank.getTitle().equals("Atfinity - Client Onboarding for Swiss Neobank")) {
			softAssert.assertEquals(clientOnboardingForSwissNeobank.getTitle(), "Atfinity - Client Onboarding for Swiss Neobank");
			extentTest.pass("redirecting to the Client Onboarding for Swiss Neobank page successful");
			Log.info("redirecting to the Client Onboarding for Swiss Neobank page successful");
		} else {
			extentTest.fail("redirecting to the Client Onboarding for Swiss Neobank page unsuccessful");
			Log.info("redirecting to the Client Onboarding for Swiss Neobank page unsuccessful");
		}
	
		softAssert.assertAll();
	}
}
