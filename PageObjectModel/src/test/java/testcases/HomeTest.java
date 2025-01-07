package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass{

HomePage homepage; 
	
@Test	
public void verifyLogo()	
{	
	homepage = new HomePage(driver);				//run time polymorphism. Invoking constructor of page class
	Assert.assertTrue(homepage.isLogoDisplayed());
}
	
}
