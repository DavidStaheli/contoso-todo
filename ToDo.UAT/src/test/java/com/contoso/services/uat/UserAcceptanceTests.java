package com.contoso.services.uat;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

/**
 * Selenium-based User Acceptance Tests
 */
public class UserAcceptanceTests 
    extends TestCase
{
	private String siteUrl;
	private WebDriver driver;
	
    public UserAcceptanceTests( String testName )
    {
        super( testName );
        
        this.driver = new HtmlUnitDriver();
        
        this.siteUrl = System.getenv("DEPLOYMENT_URL");
        if (this.siteUrl == null) {
        	this.siteUrl = "http://localhost:8085/TodoServices";
        }
    }

    public static Test suite()
    {
        return new TestSuite( UserAcceptanceTests.class );
    }

    public void testTitle()
    {
    	this.driver.get(this.siteUrl);
    	String pageTitle = this.driver.getTitle();
    	assertEquals("Your To-do List", pageTitle);
    }
    
    public void testToDoList()
    {
    	driver.get(this.siteUrl);
    	final WebElement table = this.driver.findElement(By.id("todos"));
    	assertNotNull(table);
    }
}
