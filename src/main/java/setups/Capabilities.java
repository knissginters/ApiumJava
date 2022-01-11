package setups;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.concurrent.TimeUnit;
public class Capabilities extends DesiredCapabilities {
    protected static AndroidDriver androidDriver;
    private AppiumDriverLocalService service;

    protected void preparation() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", getDeviceOsVersion());
        capabilities.setCapability("deviceName", getDeviceName());
        capabilities.setCapability("appPackage", "com.sonarworks.soundid.sdkapp.dev");
        capabilities.setCapability("appActivity", "com.sonarworks.soundid.sdkapp.MainActivity");
        service = AppiumDriverLocalService.buildDefaultService();
        service.start();
        String service_url = service.getUrl().toString();
        System.out.println("Appium Service Address: " + service_url);
        androidDriver = new AndroidDriver(new URL(service_url), capabilities);
        androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        giveLocationPermission();
    }

    public void stopServer() {
        service.stop();
    }

    static String getDeviceName() {
        String deviceName = "";
        String shellCommand = "adb get-serialno"; // For platform use : adb shell getprop ro.build.version.release

        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", shellCommand);
            builder.redirectErrorStream(true);
            Process prc = builder.start();
            BufferedReader output = new BufferedReader(new InputStreamReader(prc.getInputStream()));
            deviceName = output.readLine();
            prc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return deviceName;
    }

    static String getDeviceOsVersion() {
        String deviceName = "";
        String shellCommand = "adb shell getprop ro.build.version.release";

        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", shellCommand);
            builder.redirectErrorStream(true);
            Process prc = builder.start();
            BufferedReader output = new BufferedReader(new InputStreamReader(prc.getInputStream()));
            deviceName = output.readLine();
            prc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return deviceName;
    }

    static void giveLocationPermission() {
        String shellCommand = "adb shell pm grant com.sonarworks.soundid.sdkapp android.permission.ACCESS_FINE_LOCATION";
        try {
            ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", shellCommand);
            builder.redirectErrorStream(true);
            Process prc = builder.start();
            prc.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}