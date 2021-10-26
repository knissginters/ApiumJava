package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class MySoundidPage extends Capabilities {

    public static WebElement getCreateSoundidButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Create SoundID profile']"));
    }

    public static WebElement getNoSoundidProfileYetBanner(){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='No SoundID profile yet']"));
    }

    public static WebElement getSoundIdToggle(){
        return androidDriver.findElement(By.id("soundIdToggle-container"));
    }

    public static WebElement getUploadingSpinner(){
        return androidDriver.findElement(By.id("spin"));
    }

    public static WebElement getUploadingBanner(){
        return androidDriver.findElement(By.xpath("//android.view.View[contains(@text, 'Uploading profile...000')]"));
    }

    public static WebElement getProfileUploadEarbudName(){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='1MORE ColorBuds 2']"));
    }

    public static WebElement getSoundIdToggleState(String state){
        return androidDriver.findElement(By.xpath("//android.view.View[@resource-id='root']/android.view.View[@text='" + state + "']"));
    }









}
