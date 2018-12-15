package UtilitesHomeTest;

import org.openqa.selenium.WebElement;
import static org.junit.Assert.fail;
import static org.testng.Assert.assertNotEquals;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.SAXException;

import com.gargoylesoftware.htmlunit.javascript.host.media.webkitMediaStream;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;


import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class commonOps extends base
{
	

	public static void insertText(WebElement elem, String text, String string) throws ParserConfigurationException, SAXException, IOException

	{
		try
		{
			elem.sendKeys(text);
			System.out.println("Text in " + " " + string + " " + "is inserted");
			test.log(LogStatus.PASS, "Text in " + " " + string + " " + "is inserted");
		}

		catch (Exception e)
		{
			System.out.println("Text in " + " " + string + " " + "is not inserted");
			test.log(LogStatus.FAIL, string + " " + "not exist! + see Screen Shot: " + test.addScreenCapture(takeSS()));
			fail (string + " " + "not exist!");
		}

	}

	public static void clickOrChose(WebElement elem, String string) throws ParserConfigurationException, SAXException, IOException

	{
		try
		{

			elem.click();
			System.out.println(string + " " + "is clicked");
			test.log(LogStatus.PASS, string + " " + "is clicked");
		}

		catch (Exception e)
		{
			System.out.println(string + " " + "not clicked!");
			test.log(LogStatus.FAIL, string + " " + "not clicked! + see Screen Shot: " + test.addScreenCapture(takeSS()));
			fail (string + " " + "not clicked!");
		}
	}



	

	public static void scroll() throws IOException, ParserConfigurationException, SAXException
	{
		try
		{
			((JavascriptExecutor) driver).executeScript("scroll(0, 700);");
			test.log(LogStatus.PASS, "Scroll done");	
		}
		catch (Exception e)
		{

			test.log(LogStatus.FAIL, "Scroll is not done , see Screen Shot: " + e.getMessage() + test.addScreenCapture(takeSS()));
			fail("Scroll is not donet");
		}
	}

	

	

	public static void assertTextInList(List<WebElement>elements, String text, WebElement elem1, String wrongValue ) throws ParserConfigurationException, SAXException, IOException
	 
	 /*
	 search if in your list tel aviv Exists.
	 if tel aviv exists, please press on tel aviv district and check if you have Related queries.
	 */

	 {

		    
		List<WebElement> list = elements;
		    for (WebElement elem : list) 
		    {
		    	try {
		    	
		    	if (elem.getText().equals(text)) 
		        {
		    		System.out.println("Text  " + text + "     found in the List");
		    		test.log(LogStatus.PASS, "Text  " + text + "     found in the List");
		    		elem.click();
		    		
			    	try
			    	{
			    		String actual = elem1.getText();
			    		
						assertNotEquals(wrongValue, actual);
			    		System.out.println("Text is OK!");
						test.log(LogStatus.PASS, "Text is OK!");
			    	}
			    	catch (Exception e)
					{
						System.out.println("Text is not OK!" );
						test.log(LogStatus.FAIL, "Text is not OK! + see Screen Shot: "  + test.addScreenCapture(takeSS()));
						fail ("Text is not OK!");
					}
		    		
		    		return;
		    		
		        }
		    	
		    	}
		    	
		    	catch (Exception e)
		    	
		    	{
		    
		    
		    System.out.println("Text  " + text + "    Not found in the List");
		   
		    
		    test.log(LogStatus.FAIL, "Text  " + text + "    Not found in the List" + test.addScreenCapture(takeSS()));
			fail ("Text  " + text + "    Not found in the List");
		}
		    }
	 }

	 
	 
	 
	    	
	    }
	 
	 







