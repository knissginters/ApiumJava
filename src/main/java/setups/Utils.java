package setups;
import io.appium.java_client.android.AndroidDriver;


import java.time.Duration;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Utils extends Capabilities{


    public static void setAppToBackground(int Seconds){
       androidDriver.runAppInBackground(Duration.ofSeconds(Seconds));

    }

    //public static setAppToForeground(){
      //  return (AppiumDriver)androidDriver.launchApp();
    //}
}
