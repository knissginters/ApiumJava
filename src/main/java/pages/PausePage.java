package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class PausePage  extends Capabilities {

    public static WebElement getPauseHeader(){
        return androidDriver.findElement(By.xpath("//android.view.View[@text = 'Paused']"));
    }

    public static WebElement getQuitAndRestartButton(){
        return androidDriver.findElement(By.xpath("//android.view.View[contains(@text, 'Quit and restart')]"));
    }

    public static WebElement getResumeButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text ='Resume']"));
    }
}
