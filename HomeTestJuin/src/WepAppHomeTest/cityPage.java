package WepAppHomeTest;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.xml.sax.SAXException;

import com.relevantcodes.extentreports.LogStatus;

import UtilitesHomeTest.base;

public class cityPage extends base

{
	public WebDriver driver;
	

	
	
	@FindBy(how = How.CSS, using = ("p[class='widget-error-title']"))
	public WebElement relatedQueries ;
	
	
	

	public cityPage(WebDriver driver) 

	{
		this.driver = driver;
	}
	
	
		
		
	}

