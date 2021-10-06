package pages.basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class Errors extends Capabilities {
    public static WebElement getHeadphonesNotFoundError(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkdemo:id/btn_open_soundid"));
    }


}
