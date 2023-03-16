package swiss.atfinity.actiondriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import swiss.atfinity.base.Base;

public class Action extends Base{


	/**
	 * This is a Java method that implements a custom scroll operation to bring a specific WebElement into view on the page. 
	 * 
	 * @param webdriver
	 * @param webelement
	 */
	public void scrollByVisibilityOfElement(WebDriver driver, WebElement ele) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
	}

	/**
	 * This method can be useful in situations where the click method on a WebElement is not working as expected, 
	 * or when you need to perform additional operations such as mouse movements before clicking the element. 
	 * 
	 * @param webdriver
	 * @param webelement
	 */
	public void click(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).click().build().perform();
	}

	/**
	 * This method can be useful in situations where mouse hover over webelement
	 * 
	 * @param webdriver
	 * @param webelement
	 */
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
	
	}
	
	/**
	 * This method can be useful in situations where the click method on a WebElement is not working as expected, 
	 * or when you need to perform additional operations such as mouse movements before clicking the element. 
	 * 
	 * @param locatorName
	 * @param text
	 * @return - true/false
	 */
	public boolean findElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			//			Verifying that an element is present on the page
			//			Verifying that an element is not present on the page
			//			Verifying that an element is enabled or disabled
			//			Verifying that an element is visible or hidden
			ele.isDisplayed();
			flag = true;
		} catch(Exception e) {
			e.printStackTrace();
			flag = false;
		}
		finally{
			if(flag) {
				System.out.println(ele.toString() + " " + "Found element");
			}else {
				System.out.println(ele.toString() + " " + "Unable to find");
			}
		}
		return flag;
	}

	/**
	 * This is a Java method that checks if a WebElement is selected or not.  
	 * 
	 * @param locatorName
	 * @param text
	 * @return - true/false
	 */
	public boolean isSelected(WebDriver driver, WebElement ele) {
		boolean flag = false;
		flag = findElement(driver, ele);
		if(flag) {
			//Determine whether this element is selected or not. 
			flag = ele.isSelected();
			if(flag) {
				System.out.println(ele.toString() + " " + "The element is Selected");
			} else {
				System.out.println(ele.toString() + " " + "The element is not Selected");
			}
		} else {
			System.out.println(ele.toString() + " " + "The element is not Selected");
		}
		return flag;
	}

	/**
	 * This is a Java method that checks if a WebElement is enabled or not.  
	 * 
	 * @param locatorName
	 * @param text
	 * @return - true/false
	 */
	public boolean isEnabled(WebDriver driver, WebElement ele) {
		boolean flag = false;		
		flag = findElement(driver, ele);
		if(flag) {
			//Is the element currently enabled or not? This will generally return true for everything but disabled input elements. 
			flag = ele.isEnabled();
			if(flag) {
				System.out.println(ele.toString() + " " + "The element is enabled");
			} else {
				System.out.println(ele.toString() + " " + "The element is not enabled");
			}
		} else {
			System.out.println(ele.toString() + " " + "The element is not enabled");
		}
		return flag;
	}

	/**
	 * This is a Java method that allows you to type text into a WebElement.  
	 * 
	 * @param locatorName
	 * @param text
	 * @return - true/false
	 */
	public boolean typeTextintoTextbox(WebElement ele, String text) {
		boolean flag = false;
		try {
			flag = ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag = true;
		} catch (Exception e) {
			System.out.println("Location Not found");
			flag = false;
		} finally {
			if (flag) {
				System.out.println(ele.toString() + " " + "Successfully entered value");
			} else {
				System.out.println(ele.toString() + " " + "Unable to enter value");
			}

		}
		return flag;

	}

	/**
	 * select value from DropDown by using selectByIndex
	 * 
	 * @param locator     : Action to be performed on element (Get it from Object
	 *                    repository)
	 * 
	 * @param index       : Index of value wish to select from dropdown list.
	 * 
	 * @param locatorName : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 * @return - true/false
	 * 
	 */	
	public boolean selectDropDownByIndex(WebElement ele, int index) {
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByIndex(index);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println(ele.toString() + " " + "Option selected by Index");
			} else {
				System.out.println(ele.toString() + " " + "Option not selected by Index");
			}
		}
	}

	/**
	 * select value from DropDown by using value
	 * 
	 * @param locator     : Action to be performed on element (Get it from Object
	 *                    repository)
	 * 
	 * @param value       : Value wish to select from dropdown list.
	 * 
	 * @param locatorName : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 * @return - true/false
	 */	
	public boolean selectDropDownByValue(WebElement ele,String value) {
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByValue(value);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println(ele.toString() + " " + "Option selected by Value");
			} else {
				System.out.println(ele.toString() + " " + "Option not selected by Value");
			}
		}
	}

	/**
	 * select value from DropDown by using selectByVisibleText
	 * 
	 * @param locator     : Action to be performed on element (Get it from Object
	 *                    repository)
	 * 
	 * @param visibletext : VisibleText wish to select from dropdown list.
	 * 
	 * @param locatorName : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 * @return - true/false
	 */	
	public boolean selectDropDownByVisibleText(String visibletext, WebElement ele) {
		boolean flag = false;
		try {
			Select s = new Select(ele);
			s.selectByVisibleText(visibletext);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println(ele.toString() + " " + "Option selected by VisibleText");
			} else {
				System.out.println(ele.toString() + " " + "Option not selected by VisibleText");
			}
		}
	}

	/**
	 * This code defines a Java method, mouseHoverByJavaScript, which performs a mouse hover event on a given WebElement
	 * 
	 * @param webelement
	 * @return - true/false
	 */	
	public boolean mouseHoverByJavaScript(WebElement ele) {
		boolean flag = false;
		try {
			WebElement mo = ele;
			String javaScript = "var evObj = document.createEvent('MouseEvents');"
					+ "evObj.initMouseEvent(\"mouseover\",true, false, window, 0, 0, 0, 0, 0, "
					+ "false, false, false, false, 0, null);"
					+ "arguments[0].dispatchEvent(evObj);";
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript(javaScript, mo);
			flag = true;
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println(ele.toString() + " " + "MouseOver Action is performed");
			} else {
				System.out.println(ele.toString() + " " + "MouseOver Action is not performed");
			}
		}
	}

	/**
	 * The method tries to click on the WebElement using JavaScriptExecutor
	 * 
	 * @param webelement
	 * @param driver
	 * @return - true/false
	 */	
	public boolean JSClick(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", ele);
			flag = true;

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (flag) {
				System.out.println(ele.toString() + " " + "Click Action is performed");
			} else if (!flag) {
				System.out.println(ele.toString() + " " + "Click Action is not performed");
			}
		}
		return flag;
	}

	/**
	 * The method tries to click on the WebElement using JavaScriptExecutor
	 * 
	 * @param index : Frame index wish to switch
	 * @param driver
	 * @return - true/false
	 */	
	public boolean switchToFrameByIndex(WebDriver driver,int index) {
		boolean flag = false;
		try {
			new WebDriverWait(driver, 15).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe")));
			driver.switchTo().frame(index);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with index \"" + index + "\" is selected");
			} else {
				System.out.println("Frame with index \"" + index + "\" is not selected");
			}
		}
	}

	/**
	 * This method switch the to frame using frame ID.
	 * 
	 * @param driver
	 * @param idValue : Frame ID wish to switch
	 * @return - true/false
	 */	
	public boolean switchToFrameById(WebDriver driver,String idValue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(idValue);
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with Id \"" + idValue + "\" is selected");
			} else {
				System.out.println("Frame with Id \"" + idValue + "\" is not selected");
			}
		}
	}

	/**
	 * This method switch the to frame using frame name.
	 * 
	 * @param driver
	 * @param nameValue : Frame name wish to switch
	 * @return - true/false
	 */	
	public boolean switchToFrameByName(WebDriver driver,String nameValue) {
		boolean flag = false;
		try {
			driver.switchTo().frame(nameValue);
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("Frame with Name \"" + nameValue + "\" is selected");
			} else if (!flag) {
				System.out.println("Frame with Name \"" + nameValue + "\" is not selected");
			}
		}
	}


	/**
	 *  The method switches back to the default content of the WebDriver by calling the switchTo().defaultContent() method.
	 * 
	 * @param driver
	 * @return - true/false
	 */	
	public boolean switchToDefaultFrame(WebDriver driver) {
		boolean flag = false;
		try {
			driver.switchTo().defaultContent();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Switch to default contect");
			} else if (!flag) {
				System.out.println("Switch to default contect");
			}
		}
	}


	/**
	 *  The method switches back to the default content of the WebDriver by calling the switchTo().defaultContent() method.
	 * 
	 * @param driver
	 * @return - true/false
	 */	
	public void mouseOverElement(WebDriver driver,WebElement ele) {
		boolean flag = false;
		try {
			new Actions(driver).moveToElement(ele).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				System.out.println("MouserOver Action is performed on" + " " + ele.toString()  );
			} else {
				System.out.println("MouseOver action is not performed on" + " " + ele.toString());
			}
		}
	}

	/**
	 *  The method switches back to the default content of the WebDriver by calling the switchTo().defaultContent() method.
	 * 
	 * @param driver
	 * @param element : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 * @return - true/false
	 */	
	public boolean moveToElement(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].scrollIntoView(true);", ele);
			Actions actions = new Actions(driver);
			// actions.moveToElement(driver.findElement(locator)).build().perform();
			actions.moveToElement(ele).build().perform();
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	/**
	 *  This code implements a mouseover function
	 * 
	 * @param driver
	 * @param element : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 * @return - true/false
	 */	
	public boolean mouseover(WebDriver driver, WebElement ele) {
		boolean flag = false;
		try {
			new Actions(driver).moveToElement(ele).build().perform();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if(flag) {
				System.out.println("MouserOver Action is performed on" + " " + ele.toString());
			} else {
				System.out.println("MouserOver Action is not performed on" + " " + ele.toString());
			}

		}
	}

	/**
	 *  This code implements a mouse draggable function
	 * 
	 * @param driver
	 * @param element : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)
	 * @param x : x coordinate drag in to
	 * @param y : y coordinate drag in to                  
	 * @return - true/false
	 */	
	public boolean draggable(WebDriver driver,WebElement ele, int x, int y) {
		boolean flag = false;
		try {
			new Actions(driver).dragAndDropBy(ele, x, y).build().perform();
			Thread.sleep(5000);
			flag = true;
			return true;

		} catch (Exception e) {

			return false;

		} finally {
			if (flag) {
				System.out.println("Draggable Action is performed on \""+ele+"\"");			
			} else if(!flag) {
				System.out.println("Draggable action is not performed on \""+ele+"\"");
			}
		}
	}

	/**
	 *  This code implements a mouse drag and drop from one source to another
	 * 
	 * @param driver
	 * @param element : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)           
	 * @return - true/false
	 */	
	public boolean draganddrop(WebDriver driver,WebElement source, WebElement target) {
		boolean flag = false;
		try {
			new Actions(driver).dragAndDrop(source, target).perform();
			flag = true;
			return true;
		} catch (Exception e) {

			return false;
		} finally {
			if (flag) {
				System.out.println("DragAndDrop Action is performed");
			} else if(!flag) {
				System.out.println("DragAndDrop Action is not performed");
			}
		}
	}

	
	/**
	 *  performs a right-click action on a given WebElement using Selenium's Actions class
	 * 
	 * @param driver
	 * @param element : Meaningful name to the element (Ex:Year Dropdown, items
	 *                    Listbox etc..)           
	 * @return - true/false
	 */	
	public boolean rightclick(WebDriver driver,WebElement ele) {
		boolean flag = false;
		try {
			Actions clicker = new Actions(driver);
			clicker.contextClick(ele).perform();
			flag = true;
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("RightClick Action is performed");
			} else {
				System.out.println("RightClick Action is not performed");
			}
		}
	}


	/**
	 * The method switchWindowByTitle is a Java method that switches the focus of the WebDriver to a 
	 * specific window based on the title of the window.
	 * 
	 * @param driver
	 * @param windowTitle 
	 * @param count        
	 * @return - true/false
	 */	
	public boolean switchWindowByTitle(WebDriver driver,String windowTitle, int count) {
		boolean flag = false;
		try {
			Set<String> windowList = driver.getWindowHandles();

			String[] array = windowList.toArray(new String[0]);

			driver.switchTo().window(array[count-1]);

			if (driver.getTitle().contains(windowTitle)){
				flag = true;
			}else{
				flag = false;
			}
			return flag;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		} finally {
			if (flag) {
				System.out.println("Navigated to the window with title");
			} else {
				System.out.println("The Window with title is not Selected");
			}
		}
	}

	/**
	 * This code is a Java function that switches to a new window in a web browser using the WebDriver interface.
	 * 
	 * @param driver    
	 * @return - true/false
	 */	
	public boolean switchToNewWindow(WebDriver driver) {
		boolean flag = false;
		try {

			Set<String> s=driver.getWindowHandles();
			Object popup[]=s.toArray();
			driver.switchTo().window(popup[1].toString());
			flag = true;
			return flag;
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
			return flag;
		} finally {
			if (flag) {
				System.out.println("Window is Navigated with title");				
			} else {
				System.out.println("The Window with title: is not Selected");
			}
		}
	}

	/**
	 * This code is a Java function that switches to a old window in a web browser using the WebDriver interface.
	 * 
	 * @param driver    
	 * @return - true/false
	 */	
	public boolean switchToOldWindow(WebDriver driver) {
		boolean flag = false;
		try {

			Set<String> s=driver.getWindowHandles();
			Object popup[]=s.toArray();
			driver.switchTo().window(popup[0].toString());
			flag = true;
			return flag;
		} catch (Exception e) {
			flag = false;
			return flag;
		} finally {
			if (flag) {
				System.out.println("Focus navigated to the window with title");			
			} else {
				System.out.println("The Window with title: is not Selected");
			}
		}
	}

	/**
	 * This code is a Java function that returns the number of columns in a table row (represented by a WebElement).
	 * 
	 * @param row    
	 * @return - integer
	 */	
	public int getColumncount(WebElement row) {
		List<WebElement> columns = row.findElements(By.tagName("td"));
		int a = columns.size();
		System.out.println(columns.size());
		for (WebElement column : columns) {
			System.out.print(column.getText());
			System.out.print("|");
		}
		return a;
	}


	/**
	 * This code is a Java function that returns the number of rows in a table (represented by a WebElement).
	 * 
	 * @param table    
	 * @return - integer
	 */	
	public int getRowCount(WebElement table) {
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		int a = rows.size() - 1;
		return a;
	}


	/**
	 * Verify alert present or not
	 * 
	 * @return: Boolean (True: If alert preset, False: If no alert)
	 * 
	 */
	public boolean Alert(WebDriver driver) {
		boolean presentFlag = false;
		Alert alert = null;

		try {
			// Check the presence of alert
			alert = driver.switchTo().alert();
			// if present consume the alert
			alert.accept();
			presentFlag = true;
		} catch (NoAlertPresentException ex) {
			// Alert present; set the flag

			// Alert not present
			ex.printStackTrace();
		} finally {
			if (!presentFlag) {
				System.out.println("The Alert is handled successfully");		
			} else{
				System.out.println("There was no alert to handle");
			}
		}

		return presentFlag;
	}
	

	/**
	 * This code is a Java function that launches a URL in a web browser using the WebDriver interface.
	 * 
	 * @param driver
	 * @param url
	 * @return: Boolean (True: If alert preset, False: If no alert)
	 * 
	 */
	public boolean launchUrl(WebDriver driver,String url) {
		boolean flag = false;
		try {
			driver.navigate().to(url);
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Successfully launched \""+url+"\"");				
			} else {
				System.out.println("Failed to launch \""+url+"\"");
			}
		}
	}


	/**
	 * This code is a Java function that checks if an alert is present in a web browser using the WebDriver interface.
	 * 
	 * @param driver
	 * @param url
	 * @return: Boolean (True: If alert preset, False: If no alert)
	 * 
	 */
	public boolean isAlertPresent(WebDriver driver) 
	{ 
		try 
		{ 
			driver.switchTo().alert(); 
			return true; 
		}   // try 
		catch (NoAlertPresentException Ex) 
		{ 
			return false; 
		}   // catch 
	}


	/**
	 * This code is a Java function that returns the title of the current web page in a web browser using the WebDriver interface.
	 * 
	 * @param driver
	 * @return: string
	 * 
	 */
	public String getTitle(WebDriver driver) {
		boolean flag = false;

		String text = driver.getTitle();
		if (flag) {
			System.out.println("Title of the page is: \""+text+"\"");
		}
		return text;
	}


	/**
	 * This code is a Java function that returns the url of the current web page in a web browser using the WebDriver interface.
	 * 
	 * @param driver
	 * @return: string
	 * 
	 */
	public String getCurrentURL(WebDriver driver)  {
		boolean flag = false;

		String text = driver.getCurrentUrl();
		if (flag) {
			System.out.println("Current URL is: \""+text+"\"");
		}
		return text;
	}


	/**
	 * This code is a Java function that clicks on a web element using the WebDriver interface.
	 * 
	 * @param locator
	 * @param locatorName
	 * @return: boolean/true or false
	 * 
	 */
	public boolean click1(WebElement locator, String locatorName) {
		boolean flag = false;
		try {
			locator.click();
			flag = true;
			return true;
		} catch (Exception e) {
			return false;
		} finally {
			if (flag) {
				System.out.println("Able to click on \""+locatorName+"\"");
			} else {
				System.out.println("Click Unable to click on \""+locatorName+"\"");
			}
		}

	}

	/**
	 * This is a Java method for implementing Fluent Wait in Selenium WebDriver. 
	 * It waits for an element to be visible on the page for a specified amount of time, before clicking on it.
	 * 
	 * @param driver
	 * @param element
	 * @param timeout : how long going to wait
	 * 
	 * 
	 */
	public void fluentWait(WebDriver driver,WebElement element, int timeOut) {
		Wait<WebDriver> wait = null;
		try {
			wait = new FluentWait<WebDriver>((WebDriver) driver)
					.withTimeout(Duration.ofSeconds(timeOut))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(Exception.class);
			wait.until(ExpectedConditions.visibilityOf(element));
			element.click();
		}catch(Exception e) {
		}
	}
	
	/**
	 * This is a Java method for implementing an implicit wait in Selenium WebDriver. 
	 * It sets the amount of time the driver should wait for a page to load before throwing an exception.
	 * 
	 * @param driver
	 * @param timeout : how long going to wait
	 * 
	 * 
	 */
	public void implicitWait(WebDriver driver, int timeOut) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeOut));
	}

	/**
	 * This is a Java method for implementing an explicit wait in Selenium WebDriver. 
	 * It waits for a specified element to be visible on the page for a specified amount of time, before executing further steps.
	 * 
	 * @param driver
	 * @param element
	 * @param timeout : how long going to wait
	 * 
	 */
	public void explicitWait(WebDriver driver, WebElement element, int timeOut ) {
		/*
		 * WebDriverWait wait = new WebDriverWait(driver,timeOut);
		 * wait.until(ExpectedConditions.visibilityOf(element));
		 */
		try { 
			new WebDriverWait(driver,
					Duration.ofSeconds(timeOut)).until(ExpectedConditions.visibilityOf(element)); 
		}catch(Exception e) { 
			System.out.println("Element not found"); 
		}
	}

	
	/**
	 * This is a Java method for setting the page load timeout in Selenium WebDriver. 
	 * It sets the amount of time the driver should wait for a page to completely load before throwing an exception.
	 * 
	 * @param driver
	 * @param timeout : how long going to wait
	 * 
	 */
	public void pageLoadTimeOut(WebDriver driver, int timeOut) {
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(timeOut));
	}

	/**
	 * This is a Java method for taking a screenshot in Selenium WebDriver. 
	 * It captures a screenshot of the current state of the browser and saves it as a PNG file.
	 * 
	 * @param driver
	 * @param filename
	 * @return string : image path
	 * 
	 */
	public String screenShot(WebDriver driver, String filename) {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\ScreenShots\\" + filename + "_" + dateName + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		// This new path for jenkins
		String newImageString = "http://localhost:8082/job/MyStoreProject/ws/MyStoreProject/ScreenShots/" + filename + "_"
				+ dateName + ".png";
		return newImageString;
	}

	/**
	 * This is a Java method for getting the current time. 
	 * It returns the current date and time as a string in the format "yyyy-MM-dd-hhmmss".
	 * 
	 * @return string : current date time
	 * 
	 */
	public String getCurrentTime() {
		String currentDate = new SimpleDateFormat("yyyy-MM-dd-hhmmss").format(new Date());
		return currentDate;
	}


	public boolean getVideo(WebElement video,int timeOut) {

		// Wait for the video to be present in the DOM
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("video")));

		// Check if the video is playing
		boolean isVideoPlaying = (Boolean) ((JavascriptExecutor) driver)
		    .executeScript("return arguments[0].paused === false;", video);

		if (isVideoPlaying) {
		    System.out.println("Video is playing");
		    return true;
		} else {
		    System.out.println("Video is not playing");
		    return false;
		}
	}
}
