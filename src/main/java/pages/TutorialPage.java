package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class TutorialPage extends Capabilities {
    public static WebElement getTutorialText(String text){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='"+ text +"']"));
    }

    public static WebElement getStartTestButton(){
        return androidDriver.findElement(By.xpath("//android.widget.Button[@text='Start test']"));
    }




}
