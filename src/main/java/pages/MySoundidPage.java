package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class MySoundidPage extends Capabilities {

    public static WebElement getCreateSoundidButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Create SoundID profile']"));
    }

    public static WebElement getNoSoundidProfileTetBanner(){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='No SoundID profile yet']"));
    }



}
