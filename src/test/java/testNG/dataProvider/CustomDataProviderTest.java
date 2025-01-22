package testNG.dataProvider;

import org.testng.annotations.DataProvider;

public class CustomDataProviderTest {
    @DataProvider
    public Object[][] testLogin()
    {
        Object[][] loginDetails ={
                {"abc@gmail.com","abc123"},{"def@gmail.com","def123"},{"ghi@gmail.com","ghi123"}
        };
        return loginDetails;
    }
}
