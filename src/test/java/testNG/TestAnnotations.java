package testNG;

import org.testng.annotations.Test;

public class TestAnnotations {

    @Test(priority = 1)
    void setUp()
    {
        System.out.println("Set up");
    }

   @Test(priority = 2)
    void login()
    {
        System.out.println("Login");
    }

}
