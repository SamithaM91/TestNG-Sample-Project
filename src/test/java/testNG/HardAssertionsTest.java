package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionsTest {

    //Hard Assertions

    String actualValue = "Samitha";
  @Test(priority = 1)
  void assertEqualsTest()
  {
      System.out.println("Assert Equals");
      Assert.assertEquals(actualValue, "Samitha");

  }

  @Test(priority = 2)
    void assertNotEqualsTest()
  {
      System.out.println("Assert NOT Equals");
      Assert.assertNotEquals(actualValue,"samitha");
  }

  @Test(priority = 3)
    void assertTrueTest()
  {
      System.out.println("Assert True");
      Assert.assertTrue(actualValue.startsWith("S"),"Condition returns True");

  }

  @Test(priority = 4)
    void assertFalseTest()
  {
      System.out.println("Assert False");
      Assert.assertFalse(actualValue.startsWith("H"),"Conditions returns False");
  }







}
