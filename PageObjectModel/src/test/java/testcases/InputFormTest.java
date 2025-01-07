package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass{

InputFormPage inputformpage;

String expectedButtonText="Show Message";
String expectedMessage="Your Message : Test Message";

@Test	
public void verifyButtonText()	
{	
	inputformpage = new InputFormPage(driver);	
	inputformpage.clickInputFormLink();
	Assert.assertEquals(inputformpage.getButtonName(), expectedButtonText);
}

@Test
public void verifyReturnMessageText()
{
	inputformpage = new InputFormPage(driver);	//run time polymorphism. Invoking constructor of page class
	inputformpage.clickInputFormLink();
	inputformpage.enterMessage();
	inputformpage.clickShowMessageButton();
	Assert.assertEquals(inputformpage.getResultMessage(), expectedMessage);
}

}
