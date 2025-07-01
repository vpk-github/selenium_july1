package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {

	@DataProvider
	public String[][] dataSender()
	{
		String data[][] = {{"adminA1","abc123"}, {"adminA2","def456"}, {"adminA3","jkl789"}};
		return data;
	}

	@DataProvider
	public String[][] loginCredentials()
	{
		String data[][] = {{"admA11","abc123"}, {"admA22","def456"}, {"admA33","jkl789"}};
		return data;
	}

	
	@DataProvider
	public String[][] regDetails()
	{
		String data[][] = {{"adminA1","abc123"}, {"adminA2","def456"}, {"adminA3","jkl789"}};
		return data;
	}

	
}
