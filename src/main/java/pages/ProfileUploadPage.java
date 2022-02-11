package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static setups.Capabilities.androidDriver;

public class ProfileUploadPage {

    public static WebElement getContinueButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Continue']"));
    }

    public static WebElement getDescription(String description){
        return androidDriver.findElement(By.xpath("//android.widget.TextView[@text='" + description + "']"));
    }
}
