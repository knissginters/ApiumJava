package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class TrackPage extends Capabilities {
    public static WebElement getTrackList(String track){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='" + track + "']"));
    }
    public static WebElement getContinueButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Continue']"));
    }

    public static WebElement getPlayPauseButton(){
        return androidDriver.findElement(By.xpath("//android.view.View[@resource-id='root']//android.widget.Image"));
    }





}
