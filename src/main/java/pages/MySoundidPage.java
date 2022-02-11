package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class MySoundidPage extends Capabilities {

    public static WebElement getCreateSoundidButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Create SoundID profile']"));
    }
    public static WebElement getRetakeTestButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[contains(@text, 'Retake test')]"));
    }

    public static WebElement getNoSoundidProfileYetBanner(){
        return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='No SoundID profile yet']"));
    }

    public static WebElement getSoundIdToggleState(){
        return androidDriver.findElement(By.xpath("//*[@resource-id='soundIdToggle']"));
    }
    public static WebElement getToggleTryText(){
        return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Try out personalized sound']"));
    }
    public static WebElement getToggleTutorialText(){
        return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='Listen to some music and use the toggle below to experience the difference']"));
    }







}
