package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class LoadingPage extends Capabilities {
    public static WebElement getLoadingSoundIdLogo(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkapp.dev:id/soundid_container_logo"));


    }

}
