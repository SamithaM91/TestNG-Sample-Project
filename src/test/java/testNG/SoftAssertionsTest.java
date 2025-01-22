package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionsTest {

    SoftAssert softAssert = new SoftAssert();
    String actualValue = "Dasun";

    @Test(priority = 1)
    void assertEqualsTest()
    {
        System.out.println("Assert Equals");
        softAssert.assertEquals(actualValue, "Dasun");
        softAssert.assertAll();
    }

    @Test(priority = 2)
    void assertNotEqualsTest()
    {
        System.out.println("Assert NOT Equals");
        softAssert.assertNotEquals(actualValue,"samitha");
        softAssert.assertAll();
    }

    @Test(priority = 3)
    void assertTrueTest()
    {
        System.out.println("Assert True");
        softAssert.assertTrue(actualValue.startsWith("D"),"Condition returns True");
        softAssert.assertAll();
    }

    @Test(priority = 4)
    void assertFalseTest()
    {
        System.out.println("Assert False");
        softAssert.assertFalse(actualValue.startsWith("H"),"Conditions returns False");
        softAssert.assertAll();
    }


}
