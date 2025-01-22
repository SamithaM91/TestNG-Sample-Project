package testNG.listeners;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListenerTest.class)
public class ListenersTest {

    @Test
    public void listenerTest1(){
        System.out.println("Test Method 1");
    }

    @Test
    public void listenerTest2(){
        System.out.println("Test Method 2");
        Assert.assertTrue(false,"Failed");
    }

    @Test(timeOut = 1000)
    public void listenerTest3() throws InterruptedException {
        System.out.println("Test Method 3");
        Thread.sleep(2000);
    }

    @Test(dependsOnMethods = "listenerTest3" )
    public void listenerTest4(){
        System.out.println("Test Method 4");
    }
}
