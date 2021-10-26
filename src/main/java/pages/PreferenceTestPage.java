package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class PreferenceTestPage extends Capabilities {
    public static WebElement getPauseButton(){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='Pause']"));
    }
    public static WebElement getNoDifferenceButton(){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='No Difference']"));
    }
    public static WebElement getAbButton(){
        return androidDriver.findElement(By.xpath("//android.view.View[@resource-id='abToggle-container']"));
    }
    public static WebElement getDoneIndicator(String percentage){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='" + percentage + "% done']"));
    }
    public static WebElement getNextStepButton(){
        return androidDriver.findElement(By.xpath("//android.view.View[@resource-id='root']/android.widget.Button[2]"));
    }


}
