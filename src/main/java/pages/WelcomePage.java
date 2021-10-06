package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class WelcomePage extends Capabilities {

    public static WebElement getGetStartedButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Get started']"));
    }
    public static WebElement getWelcomeText(){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='Let's personalize the sound of your 1MORE']"));
    }
}
