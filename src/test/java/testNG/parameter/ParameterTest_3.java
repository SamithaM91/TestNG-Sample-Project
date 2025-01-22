package testNG.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest_3 {

    @Test
    @Parameters("browser")
    public void browserTest(String browser)
    {
        switch(browser) {
            case "chrome":
                System.out.println("Chrome Browser");
                break;
            case "edge":
                System.out.println("Edge Browser");
                break;
            default:
                System.out.println("Firefox Browser");
        }


    }
}
