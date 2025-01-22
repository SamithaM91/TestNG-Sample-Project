package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest_1 {

    @Test
    @Parameters({"value1","value2"})
    public void Sum(int a, int b)
    {
        int finalSum = a+ b;
        System.out.println("Sum is " +finalSum);
    }
}
