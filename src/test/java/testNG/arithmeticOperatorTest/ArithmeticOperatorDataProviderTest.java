package testNG.arithmeticOperatorTest;

import org.testng.annotations.DataProvider;

public class ArithmeticOperatorDataProviderTest {

    @DataProvider(name = "numbers")
    public Object[][] calculateValues() {
        Object[][] data = {
                {1, 2, 3},
                {5, 4, 9},
                {10, -5, 5},
        };
        return data;
    }
}
