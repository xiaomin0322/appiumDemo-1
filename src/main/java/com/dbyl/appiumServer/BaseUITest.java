package main.java.com.dbyl.appiumServer;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import main.java.com.dbyl.appiumCore.utils.AppiumBaseExecutor;

public class BaseUITest extends AppiumBaseExecutor
{

    public BaseUITest(AppiumDriver<WebElement> driver)
    {
        super(driver);
    }

    public void start() throws InterruptedException
    {
        AppiumServerUtils.startServer("127.0.0.1", 4723);
    }

    public void stop() throws InterruptedException
    {
        AppiumServerUtils.stopServer();
    }

}