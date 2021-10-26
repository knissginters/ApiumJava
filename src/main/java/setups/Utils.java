package setups;
import io.appium.java_client.android.AndroidDriver;
import static java.util.concurrent.TimeUnit.SECONDS;

public class Utils extends Capabilities{

    public static AndroidDriver.Timeouts Wait(int Seconds) {
        AndroidDriver.Timeouts wait = androidDriver.manage().timeouts().pageLoadTimeout(Seconds, SECONDS);
        return wait;
    }
}
