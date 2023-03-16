package swiss.atfinity.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	public static Properties property;

	public ReadConfig() {

		File src = new File("./Configuration/config.properties");

		try {

			FileInputStream file = new FileInputStream(src);
			property = new Properties();
			property.load(file);

		}
		catch (Exception e) {
			System.out.println("Excetion is" + e.getMessage());
		}
	}
	
	public int getImplicitWait() {

		String implicitWait = property.getProperty("implicitWait");
		return Integer.parseInt(implicitWait);
	}	
	
	public int getPageLoadTimeOut() {

		String pageLoadTimeOut = property.getProperty("pageLoadTimeOut");
		return Integer.parseInt(pageLoadTimeOut);
	}
	
	public String getBaseURL() {

		String url = property.getProperty("url");
		return url;
	}	
	
	public String getWorkTogetherURL() {

		String url = property.getProperty("worktogether");
		return url;
	}	
	
	public String getCaseStudiesURL() {
		String url = property.getProperty("casestudies");
		return url;
	}
	
	public String getCareerURL() {
		String url = property.getProperty("career");
		return url;
	}
	
	public String getCompanyURL() {
		String url = property.getProperty("company");
		return url;
	}
	
	public String getTeamURL() {
		String url = property.getProperty("team");
		return url;
	}
	
	public String getKnowHowURL() {
		String url = property.getProperty("knowhow");
		return url;
	}
	
	public String getDocumentationURL() {
		String url = property.getProperty("documentation");
		return url;
	}
	
	public String getApiDocumentationURL() {
		String url = property.getProperty("apidocumentation");
		return url;
	}
	
	public String getPressandMediaURL() {
		String url = property.getProperty("pressandmedia");
		return url;
	}
	
	public String getImprintURL() {
		String url = property.getProperty("imprint");
		return url;
	}
	
	public String getPrivacyPolicyURL() {
		String url = property.getProperty("privacypolicy");
		return url;
	}
	
}
