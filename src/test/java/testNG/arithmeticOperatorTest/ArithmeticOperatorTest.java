package testNG.arithmeticOperatorTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import simpleCalculator.ArithmeticOperator;

public class ArithmeticOperatorTest {

    @Test(dataProvider = "numbers",dataProviderClass = ArithmeticOperatorDataProviderTest.class)
    public void Calclator(int val1, int val2, int result){
        Assert.assertEquals(ArithmeticOperator.Sum(val1,val2),result,"Failed to Calculate Sum");
        System.out.println("Sum is"+ " "+ result);
    }
}

