package testNG.parallelExecution;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MethodParallelExecutionTest {

    @Test(priority = 1)
    public void test_01()
    {
        System.out.println("Open google");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }

    @Test(priority = 2)
    public void test_02()
    {
        System.out.println("Open Bing");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bing.com/");
        driver.quit();
    }
}
