package dataprovider;

import org.testng.annotations.DataProvider;

public class RegisterData {

	@DataProvider
	public String[][] registerUser()
	{
		String user[][] = {
							{"K Lokesh","Rahul", "klr23@gmail.com", "klr456@","klr456@"},
							{"Virat","Kohli", "vki3@gmail.com", "kohli777V","kohli777V"},
							{"Rohith","Sharma", "rs555@gmail.com", "rs999ss1","rs999ss1"},
							{"Jasprith","Bumra", "bumra999@gmail.com", "bumraSJ8","bumraSJ8"},
						  };
		return user;
	}
}
