package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class TrackPage extends Capabilities {
    public static WebElement getTrackList(String track){
        track = track.replaceAll("\\s+", "_").toLowerCase();
        return androidDriver.findElement(By.xpath("//*[@resource-id='radio" + track + "']"));
    }
    public static WebElement getContinueButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Continue']"));
    }

    public static WebElement getPlayPauseButton(String track){
        track = track.replaceAll("\\s+", "_").toLowerCase();
        return androidDriver.findElement(By.xpath("//*[@resource-id='radio"+ track+ "']/following-sibling::android.widget.Button"));
    }

//*[@resource-id="radiocymatics"]



}
