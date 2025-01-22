package testNG.dataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
    @Test(dataProvider = "testLogin", dataProviderClass = CustomDataProviderTest.class)
    public void verifyLogin(String Username,String Password)
    {
        System.out.println("Login with "+ Username + " "+ Password);
    }
}
