package testNG.annotationsExecutionOrder;

import org.testng.annotations.*;

public class AnnotationsExecutionTest {

    @BeforeSuite
    public void beforeSuit()
    {
        System.out.println("Before Suit");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test");
    }

    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method");
    }

    @Test(priority = 1)
    public void TestMethod_02() {
        System.out.println("Test Case 02");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class");

    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method");
    }

    @Test(priority = 2)
    public void TestMethod_01()
    {
        System.out.println("Test Case 01");
    }

    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test");
    }

    @AfterSuite
    public void afterSuit()
    {
        System.out.println("After Suit");
    }
}
