package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class PreferenceTestPage extends Capabilities {
    public static WebElement getPauseButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Pause']"));
    }
    public static WebElement getNoDifferenceButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='No Difference']"));
    }
    public static WebElement getAbButton(){
        return androidDriver.findElement(By.xpath("//*[@resource-id='abToggle']"));
    }
    public static WebElement getDoneIndicator(String percentage){
        return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + percentage + "% done']"));
    }
    public static WebElement getNextStepButton(){
        return androidDriver.findElement(By.xpath("//*[@resource-id='shake']/following::android.widget.Button"));
    }


}
