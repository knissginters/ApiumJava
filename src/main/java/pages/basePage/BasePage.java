package pages.basePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setups.Capabilities;

import java.util.concurrent.TimeUnit;

public class BasePage extends Capabilities {
    public static WebElement getFadeInError(){
        return androidDriver.findElement(By.xpath("//android.view.View[@resource-id='fade-in']/android.view.View"));
    }

    public static WebElement getExitButton(){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='SoundID']/following-sibling::android.view.View[1]"));
    }

    public static WebElement getBackButton(){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='SoundID']/preceding-sibling::android.view.View[1]"));
    }

    public static WebElement getDescription(String description){
        return androidDriver.findElement(By.xpath("//android.view.View[@text='" + description + "']"));
    }

    public static void waitUntilErrorAppears(String desiredErrorMessage) {
        String errorMessage = getFadeInError().getText();
            while (!errorMessage.equals(desiredErrorMessage)) {
                errorMessage = getFadeInError().getText();
                //Allure.addAttachment("Console log: ",errorMessage);
                androidDriver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
            }
    }
}
