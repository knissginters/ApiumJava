package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class EnvironmentSettingsPage extends Capabilities {


    public static WebElement getOpenSoundidDefaultThemeButton(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkapp:id/btn_open_soundid_default"));
    }
    public static WebElement getLanguageButtonENG(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkapp:id/btn_set_language_en"));
    }
    public static WebElement getLanguageButtonCN(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkapp:id/btn_set_language_zh_hant"));
    }
    public static WebElement getLanguageButtonSimpleCN(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkapp:id/btn_set_language_zh_hans"));
    }
    public static WebElement getServerSTAGING(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkdemo:id/btn_region_staging"));
    }
    public static WebElement getDeviceMockButton(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkapp:id/btn_device_mock"));
    }
    public static WebElement getServerUSA(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkdemo:id/btn_region_usa"));
    }
    public static WebElement getServerCHNA(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkdemo:id/btn_region_china"));
    }

    public static WebElement getConnectionModeButton(){
        return androidDriver.findElement(By.id("com.sonarworks.soundid.sdkapp:id/btn_connection_mode"));
    }


}
