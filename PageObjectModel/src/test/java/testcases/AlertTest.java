package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.AlertPage;

public class AlertTest extends  BaseClass{

	
AlertPage alertpage;

@Test
public void verifyAutoSuccessButtonIsEnabled()
{
	alertpage = new AlertPage(driver);		//run time polymorphism. Invoking constructor of page class
	alertpage.clickOnAlertLink();
	Assert.assertTrue(alertpage.isAutoSuccessButtonEnabled());
	
}
	
	
}
