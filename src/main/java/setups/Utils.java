package setups;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;


import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Utils extends Capabilities{

    public static AndroidDriver.Timeouts Wait(int Seconds) {
        AndroidDriver.Timeouts wait = androidDriver.manage().timeouts().pageLoadTimeout(Seconds, SECONDS);
        return wait;
    }

    public static void setAppToBackground(int Seconds){
       androidDriver.runAppInBackground(Duration.ofSeconds(Seconds));

    }

    //public static setAppToForeground(){
      //  return (AppiumDriver)androidDriver.launchApp();
    //}
}
