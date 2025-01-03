package basics;

import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider(name="Electronic Products")	//used to create a data provider
	public Object[][] productSearch()
	{
		return new Object [][] {{"laptop"},{"watch"},{"phone"}};	//sequence of items provided
	}
	
	@DataProvider(name="FB Login Credentials")	
	public Object[][] fbLoginCredentials()
	{
		return new Object [][] {{"usr1","psw1"},{"usr2","psw2"},{"usr3","psw3"}}; //Multidimensional data provider
	}
	
}
