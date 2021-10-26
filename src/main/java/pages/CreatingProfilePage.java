package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

public class CreatingProfilePage extends Capabilities {
    public static WebElement getDoneIndicator(String percentage){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='" + percentage + "% done']"));
    }

}
