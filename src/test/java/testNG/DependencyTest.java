package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest {

    @Test(alwaysRun = true)
    void login()

    {
        System.out.println("LOGIN");
        Assert.assertEquals(1,1);
    }

    @Test(dependsOnMethods = {"login","dashboard"})
    void createUser()
    {
        System.out.println("Create User");

    }

    @Test(dependsOnMethods = "login")
    void dashboard()
    {
        System.out.println("Dashboard");
    }
}
