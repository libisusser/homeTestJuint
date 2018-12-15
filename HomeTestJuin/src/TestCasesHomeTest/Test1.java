package TestCasesHomeTest;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import org.junit.experimental.ParallelComputer;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.Before;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.xml.sax.SAXException;

import UtilitesHomeTest.base;
import UtilitesHomeTest.commonOps;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;;

public class Test1 extends base

{
	
	@Test
	public void test01_firstFlow() throws InterruptedException, AWTException, ParserConfigurationException, SAXException, IOException

	{
		
				
		commonOps.clickOrChose(HP.serachField, "serachField");
		commonOps.insertText(HP.serachField, "selenuim", "serachField");
		commonOps.clickOrChose(HP.searchTerm, "searchTerm");
		commonOps.clickOrChose(RP.searchCountry, "searchCountry");
		commonOps.insertText(RP.searchCountryText, "Israel", "searchCountryText");
		commonOps.clickOrChose(RP.searchTermCountry, "searchTermCountry");
		commonOps.scroll(); //for the screen shot for the report
		commonOps.assertTextInList(RP.subregionsList, "Tel Aviv", CP.relatedQueries, "Hmm, your search doesn't have enough data to show here.");
	
	


	
}
}



