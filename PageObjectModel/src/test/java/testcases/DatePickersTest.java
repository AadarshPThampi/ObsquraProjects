package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickersPage;

public class DatePickersTest extends BaseClass{

	
DatePickersPage	datepickerspage ;

@Test
public void verifyClickOnDatePicker()
{
	datepickerspage = new DatePickersPage(driver);
	datepickerspage.clickOnDatePickers();
}
	
@Test
public void verifyShowDateButtonDisplayed()
{
	datepickerspage = new DatePickersPage(driver);	//run time polymorphism. Invoking constructor of page class
	datepickerspage.clickOnDatePickers();
	Assert.assertTrue(datepickerspage.isShowDateButtonDisplayed());
}


}
