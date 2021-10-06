package setups;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Capabilities extends DesiredCapabilities {
    protected static AndroidDriver androidDriver;
    private AppiumDriverLocalService service;
    protected void preparation() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("deviceName", "R58R23MVDFD");
        capabilities.setCapability("appPackage", "com.sonarworks.soundid.sdkapp");
        capabilities.setCapability("appActivity", "com.sonarworks.soundid.sdkapp.MainActivity");
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();
        System.out.println("Appium Service Address: " + service_url);
        androidDriver = new AndroidDriver(new URL(service_url), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void stopServer() {
        service.stop();
    }
}