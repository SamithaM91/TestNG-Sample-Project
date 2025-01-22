package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest_2 {

    @Test
    @Parameters({"value1","value2"})
    public void Difference(int x, int y)
    {
        int finalValue = x - y;
        System.out.println("Difference is "+ finalValue);
    }
}
